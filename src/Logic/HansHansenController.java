package Logic;

import java.io.File;
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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class HansHansenController implements Initializable {

    @FXML
    private Label nameLabel;
    @FXML
    private Button schemaButton;
    @FXML
    private Button backButton;
    @FXML
    private ImageView photo;
    @FXML
    private Label ageLabel;
    @FXML
    private Label depLabel;
    @FXML
    private Label cprLabel;
    @FXML
    private Label diaryLabel;
    @FXML
    private TextArea diaryTextField;
    @FXML
    private TextField ageTextField;
    @FXML
    private TextField depTextField;
    @FXML
    private TextField cprTextField;
    @FXML
    private AnchorPane anchorPane1;
    private AnchorPane anchorPane2;
    @FXML
    private Button backButton1;
    @FXML
    private Pane pane1;
    @FXML
    private Pane pane2;    
    @FXML
    private ImageView iv1;
    @FXML
    private ImageView iv2;
    @FXML
    private ImageView iv3;
    @FXML
    private ImageView iv4;
    @FXML
    private Button createSchemaButton;
    @FXML
    private Button deleteSchemaButton;
    @FXML
    private Button showSchemaButton;
    
    private Image image;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        image = new Image(new File("man.png").toURI().toString());
        photo.setImage(image);
    }

    @FXML
    private void schemaButtonHandler(ActionEvent event) {

        pane1.setVisible(false);
        pane2.setVisible(true);

        //Aktiver skemaer mm....
        iv1.setImage(image);
        iv2.setImage(image);
        iv3.setImage(image);
        iv4.setImage(image);

    }

    @FXML
    private void backButtonHandler(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/Presentation/AdminFXML.fxml"));
        Scene scene = new Scene(root);

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(scene);
        window.show();
    }

    @FXML
    private void backButton1Handler(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/Presentation/Hans Hansen.fxml"));
        Scene scene = new Scene(root);

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(scene);
        window.show();

    }

    @FXML
    private void createSchemaButtonHandler(ActionEvent event) {
        //TO DO 
    }

    @FXML
    private void deleteSchemaButtonHandler(ActionEvent event) {

        // TO DO 
    }

    @FXML
    private void showSchemaButtonHandler(ActionEvent event) {
        // TO DO 
    }

}
