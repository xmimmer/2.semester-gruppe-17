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
    private ImageView imageView61;
    @FXML
    private ImageView imageView71;
    @FXML
    private ImageView imageView81;
    @FXML
    private ImageView imageView91;
    @FXML
    private ImageView imageView1901;
    @FXML
    private ImageView imageView1801;
    @FXML
    private ImageView imageView1701;
    @FXML
    private ImageView imageView1601;
    @FXML
    private ImageView imageView1011;
    @FXML
    private ImageView imageView1021;
    @FXML
    private ImageView imageView1031;
    @FXML
    private ImageView imageView1041;
    @FXML
    private ImageView imageView102;
    @FXML
    private ImageView imageView103;
    @FXML
    private ImageView imageView104;
    @FXML
    private ImageView imageView62;
    @FXML
    private ImageView imageView72;
    @FXML
    private ImageView imageView82;
    @FXML
    private ImageView imageView92;
    @FXML
    private ImageView imageView1012;
    @FXML
    private ImageView imageView1022;
    @FXML
    private ImageView imageView1032;
    @FXML
    private ImageView imageView1042;
    @FXML
    private ImageView imageView63;
    @FXML
    private ImageView imageView73;
    @FXML
    private ImageView imageView83;
    @FXML
    private ImageView imageView93;
    @FXML
    private ImageView imageView1013;
    @FXML
    private ImageView imageView1023;
    @FXML
    private ImageView imageView1033;
    @FXML
    private ImageView imageView1043;
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
    private ImageView gridPaneImageView110;
    @FXML
    private ImageView gridPaneImageView111;
    @FXML
    private ImageView gridPaneImageView112;
    @FXML
    private ImageView gridPaneImageView113;
    @FXML
    private ImageView gridPaneImageView114;
    @FXML
    private ImageView gridPaneImageView115;
    @FXML
    private ImageView gridPaneImageView116;
    @FXML
    private ImageView gridPaneImageView117;
    @FXML
    private ImageView gridPaneImageView118;
    @FXML
    private ImageView gridPaneImageView119;
    @FXML
    private ImageView gridPaneImageView120;
    @FXML
    private ImageView gridPaneImageView121;

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
    private ImageView showSchemaImageView91;
    @FXML
    private ImageView showSchemaImageView92;
    @FXML
    private ImageView showSchemaImageView93;
    @FXML
    private ImageView showSchemaImageView96;
    @FXML
    private ImageView showSchemaImageView97;
    @FXML
    private ImageView showSchemaImageView98;
    @FXML
    private ImageView showSchemaImageView94;
    @FXML
    private ImageView showSchemaImageView95;
    @FXML
    private ImageView showSchemaImageView99;
    @FXML
    private ImageView showSchemaImageView910;
    @FXML
    private ImageView showSchemaImageView911;
    @FXML
    private ImageView showSchemaImageView912;
    @FXML
    private ImageView showSchemaImageView913;
    @FXML
    private ImageView showSchemaImageView914;
    @FXML
    private ImageView showSchemaImageView915;
    @FXML
    private ImageView showSchemaImageView916;
    @FXML
    private ImageView showSchemaImageView917;
    @FXML
    private ImageView showSchemaImageView918;
    @FXML
    private ImageView showSchemaImageView919;
    @FXML
    private ImageView showSchemaImageView920;
    @FXML
    private ImageView showSchemaImageView921;
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
        Image img61 = new Image(new File("Stå op om morgen.png").toURI().toString());
        Image img71 = new Image(new File("Aftensmad.png").toURI().toString());
        Image img81 = new Image(new File("Børste tænder.png").toURI().toString());
        Image img91 = new Image(new File("I seng.png").toURI().toString());
        Image img1901 = new Image(new File("Sport.png").toURI().toString());
        Image img1801 = new Image(new File("Sport.png").toURI().toString());
        Image img1701 = new Image(new File("Sport.png").toURI().toString());
        Image img1601 = new Image(new File("Sport.png").toURI().toString());
        Image img1011 = new Image(new File("Sport.png").toURI().toString());
        Image img1021 = new Image(new File("Undervisning.png").toURI().toString());
        Image img1031 = new Image(new File("Zoo udflugt.png").toURI().toString());
        Image img1041 = new Image(new File("Stå op om morgen.png").toURI().toString());
        Image img102 = new Image(new File("Stå op om morgen.png").toURI().toString());
        Image img103 = new Image(new File("Stå op om morgen.png").toURI().toString());
        Image img104 = new Image(new File("Stå op om morgen.png").toURI().toString());
        Image img62 = new Image(new File("Stå op om morgen.png").toURI().toString());
        Image img72 = new Image(new File("Stå op om morgen.png").toURI().toString());
        Image img82 = new Image(new File("Stå op om morgen.png").toURI().toString());
        Image img92 = new Image(new File("Stå op om morgen.png").toURI().toString());
        Image img1012 = new Image(new File("Stå op om morgen.png").toURI().toString());
        Image img1022 = new Image(new File("Stå op om morgen.png").toURI().toString());
        Image img1032 = new Image(new File("Stå op om morgen.png").toURI().toString());
        Image img1042 = new Image(new File("Stå op om morgen.png").toURI().toString());
        Image img63 = new Image(new File("Stå op om morgen.png").toURI().toString());
        Image img73 = new Image(new File("Stå op om morgen.png").toURI().toString());
        Image img83 = new Image(new File("Stå op om morgen.png").toURI().toString());
        Image img93 = new Image(new File("Stå op om morgen.png").toURI().toString());
        Image img1013 = new Image(new File("Stå op om morgen.png").toURI().toString());
        Image img1023 = new Image(new File("Stå op om morgen.png").toURI().toString());
        Image img1033 = new Image(new File("Stå op om morgen.png").toURI().toString());
        Image img1043 = new Image(new File("Stå op om morgen.png").toURI().toString());
        
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
        imageView61.setImage(img61);
        imageView71.setImage(img71);
        imageView81.setImage(img81);
        imageView91.setImage(img91);
        imageView1901.setImage(img1901);
        imageView1801.setImage(img1801);
        imageView1701.setImage(img1701);
        imageView1601.setImage(img1601);
        imageView1011.setImage(img1011);
        imageView1021.setImage(img1021);
        imageView1031.setImage(img1031);
        imageView1041.setImage(img1041);
        imageView102.setImage(img102);
        imageView103.setImage(img103);
        imageView104.setImage(img104);
        imageView62.setImage(img62);
        imageView72.setImage(img72);
        imageView82.setImage(img82);
        imageView92.setImage(img92);
        imageView1012.setImage(img1012);
        imageView1022.setImage(img1022);
        imageView1032.setImage(img1032);
        imageView1042.setImage(img1042);
        imageView63.setImage(img63);
        imageView73.setImage(img73);
        imageView83.setImage(img83);
        imageView93.setImage(img93);
        imageView1013.setImage(img1013);
        imageView1023.setImage(img1023);
        imageView1033.setImage(img1033);
        imageView1043.setImage(img1043);
        

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
        gridPaneImageView11.setImage(null);
        gridPaneImageView12.setImage(null);
        gridPaneImageView13.setImage(null);
        gridPaneImageView14.setImage(null);
        gridPaneImageView15.setImage(null);
        gridPaneImageView16.setImage(null);
        gridPaneImageView17.setImage(null);
        gridPaneImageView18.setImage(null);
        gridPaneImageView19.setImage(null);
        gridPaneImageView110.setImage(null);
        gridPaneImageView111.setImage(null);
        gridPaneImageView112.setImage(null);
        gridPaneImageView113.setImage(null);
        gridPaneImageView114.setImage(null);
        gridPaneImageView115.setImage(null);
        gridPaneImageView116.setImage(null);
        gridPaneImageView117.setImage(null);
        gridPaneImageView118.setImage(null);
        gridPaneImageView119.setImage(null);
        gridPaneImageView120.setImage(null);
        gridPaneImageView121.setImage(null);
        

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
        } else if (event.getSource() == imageView61) {
            Dragboard db = imageView61.startDragAndDrop(TransferMode.ANY);
            ClipboardContent cb = new ClipboardContent();
            cb.putImage(imageView61.getImage());
            db.setContent(cb);
            event.consume();
            
        } else if (event.getSource() == imageView71) {
            Dragboard db = imageView71.startDragAndDrop(TransferMode.ANY);
            ClipboardContent cb = new ClipboardContent();
            cb.putImage(imageView71.getImage());
            db.setContent(cb);
            event.consume();
        } else if (event.getSource() == imageView81) {
            Dragboard db = imageView81.startDragAndDrop(TransferMode.ANY);
            ClipboardContent cb = new ClipboardContent();
            cb.putImage(imageView81.getImage());
            db.setContent(cb);
            event.consume();
        } else if (event.getSource() == imageView91) {
            Dragboard db = imageView91.startDragAndDrop(TransferMode.ANY);
            ClipboardContent cb = new ClipboardContent();
            cb.putImage(imageView91.getImage());
            db.setContent(cb);
            event.consume();
        } else if (event.getSource() == imageView1011) {
            Dragboard db = imageView1011.startDragAndDrop(TransferMode.ANY);
            ClipboardContent cb = new ClipboardContent();
            cb.putImage(imageView1011.getImage());
            db.setContent(cb);
            event.consume();
        } else if (event.getSource() == imageView1901) {
            Dragboard db = imageView1901.startDragAndDrop(TransferMode.ANY);
            ClipboardContent cb = new ClipboardContent();
            cb.putImage(imageView1901.getImage());
            db.setContent(cb);
            event.consume();
        } else if (event.getSource() == imageView1801) {
            Dragboard db = imageView1801.startDragAndDrop(TransferMode.ANY);
            ClipboardContent cb = new ClipboardContent();
            cb.putImage(imageView1801.getImage());
            db.setContent(cb);
            event.consume();
        } else if (event.getSource() == imageView1701) {
            Dragboard db = imageView1701.startDragAndDrop(TransferMode.ANY);
            ClipboardContent cb = new ClipboardContent();
            cb.putImage(imageView1701.getImage());
            db.setContent(cb);
            event.consume();
        } else if (event.getSource() == imageView1601) {
            Dragboard db = imageView1601.startDragAndDrop(TransferMode.ANY);
            ClipboardContent cb = new ClipboardContent();
            cb.putImage(imageView1601.getImage());
            db.setContent(cb);
            event.consume();
        } else if (event.getSource() == imageView1021) {
            Dragboard db = imageView1021.startDragAndDrop(TransferMode.ANY);
            ClipboardContent cb = new ClipboardContent();
            cb.putImage(imageView1021.getImage());
            db.setContent(cb);
            event.consume();
        } else if (event.getSource() == imageView1031) {
            Dragboard db = imageView1031.startDragAndDrop(TransferMode.ANY);
            ClipboardContent cb = new ClipboardContent();
            cb.putImage(imageView1031.getImage());
            db.setContent(cb);
            event.consume();
        } else if (event.getSource() == imageView1041) {
            Dragboard db = imageView1041.startDragAndDrop(TransferMode.ANY);
            ClipboardContent cb = new ClipboardContent();
            cb.putImage(imageView1041.getImage());
            db.setContent(cb);
            event.consume();
        } else if (event.getSource() == imageView102) {
            Dragboard db = imageView103.startDragAndDrop(TransferMode.ANY);
            ClipboardContent cb = new ClipboardContent();
            cb.putImage(imageView104.getImage());
            db.setContent(cb);
            event.consume();
        } else if (event.getSource() == imageView103) {
            Dragboard db = imageView10.startDragAndDrop(TransferMode.ANY);
            ClipboardContent cb = new ClipboardContent();
            cb.putImage(imageView10.getImage());
            db.setContent(cb);
            event.consume();
        } else if (event.getSource() == imageView104) {
            Dragboard db = imageView10.startDragAndDrop(TransferMode.ANY);
            ClipboardContent cb = new ClipboardContent();
            cb.putImage(imageView10.getImage());
            db.setContent(cb);
            event.consume();
        } else if (event.getSource() == imageView62) {
            Dragboard db = imageView62.startDragAndDrop(TransferMode.ANY);
            ClipboardContent cb = new ClipboardContent();
            cb.putImage(imageView62.getImage());
            db.setContent(cb);
            event.consume();
        } else if (event.getSource() == imageView72) {
            Dragboard db = imageView73.startDragAndDrop(TransferMode.ANY);
            ClipboardContent cb = new ClipboardContent();
            cb.putImage(imageView73.getImage());
            db.setContent(cb);
            event.consume();
        } else if (event.getSource() == imageView82) {
            Dragboard db = imageView82.startDragAndDrop(TransferMode.ANY);
            ClipboardContent cb = new ClipboardContent();
            cb.putImage(imageView82.getImage());
            db.setContent(cb);
            event.consume();
        } else if (event.getSource() == imageView92) {
            Dragboard db = imageView92.startDragAndDrop(TransferMode.ANY);
            ClipboardContent cb = new ClipboardContent();
            cb.putImage(imageView92.getImage());
            db.setContent(cb);
            event.consume();
        } else if (event.getSource() == imageView1012) {
            Dragboard db = imageView1012.startDragAndDrop(TransferMode.ANY);
            ClipboardContent cb = new ClipboardContent();
            cb.putImage(imageView1012.getImage());
            db.setContent(cb);
            event.consume();
        } else if (event.getSource() == imageView1022) {
            Dragboard db = imageView1022.startDragAndDrop(TransferMode.ANY);
            ClipboardContent cb = new ClipboardContent();
            cb.putImage(imageView1022.getImage());
            db.setContent(cb);
            event.consume();
        } else if (event.getSource() == imageView1032) {
            Dragboard db = imageView1032.startDragAndDrop(TransferMode.ANY);
            ClipboardContent cb = new ClipboardContent();
            cb.putImage(imageView1032.getImage());
            db.setContent(cb);
            event.consume();
        } else if (event.getSource() == imageView1042) {
            Dragboard db = imageView1042.startDragAndDrop(TransferMode.ANY);
            ClipboardContent cb = new ClipboardContent();
            cb.putImage(imageView1042.getImage());
            db.setContent(cb);
            event.consume();
        } else if (event.getSource() == imageView63) {
            Dragboard db = imageView63.startDragAndDrop(TransferMode.ANY);
            ClipboardContent cb = new ClipboardContent();
            cb.putImage(imageView63.getImage());
            db.setContent(cb);
            event.consume();
        } else if (event.getSource() == imageView73) {
            Dragboard db = imageView73.startDragAndDrop(TransferMode.ANY);
            ClipboardContent cb = new ClipboardContent();
            cb.putImage(imageView73.getImage());
            db.setContent(cb);
            event.consume();
        } else if (event.getSource() == imageView83) {
            Dragboard db = imageView83.startDragAndDrop(TransferMode.ANY);
            ClipboardContent cb = new ClipboardContent();
            cb.putImage(imageView83.getImage());
            db.setContent(cb);
            event.consume();
        } else if (event.getSource() == imageView93) {
            Dragboard db = imageView93.startDragAndDrop(TransferMode.ANY);
            ClipboardContent cb = new ClipboardContent();
            cb.putImage(imageView93.getImage());
            db.setContent(cb);
            event.consume(); 
        } else if (event.getSource() == imageView1013) {
            Dragboard db = imageView103.startDragAndDrop(TransferMode.ANY);
            ClipboardContent cb = new ClipboardContent();
            cb.putImage(imageView103.getImage());
            db.setContent(cb);
            event.consume();
       
        } else if (event.getSource() == imageView1023) {
            Dragboard db = imageView1023.startDragAndDrop(TransferMode.ANY);
            ClipboardContent cb = new ClipboardContent();
            cb.putImage(imageView1023.getImage());
            db.setContent(cb);
            event.consume();
        } else if (event.getSource() == imageView1033) {
            Dragboard db = imageView1033.startDragAndDrop(TransferMode.ANY);
            ClipboardContent cb = new ClipboardContent();
            cb.putImage(imageView1033.getImage());
            db.setContent(cb);
            event.consume();
        } else if (event.getSource() == imageView1043) {
            Dragboard db = imageView1043.startDragAndDrop(TransferMode.ANY);
            ClipboardContent cb = new ClipboardContent();
            cb.putImage(imageView1043.getImage());
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
        } else if (event.getSource() == gridPaneImageView11) {
            Image img = event.getDragboard().getImage();
            gridPaneImageView11.setImage(img);
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
         }else if (event.getSource() == gridPaneImageView18) {
            Image img = event.getDragboard().getImage();
            gridPaneImageView18.setImage(img);
        } else if (event.getSource() == gridPaneImageView19) {
            Image img = event.getDragboard().getImage();
            gridPaneImageView19.setImage(img);
        } else if (event.getSource() == gridPaneImageView110) {
            Image img = event.getDragboard().getImage();
            gridPaneImageView110.setImage(img);
        } else if (event.getSource() == gridPaneImageView111) {
            Image img = event.getDragboard().getImage();
            gridPaneImageView111.setImage(img);
        } else if (event.getSource() == gridPaneImageView112) {
            Image img = event.getDragboard().getImage();
            gridPaneImageView112.setImage(img);
        } else if (event.getSource() == gridPaneImageView113) {
            Image img = event.getDragboard().getImage();
            gridPaneImageView113.setImage(img);
        } else if (event.getSource() == gridPaneImageView114) {
            Image img = event.getDragboard().getImage();
            gridPaneImageView114.setImage(img);
        } else if (event.getSource() == gridPaneImageView115) {
            Image img = event.getDragboard().getImage();
            gridPaneImageView115.setImage(img);
        } else if (event.getSource() == gridPaneImageView116) {
            Image img = event.getDragboard().getImage();
            gridPaneImageView116.setImage(img);
        } else if (event.getSource() == gridPaneImageView117) {
            Image img = event.getDragboard().getImage();
            gridPaneImageView117.setImage(img);
        } else if (event.getSource() == gridPaneImageView118) {
            Image img = event.getDragboard().getImage();
            gridPaneImageView118.setImage(img);
        } else if (event.getSource() == gridPaneImageView119) {
            Image img = event.getDragboard().getImage();
            gridPaneImageView119.setImage(img);
        } else if (event.getSource() == gridPaneImageView120) {
            Image img = event.getDragboard().getImage();
            gridPaneImageView120.setImage(img);
        } else if (event.getSource() == gridPaneImageView121) {
            Image img = event.getDragboard().getImage();
            gridPaneImageView121.setImage(img);
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
        Image img11 = gridPaneImageView11.getImage();
        Image img12 = gridPaneImageView12.getImage();
        Image img13 = gridPaneImageView13.getImage();
        Image img14 = gridPaneImageView14.getImage();
        Image img15 = gridPaneImageView15.getImage();
        Image img16 = gridPaneImageView16.getImage();
        Image img17 = gridPaneImageView17.getImage();
        Image img18 = gridPaneImageView18.getImage();
        Image img19 = gridPaneImageView19.getImage();
        Image img110 = gridPaneImageView110.getImage();
        Image img111 = gridPaneImageView111.getImage();
        Image img112 = gridPaneImageView112.getImage();
        Image img113 = gridPaneImageView113.getImage();
        Image img114 = gridPaneImageView114.getImage();
        Image img115 = gridPaneImageView115.getImage();
        Image img116 = gridPaneImageView116.getImage();
        Image img117 = gridPaneImageView117.getImage();
        Image img118 = gridPaneImageView118.getImage();
        Image img119 = gridPaneImageView119.getImage();
        Image img120 = gridPaneImageView120.getImage();
        Image img121 = gridPaneImageView121.getImage();
        
        showSchemaImageView1.setImage(img1);
        showSchemaImageView2.setImage(img2);
        showSchemaImageView3.setImage(img3);
        showSchemaImageView4.setImage(img4);
        showSchemaImageView5.setImage(img5);
        showSchemaImageView6.setImage(img6);
        showSchemaImageView7.setImage(img7);
        showSchemaImageView8.setImage(img8);
        showSchemaImageView9.setImage(img9);
        showSchemaImageView91.setImage(img11);
        showSchemaImageView92.setImage(img12);
        showSchemaImageView93.setImage(img13);
        showSchemaImageView94.setImage(img14);
        showSchemaImageView95.setImage(img15);
        showSchemaImageView96.setImage(img16);
        showSchemaImageView97.setImage(img17);
        showSchemaImageView98.setImage(img18);
        showSchemaImageView99.setImage(img19);
        showSchemaImageView910.setImage(img110);
        showSchemaImageView911.setImage(img111);
        showSchemaImageView912.setImage(img112);
        showSchemaImageView913.setImage(img113);
        showSchemaImageView914.setImage(img114);
        showSchemaImageView915.setImage(img115);
        showSchemaImageView916.setImage(img116);
        showSchemaImageView917.setImage(img117);
        showSchemaImageView918.setImage(img118);
        showSchemaImageView919.setImage(img119);
        showSchemaImageView920.setImage(img120);
        showSchemaImageView921.setImage(img121);
        
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
        showSchemaImageView91.setImage(null);
        showSchemaImageView92.setImage(null);
        showSchemaImageView93.setImage(null);
        showSchemaImageView94.setImage(null);
        showSchemaImageView95.setImage(null);
        showSchemaImageView96.setImage(null);
        showSchemaImageView97.setImage(null);
        showSchemaImageView98.setImage(null);
        showSchemaImageView99.setImage(null);
        showSchemaImageView910.setImage(null);
        showSchemaImageView911.setImage(null);
        showSchemaImageView912.setImage(null);
        showSchemaImageView913.setImage(null);
        showSchemaImageView914.setImage(null);
        showSchemaImageView915.setImage(null);
        showSchemaImageView916.setImage(null);
        showSchemaImageView917.setImage(null);
        showSchemaImageView918.setImage(null);
        showSchemaImageView919.setImage(null);
        showSchemaImageView920.setImage(null);
        showSchemaImageView921.setImage(null);
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
