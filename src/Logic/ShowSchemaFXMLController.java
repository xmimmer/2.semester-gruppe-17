/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import Data.DatabaseManager;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javax.imageio.ImageIO;

/**
 * FXML Controller class
 *
 * @author Mimmer
 */
public class ShowSchemaFXMLController implements Initializable {

    @FXML
    private  ImageView gridPaneImageView;
    @FXML
    private Button backButton;
    @FXML
    private Button logoutButton;
    CreateSchemaFXMLController cs = new CreateSchemaFXMLController();
    

    //Class instances
    DatabaseManager dm = new DatabaseManager();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
          gridPaneImageView.setImage(cs.getImage());
          

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Fail to load the jdbc driver.");
        }

        try {
            Connection connection = DriverManager.getConnection(dm.getDatabaseURL(), dm.getDatabaseUsername(), dm.getDatabasePassword());
            System.out.println("Connected!");

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT image FROM citizens WHERE name ='" + StartFXMLController.getCitizen() + "'");
            resultSet = statement.getResultSet();
            // bytes = resultSet.getBinaryStream("img");
            byte[] imgBytes;

            imgBytes = resultSet.getBytes("img");

            ByteArrayInputStream bos = new ByteArrayInputStream(imgBytes);
            BufferedImage bImage = ImageIO.read(bos);
            Image img1 = SwingFXUtils.toFXImage(bImage, null);

            resultSet.close();
        } catch (SQLException ex) {

        } catch (IOException ex) {
            Logger.getLogger(ShowSchemaFXMLController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    public ImageView getImageView(){
    
    return gridPaneImageView;
    }
    public void SetImageView(){
    
    gridPaneImageView.setImage(null);
    }

    @FXML
    private void backButtonHandler(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/Presentation/SchemaFXML.fxml"));

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
