package Logic;

import Data.DatabaseManager;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Mimmer
 */
public class SchemaFXMLController implements Initializable {

    @FXML
    private Button createSchemaButton;
    @FXML
    private Button backButton;
    @FXML
    private Button showSchemaButton;
    @FXML
    private Button deleteSchemaButton;
    @FXML
    private Button logoutButton;
    @FXML
    private Label loggedInAsLabel;

    //Class instances
    DatabaseManager dm = new DatabaseManager();

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        if (LoginFXMLController.isAdmin) {
            loggedInAsLabel.setText("Logget ind som admin for: " + StartFXMLController.getCitizen());
        } else if (LoginFXMLController.isCitizen) {
            loggedInAsLabel.setText("Logget ind som: " + ProfileFXMLController.getCitizen());
            deleteSchemaButton.setVisible(false);
            createSchemaButton.setVisible(false);
        }

    }

    @FXML
    private void createSchemaButtonHandler(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/Presentation/CreateSchemaFXML.fxml"));

        Scene scene = new Scene(root);

        //This line gets the Stage information
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(scene);
        window.show();
    }

    @FXML
    private void showSchemaButtonHandler(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/Presentation/ShowSchemaFXML.fxml"));

        Scene scene = new Scene(root);

        //This line gets the Stage information
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(scene);
        window.show();
    }

    @FXML
    private void deleteSchemaButtonHandler(ActionEvent event) {

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Fail to load the jdbc driver.");
        }

        try {
            Connection connection = DriverManager.getConnection(dm.getDatabaseURL(), dm.getDatabaseUsername(), dm.getDatabasePassword());
            System.out.println("Connected!");

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("UPDATE citizens SET img = '" + "No image found." + "' WHERE name = '" + StartFXMLController.getCitizen() + "'");
            resultSet = statement.getResultSet();
            // bytes = resultSet.getBinaryStream("img");

            resultSet.close();
        } catch (SQLException ex) {

        }

    }

    @FXML
    private void backButtonHandler(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/Presentation/ProfileFXML.fxml"));

        Scene scene = new Scene(root);

        //This line gets the Stage information
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(scene);
        window.show();

    }

    @FXML
    private void logoutButtonHandler(ActionEvent event) throws IOException {

        LoginFXMLController.isAdmin = false;
        LoginFXMLController.isCitizen = false;

        Parent root = FXMLLoader.load(getClass().getResource("/Presentation/LoginFXML.fxml"));

        Scene scene = new Scene(root);

        //This line gets the Stage information
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(scene);
        window.show();
    }

}
