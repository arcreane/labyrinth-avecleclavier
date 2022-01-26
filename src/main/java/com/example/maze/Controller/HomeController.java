package com.example.maze.Controller;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

import java.net.URL;
import java.util.ResourceBundle;

public class HomeController implements Initializable {

    @FXML
    private VBox boxGame;

    @FXML
    private VBox boxGlobal;

    @FXML
    private VBox boxOptions;

    @FXML
    private VBox boxRules;

    @FXML
    private Button btn_option;

    @FXML
    private Button btn_rules;

    @FXML
    private Button btn_play;

    @FXML
    private Button btn_quit;

    @FXML
    private AnchorPane interface_menu;

    @FXML
    private AnchorPane master_anchor;

    @FXML
    private Button btn_menu;

    @FXML
    private Font x1;

    @FXML
    private Color x2;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        interface_menu.getChildren().removeAll(btn_play,btn_option,btn_quit,btn_rules);
        boxGlobal.getChildren().removeAll(boxGame,boxRules,boxOptions);


        btn_menu.setOnMouseClicked(action -> {
            interface_menu.getChildren().addAll(btn_play,btn_rules,btn_option,btn_quit);
        });

        btn_quit.setOnAction(action -> {
            Platform.exit();

        });

    }
}
