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
import javafx.scene.layout.VBox;
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
    @FXML
    private VBox vBox1;
    @FXML
    private VBox vBox2;
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
    private VBox vBox3;
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
    private VBox vBox4;
    @FXML
    private ImageView imageView28;
    @FXML
    private ImageView imageView29;
    @FXML
    private ImageView imageView30;
    @FXML
    private ImageView imageView31;
    @FXML
    private ImageView imageView32;
    @FXML
    private ImageView imageView33;
    @FXML
    private ImageView imageView34;
    @FXML
    private ImageView imageView35;
    @FXML
    private ImageView imageView36;
    @FXML
    private ImageView gridPaneImageView10;
    @FXML
    private ImageView gridPaneImageView20;
    @FXML
    private ImageView gridPaneImageView21;
    @FXML
    private ImageView gridPaneImageView22;
    @FXML
    private ImageView gridPaneImageView23;
    @FXML
    private ImageView gridPaneImageView24;
    @FXML
    private ImageView gridPaneImageView25;
    @FXML
    private ImageView gridPaneImageView26;
    @FXML
    private ImageView gridPaneImageView27;
    @FXML
    private ImageView gridPaneImageView28;
    @FXML
    private ImageView gridPaneImageView29;
    @FXML
    private ImageView gridPaneImageView30;
    @FXML
    private ImageView showSchemaImageView10;
    @FXML
    private ImageView showSchemaImageView11;
    @FXML
    private ImageView showSchemaImageView12;
    @FXML
    private ImageView showSchemaImageView13;
    @FXML
    private ImageView showSchemaImageView14;
    @FXML
    private ImageView showSchemaImageView15;
    @FXML
    private ImageView showSchemaImageView16;
    @FXML
    private ImageView showSchemaImageView17;
    @FXML
    private ImageView showSchemaImageView18;
    @FXML
    private ImageView showSchemaImageView19;
    @FXML
    private ImageView showSchemaImageView20;
    @FXML
    private ImageView showSchemaImageView21;
    @FXML
    private ImageView showSchemaImageView22;
    @FXML
    private ImageView showSchemaImageView23;
    @FXML
    private ImageView showSchemaImageView24;
    @FXML
    private ImageView showSchemaImageView25;
    @FXML
    private ImageView showSchemaImageView26;
    @FXML
    private ImageView showSchemaImageView27;
    @FXML
    private ImageView showSchemaImageView28;
    @FXML
    private ImageView showSchemaImageView29;
    @FXML
    private ImageView showSchemaImageView30;

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
        Image img11 = new Image(new File("Stå op om morgen.png").toURI().toString());
        Image img12 = new Image(new File("Aftensmad.png").toURI().toString());
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
        Image img28 = new Image(new File("psykolog.png").toURI().toString());
        Image img29 = new Image(new File("pædagog.png").toURI().toString());
        Image img30 = new Image(new File("rede hår.png").toURI().toString());
        Image img31 = new Image(new File("samling.png").toURI().toString());
        Image img32 = new Image(new File("svømning.png").toURI().toString());
        Image img33 = new Image(new File("tage tøj på.png").toURI().toString());
        Image img34 = new Image(new File("tandlæge.png").toURI().toString());
        Image img35 = new Image(new File("toilettræning.png").toURI().toString());
        Image img36 = new Image(new File("gøre rent.png").toURI().toString());
      

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
        imageView28.setImage(img28);
        imageView29.setImage(img29);
        imageView30.setImage(img30);
        imageView31.setImage(img31);
        imageView32.setImage(img32);
        imageView33.setImage(img33);
        imageView34.setImage(img34);
        imageView35.setImage(img35);
        imageView36.setImage(img36);

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
        gridPaneImageView20.setImage(null);
        gridPaneImageView21.setImage(null);
        gridPaneImageView22.setImage(null);
        gridPaneImageView23.setImage(null);
        gridPaneImageView24.setImage(null);
        gridPaneImageView25.setImage(null);
        gridPaneImageView26.setImage(null);
        gridPaneImageView27.setImage(null);
        gridPaneImageView28.setImage(null);
        gridPaneImageView29.setImage(null);
        gridPaneImageView30.setImage(null);

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
        } else if (event.getSource() == imageView28) {
            Dragboard db = imageView29.startDragAndDrop(TransferMode.ANY);
            ClipboardContent cb = new ClipboardContent();
            cb.putImage(imageView29.getImage());
            db.setContent(cb);
            event.consume();
        } else if (event.getSource() == imageView30) {
            Dragboard db = imageView30.startDragAndDrop(TransferMode.ANY);
            ClipboardContent cb = new ClipboardContent();
            cb.putImage(imageView30.getImage());
            db.setContent(cb);
            event.consume();
        } else if (event.getSource() == imageView31) {
            Dragboard db = imageView31.startDragAndDrop(TransferMode.ANY);
            ClipboardContent cb = new ClipboardContent();
            cb.putImage(imageView31.getImage());
            db.setContent(cb);
            event.consume();
        } else if (event.getSource() == imageView32) {
            Dragboard db = imageView32.startDragAndDrop(TransferMode.ANY);
            ClipboardContent cb = new ClipboardContent();
            cb.putImage(imageView32.getImage());
            db.setContent(cb);
            event.consume();
        } else if (event.getSource() == imageView33) {
            Dragboard db = imageView33.startDragAndDrop(TransferMode.ANY);
            ClipboardContent cb = new ClipboardContent();
            cb.putImage(imageView33.getImage());
            db.setContent(cb);
            event.consume();
        } else if (event.getSource() == imageView34) {
            Dragboard db = imageView34.startDragAndDrop(TransferMode.ANY);
            ClipboardContent cb = new ClipboardContent();
            cb.putImage(imageView34.getImage());
            db.setContent(cb);
            event.consume();
        } else if (event.getSource() == imageView35) {
            Dragboard db = imageView35.startDragAndDrop(TransferMode.ANY);
            ClipboardContent cb = new ClipboardContent();
            cb.putImage(imageView35.getImage());
            db.setContent(cb);
            event.consume();
        } else if (event.getSource() == imageView36) {
            Dragboard db = imageView36.startDragAndDrop(TransferMode.ANY);
            ClipboardContent cb = new ClipboardContent();
            cb.putImage(imageView36.getImage());
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
        } else if (event.getSource() == gridPaneImageView21) {
            Image img = event.getDragboard().getImage();
            gridPaneImageView21.setImage(img);
        } else if (event.getSource() == gridPaneImageView22) {
            Image img = event.getDragboard().getImage();
            gridPaneImageView22.setImage(img);
        } else if (event.getSource() == gridPaneImageView23) {
            Image img = event.getDragboard().getImage();
            gridPaneImageView23.setImage(img);
        } else if (event.getSource() == gridPaneImageView24) {
            Image img = event.getDragboard().getImage();
            gridPaneImageView24.setImage(img);
        } else if (event.getSource() == gridPaneImageView25) {
            Image img = event.getDragboard().getImage();
            gridPaneImageView25.setImage(img);
        } else if (event.getSource() == gridPaneImageView26) {
            Image img = event.getDragboard().getImage();
            gridPaneImageView26.setImage(img);
        } else if (event.getSource() == gridPaneImageView27) {
            Image img = event.getDragboard().getImage();
            gridPaneImageView27.setImage(img);
        } else if (event.getSource() == gridPaneImageView28) {
            Image img = event.getDragboard().getImage();
            gridPaneImageView28.setImage(img);
        } else if (event.getSource() == gridPaneImageView29) {
            Image img = event.getDragboard().getImage();
            gridPaneImageView29.setImage(img);
        } else if (event.getSource() == gridPaneImageView30) {
            Image img = event.getDragboard().getImage();
            gridPaneImageView30.setImage(img);

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
        Image img10 = gridPaneImageView9.getImage();
        Image img11 = gridPaneImageView11.getImage();
        Image img12 = gridPaneImageView12.getImage();
        Image img13 = gridPaneImageView13.getImage();
        Image img14 = gridPaneImageView14.getImage();
        Image img15 = gridPaneImageView15.getImage();
        Image img16 = gridPaneImageView16.getImage();
        Image img17 = gridPaneImageView17.getImage();
        Image img18 = gridPaneImageView18.getImage();
        Image img19 = gridPaneImageView19.getImage();
        Image img20 = gridPaneImageView20.getImage();
        Image img21 = gridPaneImageView21.getImage();
        Image img22 = gridPaneImageView22.getImage();
        Image img23 = gridPaneImageView23.getImage();
        Image img24 = gridPaneImageView24.getImage();
        Image img25 = gridPaneImageView25.getImage();
        Image img26 = gridPaneImageView26.getImage();
        Image img27 = gridPaneImageView27.getImage();
        Image img28 = gridPaneImageView28.getImage();
        Image img29 = gridPaneImageView29.getImage();
        Image img30 = gridPaneImageView30.getImage();

        showSchemaImageView1.setImage(img1);
        showSchemaImageView2.setImage(img2);
        showSchemaImageView3.setImage(img3);
        showSchemaImageView4.setImage(img4);
        showSchemaImageView5.setImage(img5);
        showSchemaImageView6.setImage(img6);
        showSchemaImageView7.setImage(img7);
        showSchemaImageView8.setImage(img8);
        showSchemaImageView9.setImage(img9);
        showSchemaImageView10.setImage(img10);
        showSchemaImageView11.setImage(img11);
        showSchemaImageView11.setImage(img12);
        showSchemaImageView12.setImage(img13);
        showSchemaImageView13.setImage(img14);
        showSchemaImageView14.setImage(img15);
        showSchemaImageView15.setImage(img16);
        showSchemaImageView16.setImage(img17);
        showSchemaImageView17.setImage(img18);
        showSchemaImageView18.setImage(img19);
        showSchemaImageView19.setImage(img20);
        showSchemaImageView20.setImage(img21);
        showSchemaImageView21.setImage(img22);
        showSchemaImageView22.setImage(img23);
        showSchemaImageView23.setImage(img24);
        showSchemaImageView24.setImage(img25);
        showSchemaImageView25.setImage(img26);
        showSchemaImageView26.setImage(img27);
        showSchemaImageView27.setImage(img28);
        showSchemaImageView28.setImage(img29);
        showSchemaImageView29.setImage(img30);

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
        showSchemaImageView10.setImage(null);
        showSchemaImageView11.setImage(null);
        showSchemaImageView12.setImage(null);
        showSchemaImageView13.setImage(null);
        showSchemaImageView14.setImage(null);
        showSchemaImageView15.setImage(null);
        showSchemaImageView16.setImage(null);
        showSchemaImageView17.setImage(null);
        showSchemaImageView18.setImage(null);
        showSchemaImageView19.setImage(null);
        showSchemaImageView20.setImage(null);
        showSchemaImageView21.setImage(null);
        showSchemaImageView22.setImage(null);
        showSchemaImageView23.setImage(null);
        showSchemaImageView24.setImage(null);
        showSchemaImageView25.setImage(null);
        showSchemaImageView26.setImage(null);
        showSchemaImageView27.setImage(null);
        showSchemaImageView28.setImage(null);
        showSchemaImageView29.setImage(null);
        showSchemaImageView30.setImage(null);
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
