/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Mimmer
 */
public class LoginFXMLController implements Initializable {

    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Button loginButton;
    @FXML
    private Label checkLabel;
    @FXML
    private Button cancelButton;


    public static String validateCPR;

    //Static variables to determine login-status in other controllers.
    public static boolean isAdmin = false;
    public static boolean isCitizen = false;
    public static boolean isRelative = false;

    // Getters & setters
    public static String getValidateCPR() {
        return validateCPR;
    }

    public static boolean getAdminStatus() {
        return isAdmin;
    }

    public static boolean getCitizenStatus() {
        return isCitizen;
    }

    public static boolean getRelativeStatus() {
        return isRelative;
    }

    //Class instances
    DatabaseManager dm = new DatabaseManager();

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    private void loginButtonHandler(ActionEvent event) throws IOException {

        String citizenUsername;
        String citizenPassword;

        String adminUsername;
        String adminPassword;

        String relativeUsername;
        String relativePassword;

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Fail to load the jdbc driver.");
        }

        try {
            Connection connection = DriverManager.getConnection(dm.getDatabaseURL(), dm.getDatabaseUsername(), dm.getDatabasePassword());
            System.out.println("Connected!");

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT name,username,password,CPR FROM citizens WHERE name != 'admin'");
            System.out.println("SELECT name,username,password,CPR FROM citizens WHERE name != 'admin'");
            while (resultSet.next()) {

                citizenUsername = resultSet.getString("username");
                citizenPassword = resultSet.getString("password");
                System.out.println(citizenUsername);
                System.out.println(citizenPassword);
                //Variable to detect which user is logged in.
                validateCPR = resultSet.getString("CPR");
                
                
                
                String loginUserName ;
                String loginPassword ;
            
                 loginUserName = new EncryptClass().encryptString(usernameField.getText());
                 loginPassword = new EncryptClass().encryptString(passwordField.getText());
                 
                 
                 
                if (loginUserName.equals(citizenUsername) && loginPassword.equals(citizenPassword)) {
                

              //  if (usernameField.getText().equals(citizenUsername) && passwordField.getText().equals(citizenPassword)) {

                    isCitizen = true;
                    Parent root = FXMLLoader.load(getClass().getResource("/Presentation/ProfileFXML.fxml"));

                    Scene scene = new Scene(root);

                    //This line gets the Stage information
                    Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

                    window.setScene(scene);
                    window.show();

                    connection.close();
                    resultSet.close();

                } else {
                    checkLabel.setText("Forkert kodeord/brugernavn.");
                 
                  
                   
                    
                }

            }

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
            System.out.println("Connected!");

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT name,username,password FROM citizens WHERE name = 'admin'");

            while (resultSet.next()) {

                adminUsername = resultSet.getString("username");
                adminPassword = resultSet.getString("password");
                
                

                if (usernameField.getText().equals(adminUsername) && passwordField.getText().equals(adminPassword)) {

                    isAdmin = true;
                    Parent game = FXMLLoader.load(getClass().getResource("/Presentation/StartFXML.fxml"));
                    Scene gameScene = new Scene(game);

                    //This line gets the Stage information
                    Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

                    window.setScene(gameScene);
                    window.show();

                    connection.close();
                    resultSet.close();

                } else {
                    checkLabel.setText("Forkert kodeord/brugernavn.");
                    
                    
                    
                }

            }

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
            System.out.println("Connected!");

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT CPR,username,password FROM relatives");

            while (resultSet.next()) {

                relativeUsername = resultSet.getString("username");
                relativePassword = resultSet.getString("password");

                //Variable to detect which user is logged in.
                validateCPR = resultSet.getString("CPR");

                if (usernameField.getText().equals(relativeUsername) && passwordField.getText().equals(relativePassword)) {

                    isRelative = true;
                    Parent root = FXMLLoader.load(getClass().getResource("/Presentation/ProfileFXML.fxml"));

                    Scene scene = new Scene(root);

                    //This line gets the Stage information
                    Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

                    window.setScene(scene);
                    window.show();

                    connection.close();
                    resultSet.close();

                } else {
                    checkLabel.setText("Forkert kodeord/brugernavn.");
                    usernameField.setText("");
                    passwordField.setText("");
                 
                }

            }

        } catch (java.sql.SQLException ex) {
            System.out.println(ex.getMessage());

        }

    }
    
    @FXML
    
    public void cancelButtonHandler(ActionEvent event){
   
       Stage stage = (Stage) cancelButton.getScene().getWindow();
       stage.close();
    
    }

}
