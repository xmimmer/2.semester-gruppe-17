package Logic;

import Data.DatabaseManager;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Mimmer
 */
public class ProfileFXMLController implements Initializable {

    @FXML
    public TextField cprTextField;
    @FXML
    private Button updateDiaryButton;
    @FXML
    private Button logoutButton;
    @FXML
    private Button schemaButton;
    @FXML
    private Button writeNoteButton;
    @FXML
    private TextField depTextField;
    @FXML
    private TextArea writeNoteTextArea;
    @FXML
    private Label nameLabel;
    @FXML
    private TextField ageTextField;
    @FXML
    private Button closeButton;
    @FXML
    private Button saveDiaryButton;
    @FXML
    private Button clearDiaryButton;
    @FXML
    private TextArea diaryText;
    @FXML
    private Button backButton;
    @FXML
    private Label testLabel;

    public static String citizen;

    public static String getCitizen() {
        return citizen;
    }

    //Class instances
    DatabaseManager dm = new DatabaseManager();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Connect();

        if (LoginFXMLController.isCitizen == true) {
            writeNoteButton.setVisible(false);
            backButton.setVisible(false);
            clearDiaryButton.setVisible(false);

        }
        if (LoginFXMLController.isRelative == true) {
            writeNoteButton.setVisible(false);
            backButton.setVisible(false);
            clearDiaryButton.setVisible(false);
            schemaButton.setVisible(false);
            depTextField.setText("Spørg hos kommunen.");
        }

    }

    public void Connect() {
        if (LoginFXMLController.isCitizen == true) {
            try {
                Class.forName("org.postgresql.Driver");
            } catch (ClassNotFoundException ex) {
                System.out.println("Fail to load the jdbc driver.");
            }

            try {
                Connection connection = DriverManager.getConnection(dm.getDatabaseURL(), dm.getDatabaseUsername(), dm.getDatabasePassword());
                System.out.println("Connected!");

                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT name,age,department,CPR FROM citizens WHERE CPR ='" + LoginFXMLController.getValidateCPR() + "'");
                while (resultSet.next()) {
                    citizen = resultSet.getString("name");
                    nameLabel.setText(resultSet.getString("name"));
                    ageTextField.setText(resultSet.getString("age"));
                    depTextField.setText(resultSet.getString("department"));
                    cprTextField.setText(resultSet.getString("CPR"));

                    connection.close();
                    resultSet.close();
                }
            } catch (java.sql.SQLException ex) {
                System.out.println(ex.getMessage());
            }

        } else if (LoginFXMLController.isAdmin == true) {
            try {
                Class.forName("org.postgresql.Driver");
            } catch (ClassNotFoundException ex) {
                System.out.println("Fail to load the jdbc driver.");
            }

            try {
                Connection connection = DriverManager.getConnection(dm.getDatabaseURL(), dm.getDatabaseUsername(), dm.getDatabasePassword());
                System.out.println("Connected!");

                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT name,age,department,CPR FROM citizens WHERE name ='" + StartFXMLController.getCitizen() + "'");
                while (resultSet.next()) {

                    nameLabel.setText(resultSet.getString("name"));
                    ageTextField.setText(resultSet.getString("age"));
                    depTextField.setText(resultSet.getString("department"));
                    cprTextField.setText(resultSet.getString("CPR"));

                    connection.close();
                    resultSet.close();
                }
            } catch (java.sql.SQLException ex) {
                System.out.println(ex.getMessage());
            }
        } else if (LoginFXMLController.isRelative == true) {
            try {
                Class.forName("org.postgresql.Driver");
            } catch (ClassNotFoundException ex) {
                System.out.println("Fail to load the jdbc driver.");
            }

            try {
                Connection connection = DriverManager.getConnection(dm.getDatabaseURL(), dm.getDatabaseUsername(), dm.getDatabasePassword());
                System.out.println("Connected!");

                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT name,age,CPR FROM citizens WHERE CPR ='" + LoginFXMLController.getValidateCPR() + "'");

                while (resultSet.next()) {
                    
                    nameLabel.setText(resultSet.getString("name"));
                    ageTextField.setText(resultSet.getString("age"));
                    cprTextField.setText(resultSet.getString("CPR"));
                    testLabel.setText("Logget ind som pårørende for: " + resultSet.getString("name"));

                    connection.close();
                    resultSet.close();
                }
            } catch (java.sql.SQLException ex) {
                System.out.println(ex.getMessage());
            }

        }

    }

    @FXML
    private void updateDiaryButtonHandler(ActionEvent event) {

        writeNoteTextArea.setText("");

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Fail to load the jdbc driver.");
        }

        try {
            Connection connection = DriverManager.getConnection(dm.getSecondDatabaseURL(), dm.getSecondDatabaseUsername(), dm.getSecondDatabasePassword());
            System.out.println("Connected!");

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT diary FROM diary WHERE CPR = '" + cprTextField.getText() + "'");
            while (resultSet.next()) {
                diaryText.setText(resultSet.getString("diary") + "\n");
            }

            connection.close();
            resultSet.close();

        } catch (java.sql.SQLException ex) {
            System.out.println(ex.getMessage());

        }

    }

    @FXML
    private void closeButtonHandler(ActionEvent event) {
        writeNoteButton.setVisible(true);

        writeNoteTextArea.setVisible(false);

        closeButton.setVisible(false);
        saveDiaryButton.setVisible(false);

    }

    @FXML
    private void saveDiaryButtonHandler(ActionEvent event) {

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Fail to load the jdbc driver.");
        }

        try {
            Connection connection = DriverManager.getConnection(dm.getSecondDatabaseURL(), dm.getSecondDatabaseUsername(), dm.getSecondDatabasePassword());
            System.out.println("Connected!");

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("UPDATE diary SET diary = '" + diaryText.getText() + writeNoteTextArea.getText() + "' WHERE name = '" + StartFXMLController.getCitizen() + "'");

            connection.close();
            resultSet.close();

        } catch (java.sql.SQLException ex) {
            System.out.println(ex.getMessage());

        }
    }

    @FXML
    private void clearDiaryButtonHandler(ActionEvent event) {

        diaryText.setText("");

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Fail to load the jdbc driver.");
        }

        try {
            Connection connection = DriverManager.getConnection(dm.getSecondDatabaseURL(), dm.getSecondDatabaseUsername(), dm.getSecondDatabasePassword());
            System.out.println("Connected!");

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("UPDATE anotherdatabase SET diary = '" + "" + "' WHERE name = '" + StartFXMLController.getCitizen() + "'");

            connection.close();
            resultSet.close();

        } catch (java.sql.SQLException ex) {
            System.out.println(ex.getMessage());

        }

    }

    @FXML
    private void schemaButtonHandler(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/Presentation/SchemaFXML.fxml"));

        Scene scene = new Scene(root);

        //This line gets the Stage information
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(scene);
        window.show();

    }

    @FXML
    private void backButtonHandler(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/Presentation/StartFXML.fxml"));

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

    @FXML
    private void writeNoteButtonHandler(ActionEvent event) {

        writeNoteTextArea.setVisible(true);
        writeNoteButton.setVisible(false);
        closeButton.setVisible(true);
        saveDiaryButton.setVisible(true);

    }

}
