/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author Mimmer
 */
public class CitizenController implements Initializable {

    @FXML
    private Label nameLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
        
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
            ResultSet resultSet = statement.executeQuery("SELECT * FROM citizens WHERE name = 'Hans Hansen' ");

            while (resultSet.next()) {
               nameLabel.setText(resultSet.getString("name"));

            }
            resultSet.close();

        } catch (java.sql.SQLException ex) {
            System.out.println(ex.getMessage());

        }
        
        
        
        
        
    }    
    
}
