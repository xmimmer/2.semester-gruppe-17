/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import Data.DatabaseManager;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

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

    //Class instances
    DatabaseManager dm = new DatabaseManager(); 
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void saveButtonHandler(ActionEvent event) {
        

        
        
        
        
    }
    
}
