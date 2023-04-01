package com.example.team6777;

import connectivity.ConnectionClass;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class HelloController {

    @FXML
    private TextField email;

    @FXML
    private TextField mobile;

    @FXML
    private TextField name;

    @FXML
    private TextField password;

    @FXML
    void signupbutton(ActionEvent event) throws SQLException, ClassNotFoundException {

        ConnectionClass connectionClass = new ConnectionClass();
        Connection connection = connectionClass.getConnetion();

        String sql =("INSERT INTO Sign_up (name,email,mobile,password) VALUES('" +name+ "','" + email + "','" + mobile + "','" + password  + "')");
        Statement statement = connection.createStatement();
        statement.executeUpdate(sql);

    }

}


