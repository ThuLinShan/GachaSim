package com.example.gachademo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class Scene1Controller {

    @FXML
    Button toScene3;
    @FXML
    Button toScene2;
    private Stage stage;
    private Scene scene;
    private FXMLLoader root;

    public void toScene2(ActionEvent e) throws IOException {
        root = new FXMLLoader(getClass().getResource("Scene2.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root.load());
        stage.setScene(scene);
        stage.setTitle("May gacha god bless you.");
        stage.setFullScreen(true);
        stage.show();
    }

    public void toScene3(ActionEvent e)throws  IOException{

        root = new FXMLLoader(getClass().getResource("Scene3.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root.load());
        stage.setScene(scene);
        stage.setTitle("May gacha god bless you.");
        stage.show();
    }
}
