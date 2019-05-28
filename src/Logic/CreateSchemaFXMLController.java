/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import Data.DatabaseManager;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.ResourceBundle;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.SnapshotParameters;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.WritableImage;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javax.imageio.ImageIO;

/**
 * FXML Controller class
 *
 * @author Mimmer
 */
public class CreateSchemaFXMLController implements Initializable {

    @FXML
    private ImageView imageView2;
    @FXML
    private ImageView gridPaneImageView1;
    @FXML
    private ImageView gridPaneImageView2;
    @FXML
    private ImageView gridPaneImageView3;
    @FXML
    private ImageView gridPaneImageView4;
    @FXML
    private ImageView gridPaneImageView5;
    @FXML
    private ImageView gridPaneImageView6;
    @FXML
    private ImageView gridPaneImageView7;
    @FXML
    private ImageView gridPaneImageView8;
    @FXML
    private ImageView gridPaneImageView9;
    @FXML
    private ImageView gridPaneImageView10;
    @FXML
    private ImageView gridPaneImageView11;
    @FXML
    private ImageView gridPaneImageView12;
    @FXML
    private ImageView gridPaneImageView13;
    @FXML
    private ImageView gridPaneImageView14;
    @FXML
    private ImageView gridPaneImageView15;
    @FXML
    private ImageView gridPaneImageView16;
    @FXML
    private ImageView gridPaneImageView17;
    @FXML
    private ImageView gridPaneImageView18;
    @FXML
    private ImageView gridPaneImageView19;
    @FXML
    private ImageView gridPaneImageView20;
    @FXML
    private ImageView imageView1;
    @FXML
    private ImageView imageView3;
    @FXML
    private ImageView imageView4;
    @FXML
    private ImageView imageView5;
    @FXML
    private ImageView imageView6;
    @FXML
    private ImageView imageView7;
    @FXML
    private ImageView imageView8;
    @FXML
    private ImageView imageView9;
    @FXML
    private ImageView imageView10;
    @FXML
    private ImageView imageView11;
    @FXML
    private ImageView imageView12;
    @FXML
    private ImageView imageView13;
    @FXML
    private ImageView imageView14;
    @FXML
    private ImageView imageView15;
    @FXML
    private ImageView imageView16;
    @FXML
    private ImageView imageView17;
    @FXML
    private ImageView imageView18;
    @FXML
    private ImageView imageView19;
    @FXML
    private ImageView imageView20;
    @FXML
    private ImageView imageView21;
    @FXML
    private ImageView imageView22;
    @FXML
    private ImageView imageView23;
    @FXML
    private ImageView imageView24;
    @FXML
    private ImageView imageView25;
    @FXML
    private ImageView imageView26;
    @FXML
    private ImageView imageView27;
    @FXML
    private Button saveSchemaButton;
    @FXML
    private Button backButton;
    @FXML
    private Button logoutButton;
    @FXML
    private Pane createSchemaGridPane;
    public static Image img2;

    //Class instances
    DatabaseManager dm = new DatabaseManager();

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        Image img1 = new Image(new File("1.png").toURI().toString());
        Image img2 = new Image(new File("2.png").toURI().toString());
        Image img3 = new Image(new File("3.png").toURI().toString());
        Image img4 = new Image(new File("4.png").toURI().toString());
        Image img5 = new Image(new File("5.png").toURI().toString());
        Image img6 = new Image(new File("6.png").toURI().toString());
        Image img7 = new Image(new File("7.png").toURI().toString());
        Image img8 = new Image(new File("8.png").toURI().toString());
        Image img9 = new Image(new File("9.png").toURI().toString());
        Image img10 = new Image(new File("10.png").toURI().toString());
        Image img11 = new Image(new File("11.png").toURI().toString());
        Image img12 = new Image(new File("12.png").toURI().toString());
        Image img13 = new Image(new File("Børste tænder.png").toURI().toString());
        Image img14 = new Image(new File("I seng.png").toURI().toString());
        Image img15 = new Image(new File("Sport.png").toURI().toString());
        Image img16 = new Image(new File("bad.png").toURI().toString());
        Image img17 = new Image(new File("brætspil.png").toURI().toString());
        Image img18 = new Image(new File("computer.png").toURI().toString());
        Image img19 = new Image(new File("frokost.png").toURI().toString());
        Image img20 = new Image(new File("Undervisning.png").toURI().toString());
        Image img21 = new Image(new File("Zoo udflugt.png").toURI().toString());
        Image img22 = new Image(new File("fysioterapi.png").toURI().toString());
        Image img23 = new Image(new File("Stå op om morgen.png").toURI().toString());
        Image img24 = new Image(new File("fødselsdag.png").toURI().toString());
        Image img25 = new Image(new File("gang træning.png").toURI().toString());
        Image img26 = new Image(new File("gå tur.png").toURI().toString());
        Image img27 = new Image(new File("kirke.png").toURI().toString());

