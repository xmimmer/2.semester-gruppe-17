package Logic;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class LinePetersenController implements Initializable {

    @FXML
    private Label nameLabel;
    @FXML
    private Button schemaButton;
    @FXML
    private Button backButton;
    @FXML
    private Label ageLabel;
    @FXML
    private Label depLabel;
    @FXML
    private Label cprLabel;
    @FXML
    private Label diaryLabel;
    @FXML
    private TextField ageTextField;
    @FXML
    private TextField depTextField;
    @FXML
    private TextField cprTextField;
    @FXML
    private ImageView photo;
    private TextArea diaryTextField;
    @FXML
    private Button backButton1;
    @FXML
    private Button createSchemaButton;
    @FXML
    private Button deleteSchemaButton;
    @FXML
    private Button showSchemaButton;

    private Image image;
    @FXML
    private AnchorPane anchorPane1;
    @FXML
    private AnchorPane anchorPane2;
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

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        image = new Image(new File("woman.png").toURI().toString());
        photo.setImage(image);

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
            ResultSet resultSet = statement.executeQuery("SELECT * FROM borgere WHERE navn = 'Line Petersen'");
            while (resultSet.next()) {
                ageTextField.setText(resultSet.getString("alder"));
                depTextField.setText(resultSet.getString("afdeling"));
                cprTextField.setText(resultSet.getString("CPR"));

            }
        } catch (java.sql.SQLException ex) {
            System.out.println(ex.getMessage());
        }
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

        //Aktiver skemaer mm....
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
        Parent root = FXMLLoader.load(getClass().getResource("/Presentation/Line Petersen.fxml"));
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
