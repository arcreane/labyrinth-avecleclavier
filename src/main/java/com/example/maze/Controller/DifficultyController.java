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
    private Rectangle carre1;

    @FXML
    private Rectangle carre2;

    @FXML
    private Rectangle carre3;

    @FXML
    private Pane pane_carre1;

    @FXML
    private Pane pane_carre2;

    @FXML
    private Pane pane_carre3;

    @FXML
    private TextField txt_title;

    @FXML
    private ChoiceBox<String> choice_difficulty;

    @FXML
    private Label get_text;

    @FXML
    private String[] level = {"Easy", "Normal", "Hard"};


    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {

        boxDifficulty.getChildren().removeAll(pane_carre1, pane_carre2, pane_carre3, carre1, carre2, carre3, line2, line3, line4);

        choice_difficulty.getItems().addAll(level);
        choice_difficulty.setOnAction(this::getlevel);

    }

    public void getlevel(ActionEvent event) {

        String mydifficulties = choice_difficulty.getValue();
        get_text.setText(mydifficulties);

        if (get_text.getText().equals("Easy")) {
            if (!pane_carre1.isVisible()) {
                pane_carre1.getChildren().addAll(carre1);
                pane_carre1.setVisible(true);
            } else if (pane_carre1.isVisible()) {
                pane_carre1.getChildren().removeAll(carre1);
                pane_carre1.setVisible(false);
            }
        } else if (get_text.getText().equals("Normal")) {

            if (!pane_carre2.isVisible()) {
                pane_carre2.getChildren().addAll(carre2, line2);
                pane_carre2.setVisible(true);
            } else if (pane_carre2.isVisible()) {
                pane_carre2.getChildren().removeAll(carre2, line2);

            }
        } else if (get_text.getText().equals("Hard")) {

            if (!pane_carre3.isVisible()) {
                pane_carre3.getChildren().addAll(carre3, line3, line4);
            } else if (pane_carre3.isVisible()) {
                pane_carre3.getChildren().removeAll(carre3, line3, line4);
            }
        }
    }
}