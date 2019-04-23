package Logic;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

public class AdminController implements Initializable {

    @FXML
    private ListView<String> borgerListView;
    @FXML
    private Label loggedInAsLabel;
    @FXML
    private Button backButton;
    @FXML
    private Button chooseButton;
    @FXML
    private Button logoutButton;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        loggedInAsLabel.setText("Logget ind som: admin");

        File file = new File("borgerliste.txt");
        Scanner sc;

        ObservableList<String> list = FXCollections.observableArrayList();

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Fail to load the jdbc driver.");
        }

        String databaseURL = "jdbc:postgresql://balarama.db.elephantsql.com:5432/beucjfoi";
        String username = "beucjfoi";
        String password = "EXQJyo9fmXNKkqC-CVoGoI2kE9XinAP8";

        try {
            Connection connection = DriverManager.getConnection(databaseURL, username, password);
            System.out.println("Connected!");

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM borgere");
            while (resultSet.next()) {
                list.add(resultSet.getString("navn"));

            }
        } catch (java.sql.SQLException ex) {
            System.out.println(ex.getMessage());
        }
        list.add("Allan Nymark");
        borgerListView.setItems(list);
    }

    @FXML
    private void backButtonHandler(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/Presentation/LoginFXML.fxml"));
        Scene scene = new Scene(root);

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(scene);
        window.show();
    }

    @FXML
    private void chooseButtonHandler(ActionEvent event) throws IOException {
        try {
            String valgtBorger = borgerListView.getSelectionModel().getSelectedItem();

            Parent root = FXMLLoader.load(getClass().getResource("/Presentation/" + valgtBorger + ".fxml"));
            Scene scene = new Scene(root);

            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

            window.setScene(scene);
            window.show();

        } catch (Exception e) {
            System.out.println("Ingen data tilgængelig for denne person.");
        }

    }

    @FXML
    private void logoutButtonHandler(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/Presentation/LoginFXML.fxml"));
        Scene scene = new Scene(root);

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(scene);
        window.show();

    }

}
