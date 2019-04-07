package Logic;

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
import javafx.scene.image.ImageView;
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

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void schemaButtonHandler(ActionEvent event) {

        nameLabel.setVisible(false);
        schemaButton.setVisible(false);
        ageLabel.setVisible(false);
        depLabel.setVisible(false);
        cprLabel.setVisible(false);
        diaryLabel.setVisible(false);
        diaryTextField.setVisible(false);
        ageTextField.setVisible(false);
        depTextField.setVisible(false);
        cprTextField.setVisible(false);

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

}
