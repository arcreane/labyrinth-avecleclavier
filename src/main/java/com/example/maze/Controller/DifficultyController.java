package com.example.maze.Controller;


import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;


public class DifficultyController implements Initializable {

    @FXML
    private Button btn_confirm_hard;

    @FXML
    private CheckBox check_easy;

    @FXML
    private CheckBox check_hard;

    @FXML
    private CheckBox check_normal;

    @FXML
    private Pane boxDifficulty;

    @FXML
    private Line line2;

    @FXML
    private Line line3;

    @FXML
    private Line line4;

    @FXML
    private Rectangle square;

    @FXML
    private Rectangle square2;

    @FXML
    private Rectangle square3;

    @FXML
    private TextField txt_title;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


        btn_confirm_hard.setOnMouseClicked(confirm->{
            if(confirm.getButton().equals(MouseButton.PRIMARY)){
                boxDifficulty.getChildren().removeAll(check_easy,check_normal,check_hard,btn_confirm_hard,txt_title,square,square2,square3,line2,line3,line4);
            }
        });

    }
}