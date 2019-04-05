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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class HansHansenController implements Initializable {

    @FXML
    private Button backButton;
    @FXML
    private Button schemaButton;
    @FXML
    private ImageView photo;
    @FXML
    private TextArea textField;
    @FXML
    private TextField departmentTextField;
    @FXML
    private TextField cprTextField;
    @FXML
    private TextField ageTextField1;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void schemaButtonHandler(ActionEvent event) {
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
