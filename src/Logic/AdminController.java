package Logic;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;
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
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class AdminController implements Initializable {

    @FXML
    private ListView<String> borgerListView;

    @FXML
    private Button chooseButton;
    @FXML
    private Button logoutButton;
    @FXML
    private AnchorPane anchorPane;
    @FXML
    private Pane startPane;
    @FXML
    private Pane borgerPane;
    @FXML
    private TextField depTextField;
    @FXML
    private TextField ageTextField;
    @FXML
    private Label nameLabel;
    @FXML
    private TextField cprTextField;
    @FXML
    private Button backButton1;
    @FXML
    private Label loggedInAsLabel1;
    @FXML
    private Label loggedInAsLabel2;
    @FXML
    private ImageView photo;
    @FXML
    private Label messageLabel;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        loggedInAsLabel1.setText("Logget ind som: admin");
        loggedInAsLabel2.setText("Logget ind som: admin");
        //File file = new File("borgerliste.txt");
        // Scanner sc;
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
            ResultSet resultSet = statement.executeQuery("SELECT * FROM citizens");
            while (resultSet.next()) {
                list.add(resultSet.getString("name"));

            }
        } catch (java.sql.SQLException ex) {
            System.out.println(ex.getMessage());
        }

        borgerListView.setItems(list);
    }

    @FXML
    private void chooseButtonHandler(ActionEvent event) throws IOException {

        try {
            String valgtBorger = borgerListView.getSelectionModel().getSelectedItem();
            if (valgtBorger.trim().length() > 0) {

                startPane.setVisible(false);
                borgerPane.setVisible(true);

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
                    ResultSet resultSet = statement.executeQuery("SELECT name,age,department,CPR FROM citizens WHERE name ='" + valgtBorger + "'");
                    while (resultSet.next()) {
                        nameLabel.setText(resultSet.getString("name"));
                        ageTextField.setText(resultSet.getString("age"));
                        depTextField.setText(resultSet.getString("department"));
                        cprTextField.setText(resultSet.getString("CPR"));

                    }
                } catch (java.sql.SQLException ex) {
                    System.out.println(ex.getMessage());
                }

            }
        } catch (Exception e) {
            messageLabel.setText("Ingen borger valgt.");
        }

    }

    @FXML
    private void backButton1Handler(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/Presentation/AdminFXML.fxml"));
        Scene scene = new Scene(root);

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(scene);
        window.show();
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
