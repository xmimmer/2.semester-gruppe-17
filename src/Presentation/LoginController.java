/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import java.io.IOException;
import java.net.URL;
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

/**
 * FXML Controller class
 *
 * @author Mimmer
 */
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

    @FXML
    private void loginButtonHandler(ActionEvent event) throws IOException {
        if (!passwordField.getText().equals(adminPassword) && !usernameField.getText().equals(adminUsername)) {
            checkLabel.setText("Forkert brugernavn/kodeord.");
        } else {

            Parent root = FXMLLoader.load(getClass().getResource("AdminFXML.fxml"));
            Scene scene = new Scene(root);

            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

            window.setScene(scene);
            window.show();

        }

    }

}
