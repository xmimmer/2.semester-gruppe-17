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

/**
 * FXML Controller class
 *
 * @author Mimmer
 */
public class StartFXMLController implements Initializable {

    @FXML
    private ListView<String> citizenListView;
    @FXML
    private Button chooseCitizenButton;
    @FXML
    private Button logoutButton;
    @FXML
    private Label checkLabel;

    //Class instances
    DatabaseManager dm = new DatabaseManager();

    public static String citizen;

    //Getters & setters
    public static String getCitizen() {
        return citizen;
    }
    @FXML
    private Button createCitizenButton;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        ObservableList<String> list = FXCollections.observableArrayList();

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Fail to load the jdbc driver.");
        }

        try {
            Connection connection = DriverManager.getConnection(dm.getDatabaseURL(), dm.getDatabaseUsername(), dm.getDatabasePassword());
            System.out.println("Connected!");

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT name FROM citizens WHERE name != 'admin'");

            while (resultSet.next()) {
                list.add(resultSet.getString("name"));

            }
            connection.close();
            resultSet.close();

        } catch (java.sql.SQLException ex) {
            System.out.println(ex.getMessage());

        }

        citizenListView.setItems(list);

    }

    @FXML
    private void chooseCitizenButtonHandler(ActionEvent event) throws IOException {

        String chosenCitizen = citizenListView.getSelectionModel().getSelectedItem();
        citizen = chosenCitizen;

        try {
            if (chosenCitizen.trim().length() > 0) {
                Parent root = FXMLLoader.load(getClass().getResource("/Presentation/ProfileFXML.fxml"));

                Scene scene = new Scene(root);

                //This line gets the Stage information
                Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

                window.setScene(scene);
                window.show();
            }

        } catch (RuntimeException ex) {
            checkLabel.setText("Ingen borger valgt.");
        }
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

    @FXML
    private void createCitizenButtonHandler(ActionEvent event) {
        
        
        
    }

}
