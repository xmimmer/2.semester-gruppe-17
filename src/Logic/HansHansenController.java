package Logic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.List;
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
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.AnchorPane;

import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
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
    private Pane pane3;
    
    @FXML
    private ImageView iv1;
    @FXML
    private ImageView iv2;
    @FXML
    private ImageView iv3;
    @FXML
    private ImageView iv4;
    @FXML
    private ImageView iv5;
    @FXML
    private Button createSchemaButton;
    @FXML
    private Button deleteSchemaButton;
    @FXML
    private Button showSchemaButton;
    @FXML
    private ImageView skema;
  
        int curseur = 0;
    private Image image;
    @FXML
    private Pane pane4;
    @FXML
    private Label dragimage;
    @FXML
    private ImageView iv6;
    @FXML
    private Button stdskemabt;
    @FXML
    private Pane pane5;
    @FXML 
    private ImageView iv7;
    private Label lab2;
    @FXML
    private Label lab3;
    @FXML
    private Label lab4;
    

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
        pane2.setVisible(false);
        pane4.setVisible(true);
        dragimage.setText("Træk billed fra filer ind mod midten");
        
        
    }
    
  
   

    @FXML
    private void deleteSchemaButtonHandler(ActionEvent event) {

        // TO DO 
    }

    @FXML
    private void showSchemaButtonHandler(ActionEvent event) {
   
        pane2.setVisible(false);
        pane3.setVisible(true);
        skema.setImage(image);
        
    }
    @FXML
    private void backButton2Handler(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/Presentation/Hans Hansen.fxml"));
        Scene scene = new Scene(root);

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(scene);
        window.show();

    }

    @FXML
    private void handledragover(DragEvent event) {
          if(event.getDragboard().hasFiles()){
            event.acceptTransferModes(TransferMode.MOVE);
            
    }
    }
    @FXML
    private void handledrop(DragEvent event) throws FileNotFoundException {
        List<File> files = event.getDragboard().getFiles();
        image = new Image(new FileInputStream(files.get(0)));
        iv5.setImage(image);
        lab2.setText("Trak std skema til højre felt som onskes.");
    } 

    @FXML
    private void handledragdetected(MouseEvent event) {
        Dragboard db = iv6.startDragAndDrop(TransferMode.ANY);
        ClipboardContent cb = new ClipboardContent();
        cb.putImage(iv6.getImage());
        db.setContent(cb);
        event.consume();
        
        
    }

    @FXML
    private void Opretstdskemahandler(ActionEvent event) {
        pane2.setVisible(false);
        pane5.setVisible(true);
        iv6.setImage(image);
        lab3.setText("hent skema fra ventsre og tilfoj til hojre");
        
        
    }
    @FXML
    private void handledragimageover(DragEvent event){
    
    if (event.getDragboard().hasImage()){
    event.acceptTransferModes(TransferMode.ANY);
    
    
    }
    }
    @FXML
    private void handleimagedropped(DragEvent event){

        Image img = event.getDragboard().getImage();
        iv7.setImage(img);
       
    
    }
    
   
    
    
    }
    
   
    




   