        imageView1.setImage(img1);
        imageView2.setImage(img2);
        imageView3.setImage(img3);
        imageView4.setImage(img4);
        imageView5.setImage(img5);
        imageView6.setImage(img6);
        imageView7.setImage(img7);
        imageView8.setImage(img8);
        imageView9.setImage(img9);
        imageView10.setImage(img10);
        imageView11.setImage(img11);
        imageView12.setImage(img12);
        imageView13.setImage(img13);
        imageView14.setImage(img14);
        imageView15.setImage(img15);
        imageView16.setImage(img16);
        imageView17.setImage(img17);
        imageView18.setImage(img18);
        imageView19.setImage(img19);
        imageView20.setImage(img20);
        imageView21.setImage(img21);
        imageView22.setImage(img22);
        imageView23.setImage(img23);
        imageView24.setImage(img24);
        imageView25.setImage(img25);
        imageView26.setImage(img26);
        imageView27.setImage(img27);
    }

    @FXML
    private void handleDragDetected(MouseEvent event) {

        if (event.getSource() == imageView1) {
            Dragboard db = imageView1.startDragAndDrop(TransferMode.ANY);
            ClipboardContent cb = new ClipboardContent();
            cb.putImage(imageView1.getImage());
            db.setContent(cb);
            event.consume();
        } else if (event.getSource() == imageView2) {
            Dragboard db = imageView2.startDragAndDrop(TransferMode.ANY);
            ClipboardContent cb = new ClipboardContent();
            cb.putImage(imageView2.getImage());
            db.setContent(cb);
            event.consume();
        } else if (event.getSource() == imageView3) {
            Dragboard db = imageView3.startDragAndDrop(TransferMode.ANY);
            ClipboardContent cb = new ClipboardContent();
            cb.putImage(imageView3.getImage());
            db.setContent(cb);
            event.consume();
        } else if (event.getSource() == imageView4) {
            Dragboard db = imageView4.startDragAndDrop(TransferMode.ANY);
            ClipboardContent cb = new ClipboardContent();
            cb.putImage(imageView4.getImage());
            db.setContent(cb);
            event.consume();
        } else if (event.getSource() == imageView5) {
            Dragboard db = imageView5.startDragAndDrop(TransferMode.ANY);
            ClipboardContent cb = new ClipboardContent();
            cb.putImage(imageView5.getImage());
            db.setContent(cb);
            event.consume();
        } else if (event.getSource() == imageView6) {
            Dragboard db = imageView6.startDragAndDrop(TransferMode.ANY);
            ClipboardContent cb = new ClipboardContent();
            cb.putImage(imageView6.getImage());
            db.setContent(cb);
            event.consume();
        } else if (event.getSource() == imageView7) {
            Dragboard db = imageView7.startDragAndDrop(TransferMode.ANY);
            ClipboardContent cb = new ClipboardContent();
            cb.putImage(imageView7.getImage());
            db.setContent(cb);
            event.consume();
        } else if (event.getSource() == imageView8) {
            Dragboard db = imageView8.startDragAndDrop(TransferMode.ANY);
            ClipboardContent cb = new ClipboardContent();
            cb.putImage(imageView8.getImage());
            db.setContent(cb);
            event.consume();
        } else if (event.getSource() == imageView9) {
            Dragboard db = imageView9.startDragAndDrop(TransferMode.ANY);
            ClipboardContent cb = new ClipboardContent();
            cb.putImage(imageView9.getImage());
            db.setContent(cb);
            event.consume();
        } else if (event.getSource() == imageView10) {
            Dragboard db = imageView10.startDragAndDrop(TransferMode.ANY);
            ClipboardContent cb = new ClipboardContent();
            cb.putImage(imageView10.getImage());
            db.setContent(cb);
            event.consume();
        } else if (event.getSource() == imageView11) {
            Dragboard db = imageView11.startDragAndDrop(TransferMode.ANY);
            ClipboardContent cb = new ClipboardContent();
            cb.putImage(imageView11.getImage());
            db.setContent(cb);
            event.consume();

        } else if (event.getSource() == imageView12) {
            Dragboard db = imageView12.startDragAndDrop(TransferMode.ANY);
            ClipboardContent cb = new ClipboardContent();
            cb.putImage(imageView12.getImage());
            db.setContent(cb);
            event.consume();
        } else if (event.getSource() == imageView13) {
            Dragboard db = imageView13.startDragAndDrop(TransferMode.ANY);
            ClipboardContent cb = new ClipboardContent();
            cb.putImage(imageView13.getImage());
            db.setContent(cb);
            event.consume();
        } else if (event.getSource() == imageView14) {
            Dragboard db = imageView14.startDragAndDrop(TransferMode.ANY);
            ClipboardContent cb = new ClipboardContent();
            cb.putImage(imageView14.getImage());
            db.setContent(cb);
            event.consume();
        } else if (event.getSource() == imageView15) {
            Dragboard db = imageView15.startDragAndDrop(TransferMode.ANY);
            ClipboardContent cb = new ClipboardContent();
            cb.putImage(imageView15.getImage());
            db.setContent(cb);
            event.consume();
        } else if (event.getSource() == imageView16) {
            Dragboard db = imageView16.startDragAndDrop(TransferMode.ANY);
            ClipboardContent cb = new ClipboardContent();
            cb.putImage(imageView16.getImage());
            db.setContent(cb);
            event.consume();
        } else if (event.getSource() == imageView17) {
            Dragboard db = imageView17.startDragAndDrop(TransferMode.ANY);
            ClipboardContent cb = new ClipboardContent();
            cb.putImage(imageView17.getImage());
            db.setContent(cb);
            event.consume();
        } else if (event.getSource() == imageView18) {
            Dragboard db = imageView18.startDragAndDrop(TransferMode.ANY);
            ClipboardContent cb = new ClipboardContent();
            cb.putImage(imageView18.getImage());
            db.setContent(cb);
            event.consume();
        } else if (event.getSource() == imageView19) {
            Dragboard db = imageView19.startDragAndDrop(TransferMode.ANY);
            ClipboardContent cb = new ClipboardContent();
            cb.putImage(imageView19.getImage());
            db.setContent(cb);
            event.consume();
        } else if (event.getSource() == imageView20) {
            Dragboard db = imageView20.startDragAndDrop(TransferMode.ANY);
            ClipboardContent cb = new ClipboardContent();
            cb.putImage(imageView20.getImage());
            db.setContent(cb);
            event.consume();
        } else if (event.getSource() == imageView21) {
            Dragboard db = imageView21.startDragAndDrop(TransferMode.ANY);
            ClipboardContent cb = new ClipboardContent();
            cb.putImage(imageView21.getImage());
            db.setContent(cb);
            event.consume();
        } else if (event.getSource() == imageView22) {
            Dragboard db = imageView22.startDragAndDrop(TransferMode.ANY);
            ClipboardContent cb = new ClipboardContent();
            cb.putImage(imageView22.getImage());
            db.setContent(cb);
            event.consume();
        } else if (event.getSource() == imageView23) {
            Dragboard db = imageView23.startDragAndDrop(TransferMode.ANY);
            ClipboardContent cb = new ClipboardContent();
            cb.putImage(imageView23.getImage());
            db.setContent(cb);
            event.consume();
        } else if (event.getSource() == imageView24) {
            Dragboard db = imageView24.startDragAndDrop(TransferMode.ANY);
            ClipboardContent cb = new ClipboardContent();
            cb.putImage(imageView24.getImage());
            db.setContent(cb);
            event.consume();
        } else if (event.getSource() == imageView25) {
            Dragboard db = imageView25.startDragAndDrop(TransferMode.ANY);
            ClipboardContent cb = new ClipboardContent();
            cb.putImage(imageView25.getImage());
            db.setContent(cb);
            event.consume();
        } else if (event.getSource() == imageView26) {
            Dragboard db = imageView26.startDragAndDrop(TransferMode.ANY);
            ClipboardContent cb = new ClipboardContent();
            cb.putImage(imageView26.getImage());
            db.setContent(cb);
            event.consume();
        } else if (event.getSource() == imageView27) {
            Dragboard db = imageView27.startDragAndDrop(TransferMode.ANY);
            ClipboardContent cb = new ClipboardContent();
            cb.putImage(imageView27.getImage());
            db.setContent(cb);
            event.consume();

        }
    }

    @FXML
    private void handleDragOver(DragEvent event) {

        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }

    }

    @FXML
    private void handleDropDetected(DragEvent event) {

        if (event.getSource() == gridPaneImageView1) {
            Image img = event.getDragboard().getImage();
            gridPaneImageView1.setImage(img);
        } else if (event.getSource() == gridPaneImageView2) {
            Image img = event.getDragboard().getImage();
            gridPaneImageView2.setImage(img);
        } else if (event.getSource() == gridPaneImageView3) {
            Image img = event.getDragboard().getImage();
            gridPaneImageView3.setImage(img);
        } else if (event.getSource() == gridPaneImageView4) {
            Image img = event.getDragboard().getImage();
            gridPaneImageView4.setImage(img);
        } else if (event.getSource() == gridPaneImageView5) {
            Image img = event.getDragboard().getImage();
            gridPaneImageView5.setImage(img);
        } else if (event.getSource() == gridPaneImageView6) {
            Image img = event.getDragboard().getImage();
            gridPaneImageView6.setImage(img);
        } else if (event.getSource() == gridPaneImageView7) {
            Image img = event.getDragboard().getImage();
            gridPaneImageView7.setImage(img);
        } else if (event.getSource() == gridPaneImageView8) {
            Image img = event.getDragboard().getImage();
            gridPaneImageView8.setImage(img);
        } else if (event.getSource() == gridPaneImageView9) {
            Image img = event.getDragboard().getImage();
            gridPaneImageView9.setImage(img);
        } else if (event.getSource() == gridPaneImageView11) {
            Image img = event.getDragboard().getImage();
            gridPaneImageView11.setImage(img);
        } else if (event.getSource() == gridPaneImageView10) {
            Image img = event.getDragboard().getImage();
            gridPaneImageView10.setImage(img);
        } else if (event.getSource() == gridPaneImageView12) {
            Image img = event.getDragboard().getImage();
            gridPaneImageView12.setImage(img);
        } else if (event.getSource() == gridPaneImageView13) {
            Image img = event.getDragboard().getImage();
            gridPaneImageView13.setImage(img);
        } else if (event.getSource() == gridPaneImageView14) {
            Image img = event.getDragboard().getImage();
            gridPaneImageView14.setImage(img);
        } else if (event.getSource() == gridPaneImageView15) {
            Image img = event.getDragboard().getImage();
            gridPaneImageView15.setImage(img);
        } else if (event.getSource() == gridPaneImageView16) {
            Image img = event.getDragboard().getImage();
            gridPaneImageView16.setImage(img);
        } else if (event.getSource() == gridPaneImageView17) {
            Image img = event.getDragboard().getImage();
            gridPaneImageView17.setImage(img);
        } else if (event.getSource() == gridPaneImageView18) {
            Image img = event.getDragboard().getImage();
            gridPaneImageView18.setImage(img);
        } else if (event.getSource() == gridPaneImageView19) {
            Image img = event.getDragboard().getImage();
            gridPaneImageView19.setImage(img);
        } else if (event.getSource() == gridPaneImageView20) {
            Image img = event.getDragboard().getImage();
            gridPaneImageView20.setImage(img);

        }
    }
    public Image getImage(){
    
    return img2;
    }
    public void SetImage(){
    
    img2 = null;
    }

    @FXML
    private void saveSchemaButtonHandler(ActionEvent event) throws IOException {

        // ByteArrayOutputStream bos=new ByteArrayOutputStream();
        //StreamResult result=new StreamResult(bos);
        //transformer.transform(source, result);
        //byte []array=bos.toByteArray();
        //Node n = gridPane.
        //  gridPane.getChildren().add(gridPaneImageView1.getClip());
        //double heit = gridPane.getHeight();
        //double wit = gridPane.getWidth();
        //BufferedImage bg = new BufferedImage((int)heit,(int)wit,BufferedImage.TYPE_INT_ARGB);
        //String ba = bg.toString();
        //byte[] bytearray = ba.getBytes();
        WritableImage image = createSchemaGridPane.snapshot(new SnapshotParameters(), null);

        BufferedImage bImage = SwingFXUtils.fromFXImage(image, null);
        ByteArrayOutputStream s = new ByteArrayOutputStream();
        ImageIO.write(bImage, "png", s);
        byte[] res = s.toByteArray();
        System.out.println(res);
        // System.out.println(" bytes "  + Arrays.toString(bytearray) + "\n");
        
            ByteArrayInputStream bos = new ByteArrayInputStream(res);
            BufferedImage bImage2 = ImageIO.read(bos);
            Image img1 = SwingFXUtils.toFXImage(bImage, null);
            img2 = img1;
 

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Fail to load the jdbc driver.");
        }

        try {
            Connection connection = DriverManager.getConnection(dm.getDatabaseURL(), dm.getDatabaseUsername(), dm.getDatabasePassword());
            System.out.println("Connected!");

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("UPDATE citizens SET image ='" + res + "' WHERE name = '" + StartFXMLController.getCitizen() + "'");
            resultSet.close();
        } catch (SQLException ex) {

        }

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
