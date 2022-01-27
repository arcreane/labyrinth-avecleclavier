package com.example.maze.Controller;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import java.net.URL;
import java.util.ResourceBundle;

public class HomeController implements Initializable {

    @FXML
    private HBox boxDifficulty;

    @FXML
    private VBox boxGame;

    @FXML
    private VBox boxGlobal;

    @FXML
    private VBox boxLabirynthe;

    @FXML
    private VBox boxOptions;

    @FXML
    private VBox boxRules;

    @FXML
    private VBox box_Recents;

    @FXML
    private Button btn_menu;

    @FXML
    private Button btn_options;

    @FXML
    private Button btn_play;

    @FXML
    private Button btn_quit;

    @FXML
    private Button btn_recents;

    @FXML
    private Button btn_rules;

    @FXML
    private AnchorPane interface_menu;

    @FXML
    private AnchorPane master_anchor;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        interface_menu.getChildren().removeAll(btn_play,btn_options,btn_quit,btn_rules,btn_recents);
        boxGlobal.getChildren().removeAll(boxGame,boxRules,boxOptions,boxDifficulty);


        btn_menu.setOnMouseClicked(action -> {
            if(action.getButton().equals(MouseButton.PRIMARY)){
                if(!interface_menu.isVisible()){
                    interface_menu.getChildren().addAll(btn_play,btn_rules,btn_options,btn_quit,btn_recents);
                    interface_menu.setVisible(true);
                }
                else if(interface_menu.isVisible()){
                    interface_menu.getChildren().removeAll(btn_play,btn_rules,btn_options,btn_quit,btn_recents);
                    interface_menu.setVisible(false);
                }
            };
        });

        btn_play.setOnMouseClicked(option->{
            boxGlobal.getChildren().addAll(boxDifficulty);
        });

        btn_rules.setOnMouseClicked(option->{
            boxGlobal.getChildren().addAll(boxRules);
        });

        btn_options.setOnMouseClicked(option->{
            boxGlobal.getChildren().addAll(boxOptions);
        });

        btn_quit.setOnAction(action -> {
            Platform.exit();
        });

    }
}
