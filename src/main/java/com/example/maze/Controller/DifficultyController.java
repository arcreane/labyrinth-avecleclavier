package com.example.maze.Controller;


import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;


public class DifficultyController implements Initializable {

    @FXML
    private Pane boxDifficulty;

    @FXML
    private Button btn_confirm_hard;

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

    @FXML
    private ChoiceBox<String> choice_difficulty;

    @FXML
    private Label get_text;

    @FXML
    private String[] level = {"Easy","Normal","Hard"};


    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {

        choice_difficulty.getItems().addAll(level);
        choice_difficulty.setOnAction(this::getlevel);

    }

    public void getlevel (ActionEvent event){

        String mydifficulties = choice_difficulty.getValue();
        get_text.setText(mydifficulties);

    }

}