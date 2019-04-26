package Logic;

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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController implements Initializable {

    @FXML
    private PasswordField passwordField;
    @FXML
    private TextField usernameField;
    @FXML
    private Button loginButton;
    @FXML
    private Label checkLabel;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    public static String adminUsername = "admin";
    public static String adminPassword = "123";

    public static String citizenUsername;
    public static String citizenPassword;

   /* @FXML
    private void loginButtonHandler(ActionEvent event) throws IOException {
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
            ResultSet resultSet = statement.executeQuery("SELECT * FROM users WHERE email = lower('"+usernameField.getText()+"') AND password = crypt('"+passwordField.getText()+"',password)");
            
            while (resultSet.next()) {
                System.out.println(resultSet.getString("id"));
                System.out.println(resultSet.getString("email"));
                System.out.println(resultSet.getString("password"));
                citizenUsername = resultSet.getString("username");
                citizenPassword = resultSet.getString("password");

                if (passwordField.getText().equals(citizenPassword) && usernameField.getText().equals(citizenUsername)) {

                    Parent root = FXMLLoader.load(getClass().getResource("/Presentation/Citizen.fxml"));
                    Scene scene = new Scene(root);

                    Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

                    window.setScene(scene);
                    window.show();

                } else if (passwordField.getText().equals(adminPassword) && usernameField.getText().equals(adminUsername)) {

                    Parent root = FXMLLoader.load(getClass().getResource("/Presentation/AdminFXML.fxml"));
                    Scene scene = new Scene(root);

                    Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

                    window.setScene(scene);
                    window.show();

                } else {
                    checkLabel.setText("Forkert kodeord/brugernavn.");
                }

            }

        } catch (java.sql.SQLException ex) {
            System.out.println(ex.getMessage());

        }

    }
*/
}
