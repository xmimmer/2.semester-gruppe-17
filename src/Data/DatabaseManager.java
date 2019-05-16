/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;


import java.net.URL;

import java.util.ResourceBundle;

import javafx.fxml.Initializable;

/**
 *
 * @author Mimmer
 */
public class DatabaseManager implements Initializable {

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public String getDatabaseURL() {
        return "jdbc:postgresql://balarama.db.elephantsql.com:5432/beucjfoi";
    }

    public String getDatabaseUsername() {
        return "beucjfoi";
    }

    public String getDatabasePassword() {
        return "EXQJyo9fmXNKkqC-CVoGoI2kE9XinAP8";
    }

    public String getSecondDatabaseURL() {
        return "jdbc:postgresql://balarama.db.elephantsql.com:5432/cbsbnvky";
    }

    public String getSecondDatabaseUsername() {
        return "cbsbnvky";
    }

    public String getSecondDatabasePassword() {
        return "aGk4yWvjGnEhloZEiNEXpV9pXrPLj_RQ";
    }

}
