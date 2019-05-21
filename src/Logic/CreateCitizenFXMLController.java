package Logic;

import Data.DatabaseManager;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
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
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Mimmer
 */
public class CreateCitizenFXMLController implements Initializable {

    @FXML
    private TextField nameTextField;
    @FXML
    private TextField cprTextField;
    @FXML
    private TextField depTextField;
    @FXML
    private Button saveButton;
    @FXML
    private TextField ageTextField;
    @FXML
    private TextField usernameTextField;
    @FXML
    private TextField passwordTextField;
    @FXML
    private Label warningLabel;
    @FXML
    private Button backButton;
    @FXML
    private Button logoutButton;

    //Class instances
    DatabaseManager dm = new DatabaseManager();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void saveButtonHandler(ActionEvent event) throws IOException {

        String encryptedPassword = new EncryptClass().encryptString(passwordTextField.getText());

        if (nameTextField.getText().trim().length() != 0
                && ageTextField.getText().trim().length() != 0
                && cprTextField.getText().trim().length() != 0
                && depTextField.getText().trim().length() != 0
                && usernameTextField.getText().trim().length() != 0
                && passwordTextField.getText().trim().length() != 0) {

            try {
                Class.forName("org.postgresql.Driver");
            } catch (ClassNotFoundException ex) {
                System.out.println("Fail to load the jdbc driver.");
            }

            try {
                Connection connection = DriverManager.getConnection(dm.getDatabaseURL(), dm.getDatabaseUsername(), dm.getDatabasePassword());
                System.out.println("Connected to first database!");

                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("INSERT INTO citizens (name,age,CPR,department,username,password) VALUES ('"
                        + nameTextField.getText() + "',"
                        + "'" + ageTextField.getText() + "',"
                        + "'" + cprTextField.getText() + "',"
                        + "'" + depTextField.getText() + "',"
                        + "'" + usernameTextField.getText() + "',"
                        + "'" + encryptedPassword + "')");

                connection.close();
                resultSet.close();

            } catch (java.sql.SQLException ex) {
                System.out.println(ex.getMessage());

            }
            try {
                Class.forName("org.postgresql.Driver");
            } catch (ClassNotFoundException ex) {
                System.out.println("Fail to load the jdbc driver.");
            }

            try {
                Connection connection = DriverManager.getConnection(dm.getDatabaseURL(), dm.getDatabaseUsername(), dm.getDatabasePassword());
                System.out.println("Connected to first database!");

                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("INSERT INTO relatives (name,CPR,username,password) VALUES ('" + nameTextField.getText() + "','" + cprTextField.getText() + "',"
                        + "'" + usernameTextField.getText() + "pår" + "',"
                        + "'" + passwordTextField.getText() + "pår" + "')");

                connection.close();
                resultSet.close();

            } catch (java.sql.SQLException ex) {
                System.out.println(ex.getMessage());

            }
            try {
                Class.forName("org.postgresql.Driver");
            } catch (ClassNotFoundException ex) {
                System.out.println("Fail to load the jdbc driver.");
            }

            try {
                Connection connection = DriverManager.getConnection(dm.getSecondDatabaseURL(), dm.getSecondDatabaseUsername(), dm.getSecondDatabasePassword());
                System.out.println("Connected to second database!");

                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("INSERT INTO diary (cpr,name) VALUES ('" + cprTextField.getText() + "',"
                        + "'" + nameTextField.getText() + "')");

                connection.close();
                resultSet.close();

            } catch (java.sql.SQLException ex) {
                System.out.println(ex.getMessage());

            }

            Parent root = FXMLLoader.load(getClass().getResource("/Presentation/StartFXML.fxml"));

            Scene scene = new Scene(root);

            //This line gets the Stage information
            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

            window.setScene(scene);
            window.show();

        } else {
            warningLabel.setText("Ikke alle felter er udfyldt.");
        }
    }

    @FXML
    private void backButtonHandler(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/Presentation/StartFXML.fxml"));

        Scene scene = new Scene(root);

        //This line gets the Stage information
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(scene);
        window.show();

    }

    @FXML
    private void logoutButtonHandler(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/Presentation/LoginFXML.fxml"));

        Scene scene = new Scene(root);

        //This line gets the Stage information
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(scene);
        window.show();

    }

}
