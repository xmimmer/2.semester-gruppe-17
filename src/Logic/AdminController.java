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
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.PasswordField;
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
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class AdminController implements Initializable {

    @FXML
    private ListView<String> borgerListView;

    @FXML
    private Button chooseButton;
    @FXML
    private Button logoutButton;
    @FXML
    private AnchorPane anchorPane;
    @FXML
    private Pane startPane;

    @FXML
    private TextField depTextField;
    @FXML
    private TextField ageTextField;
    @FXML
    private Label nameLabel;
    @FXML
    private TextField cprTextField;
    @FXML
    private Label loggedInAsLabel1;
    @FXML
    private ImageView photo;
    @FXML
    private Label messageLabel;
    @FXML
    private Button schemaButton;
    @FXML
    private Pane citizenPane;
    @FXML
    private Pane schemaPane;
    @FXML
    private Button createSchemaButton;
    @FXML
    private Pane createSchemaPane;
    @FXML
    private ImageView imageView1;
    @FXML
    private ImageView imageView2;
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
    private Button showSchemaButton;
    @FXML
    private Button backButton2;
    @FXML
    private Button backButton3;
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
    private Button saveButton;
    @FXML
    private GridPane gridPane;
    @FXML
    private Pane loginPane;
    @FXML
    private PasswordField passwordField;
    @FXML
    private TextField usernameField;
    @FXML
    private Button loginButton;
    @FXML
    private Label checkLabel;
    @FXML
    private ImageView showSchemaImageView1;
    @FXML
    private ImageView showSchemaImageView2;
    @FXML
    private ImageView showSchemaImageView3;
    @FXML
    private ImageView showSchemaImageView4;
    @FXML
    private ImageView showSchemaImageView5;
    @FXML
    private ImageView showSchemaImageView6;
    @FXML
    private ImageView showSchemaImageView7;
    @FXML
    private ImageView showSchemaImageView8;
    @FXML
    private ImageView showSchemaImageView9;
    @FXML
    private Pane showSchemaPane;
    @FXML
    private Button deleteSchemaButton;
    @FXML
    private Button backButton4;
    private ListView<String> diaryListView;
    @FXML
    private Button saveDiaryButton;
    @FXML
    private Button clearDiaryButton;
    @FXML
    private Button updateDiaryButton;
    @FXML
    private TextArea diaryTextArea;
    @FXML
    private Button writeNoteButton;
    @FXML
    private Button closeNoteButton;
    @FXML
    private TextArea diaryText;

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

        ObservableList<String> list = FXCollections.observableArrayList();

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Fail to load the jdbc driver.");
        }

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
            ResultSet resultSet = statement.executeQuery("SELECT * FROM citizens WHERE name != 'admin'");

            while (resultSet.next()) {
                list.add(resultSet.getString("name"));

            }
            connection.close();
            resultSet.close();

        } catch (java.sql.SQLException ex) {
            System.out.println(ex.getMessage());

        }

        borgerListView.setItems(list);

    }

    @FXML
    private void chooseButtonHandler(ActionEvent event) throws IOException {

        try {
            String valgtBorger = borgerListView.getSelectionModel().getSelectedItem();
            if (valgtBorger.trim().length() > 0) {

                startPane.setVisible(false);
                citizenPane.setVisible(true);

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
                    ResultSet resultSet = statement.executeQuery("SELECT name,age,department,CPR FROM citizens WHERE name ='" + valgtBorger + "'");
                    while (resultSet.next()) {
                        nameLabel.setText(resultSet.getString("name"));
                        ageTextField.setText(resultSet.getString("age"));
                        depTextField.setText(resultSet.getString("department"));
                        cprTextField.setText(resultSet.getString("CPR"));
                        loggedInAsLabel1.setText("Logget ind som:" + resultSet.getString("name"));

                        connection.close();
                        resultSet.close();
                    }
                } catch (java.sql.SQLException ex) {
                    System.out.println(ex.getMessage());
                }

            }
        } catch (Exception e) {
            messageLabel.setText("Ingen borger valgt.");
        }

    }

    @FXML
    private void logoutButtonHandler(ActionEvent event) throws IOException {

        startPane.setVisible(false);
        citizenPane.setVisible(false);
        schemaPane.setVisible(false);
        createSchemaPane.setVisible(false);
        showSchemaPane.setVisible(false);

        loginPane.setVisible(true);

        usernameField.setText("");
        passwordField.setText("");
        checkLabel.setText("");
        diaryTextArea.setText("");
        createSchemaButton.setVisible(true);

        writeNoteButton.setVisible(true);
        clearDiaryButton.setVisible(true);
        updateDiaryButton.setVisible(true);
        diaryText.setText("");

    }

    @FXML
    private void schemaButtonHandler(ActionEvent event) {

        citizenPane.setVisible(false);
        schemaPane.setVisible(true);

    }

    @FXML
    private void createSchemaButtonHandler(ActionEvent event) {
        schemaPane.setVisible(false);
        createSchemaPane.setVisible(true);

        gridPaneImageView1.setImage(null);
        gridPaneImageView2.setImage(null);
        gridPaneImageView3.setImage(null);
        gridPaneImageView4.setImage(null);
        gridPaneImageView5.setImage(null);
        gridPaneImageView6.setImage(null);
        gridPaneImageView7.setImage(null);
        gridPaneImageView8.setImage(null);
        gridPaneImageView9.setImage(null);

    }

    @FXML
    private void showSchemaButtonHandler(ActionEvent event) {
        schemaPane.setVisible(false);
        showSchemaPane.setVisible(true);

    }

    @FXML
    private void backButton2Handler(ActionEvent event) {
        citizenPane.setVisible(true);
        schemaPane.setVisible(false);

    }

    @FXML
    private void backButton3Handler(ActionEvent event) {
        schemaPane.setVisible(true);
        createSchemaPane.setVisible(false);
    }

    @FXML
    private void backButton4Handler(ActionEvent event) {
        showSchemaPane.setVisible(false);
        schemaPane.setVisible(true);

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
        }
    }

    @FXML
    private void handleDragOver(DragEvent event) {
        if (event.getDragboard().hasImage()) {
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    private void saveButtonHandler(ActionEvent event) {

        /*
        String valgtBorger = borgerListView.getSelectionModel().getSelectedItem();
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
            ResultSet resultSet = statement.executeQuery("INSERT INTO citizens WHERE name ='" + valgtBorger + "' (img) VALUES(" + gridPaneImageView1.getImage() + ")");
            resultSet.close();
        } catch (SQLException ex) {

        }
        
         */
        Image img1 = gridPaneImageView1.getImage();
        Image img2 = gridPaneImageView2.getImage();
        Image img3 = gridPaneImageView3.getImage();
        Image img4 = gridPaneImageView4.getImage();
        Image img5 = gridPaneImageView5.getImage();
        Image img6 = gridPaneImageView6.getImage();
        Image img7 = gridPaneImageView7.getImage();
        Image img8 = gridPaneImageView8.getImage();
        Image img9 = gridPaneImageView9.getImage();
        showSchemaImageView1.setImage(img1);
        showSchemaImageView2.setImage(img2);
        showSchemaImageView3.setImage(img3);
        showSchemaImageView4.setImage(img4);
        showSchemaImageView5.setImage(img5);
        showSchemaImageView6.setImage(img6);
        showSchemaImageView7.setImage(img7);
        showSchemaImageView8.setImage(img8);
        showSchemaImageView9.setImage(img9);
    }

    @FXML
    private void loginButtonHandler(ActionEvent event) {

        String adminUsername = "admin";
        String adminPassword = "123";

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Fail to load the jdbc driver.");
        }

        String databaseURL = "jdbc:postgresql://balarama.db.elephantsql.com:5432/beucjfoi";
        String username = "beucjfoi";
        String password = "EXQJyo9fmXNKkqC-CVoGoI2kE9XinAP8";

        String citizenUsername;
        String citizenPassword;
        try {
            Connection connection = DriverManager.getConnection(databaseURL, username, password);
            System.out.println("Connected!");

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM citizens WHERE name != 'admin'");

            while (resultSet.next()) {

                citizenUsername = resultSet.getString("username");
                citizenPassword = resultSet.getString("password");

                if (passwordField.getText().equals(citizenPassword) && usernameField.getText().equals(citizenUsername)) {

                    loginPane.setVisible(false);
                    citizenPane.setVisible(true);
                    createSchemaButton.setVisible(false);
                    deleteSchemaButton.setVisible(false);
                    saveDiaryButton.setVisible(false);
                    clearDiaryButton.setVisible(false);
                    diaryTextArea.setVisible(false);
                    writeNoteButton.setVisible(false);

                    nameLabel.setText(resultSet.getString("name"));
                    ageTextField.setText(resultSet.getString("age"));
                    depTextField.setText(resultSet.getString("department"));
                    cprTextField.setText(resultSet.getString("CPR"));

                    connection.close();
                    resultSet.close();

                } else {
                    checkLabel.setText("Forkert kodeord/brugernavn.");
                }

            }

        } catch (java.sql.SQLException ex) {
            System.out.println(ex.getMessage());

        }
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Fail to load the jdbc driver.");
        }

        try {
            Connection connection = DriverManager.getConnection(databaseURL, username, password);
            System.out.println("Connected!");

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM citizens WHERE name = 'admin'");

            while (resultSet.next()) {

                adminUsername = resultSet.getString("username");
                adminPassword = resultSet.getString("password");

                if (passwordField.getText().equals(adminPassword) && usernameField.getText().equals(adminUsername)) {
                    loginPane.setVisible(false);
                    startPane.setVisible(true);
                    loggedInAsLabel1.setText("Logget ind som: " + resultSet.getString("name"));

                    connection.close();
                    resultSet.close();

                } else {
                    checkLabel.setText("Forkert kodeord/brugernavn.");
                }

            }

        } catch (java.sql.SQLException ex) {
            System.out.println(ex.getMessage());

        }

    }

    @FXML
    private void deleteSchemaButtonHandler(ActionEvent event) {
        showSchemaImageView1.setImage(null);
        showSchemaImageView2.setImage(null);
        showSchemaImageView3.setImage(null);
        showSchemaImageView4.setImage(null);
        showSchemaImageView5.setImage(null);
        showSchemaImageView6.setImage(null);
        showSchemaImageView7.setImage(null);
        showSchemaImageView8.setImage(null);
        showSchemaImageView9.setImage(null);
    }

    @FXML
    private void saveDiaryButtonAction(ActionEvent event) {

        String valgtBorger = borgerListView.getSelectionModel().getSelectedItem();

        String databaseURL = "jdbc:postgresql://balarama.db.elephantsql.com:5432/cbsbnvky";
        String username = "cbsbnvky";
        String password = "aGk4yWvjGnEhloZEiNEXpV9pXrPLj_RQ";

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Fail to load the jdbc driver.");
        }

        try {
            Connection connection = DriverManager.getConnection(databaseURL, username, password);
            System.out.println("Connected!");

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("UPDATE anotherdatabase SET diary = '" + diaryText.getText() + diaryTextArea.getText() + "' WHERE name = '" + valgtBorger + "'");

            connection.close();
            resultSet.close();

        } catch (java.sql.SQLException ex) {
            System.out.println(ex.getMessage());

        }

    }

    @FXML
    private void clearDiaryButtonAction(ActionEvent event) {
        String valgtBorger = borgerListView.getSelectionModel().getSelectedItem();
        diaryText.setText("");

        String databaseURL = "jdbc:postgresql://balarama.db.elephantsql.com:5432/cbsbnvky";
        String username = "cbsbnvky";
        String password = "aGk4yWvjGnEhloZEiNEXpV9pXrPLj_RQ";

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Fail to load the jdbc driver.");
        }

        try {
            Connection connection = DriverManager.getConnection(databaseURL, username, password);
            System.out.println("Connected!");

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("UPDATE anotherdatabase SET diary = '" + "" + "' WHERE name = '" + valgtBorger + "'");

            connection.close();
            resultSet.close();

        } catch (java.sql.SQLException ex) {
            System.out.println(ex.getMessage());

        }

    }

    @FXML
    private void updateDiaryButtonAction(ActionEvent event) {

        diaryTextArea.setText("");

        String databaseURL = "jdbc:postgresql://balarama.db.elephantsql.com:5432/cbsbnvky";
        String username = "cbsbnvky";
        String password = "aGk4yWvjGnEhloZEiNEXpV9pXrPLj_RQ";

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Fail to load the jdbc driver.");
        }

        try {
            Connection connection = DriverManager.getConnection(databaseURL, username, password);
            System.out.println("Connected!");

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT diary FROM anotherdatabase WHERE CPR = '" + cprTextField.getText() + "'");
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
    private void writeNoteButtonHandler(ActionEvent event) {
        diaryTextArea.setVisible(true);
        saveDiaryButton.setVisible(true);
        closeNoteButton.setVisible(true);

    }

    @FXML
    private void closeNoteButtonHandler(ActionEvent event) {
        writeNoteButton.setVisible(true);
        diaryTextArea.setVisible(false);
        saveDiaryButton.setVisible(false);
        closeNoteButton.setVisible(false);
        diaryTextArea.setText("");

    }

}
