package com.example.maze.Controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;

import java.net.URL;
import java.util.ResourceBundle;

public class GameController implements Initializable {

    @FXML
    private AnchorPane anchor_game;

    @FXML
    private Button btn_start;

    @FXML
    private Label get_Text_i;

    @FXML
    private Label get_Text_j;

    @FXML
    private GridPane labyrinthe;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        anchor_game.getChildren().removeAll(labyrinthe);
        Pane button1 = new Pane();
        Pane button2 = new Pane();
        Pane button3 = new Pane();
        Pane button4 = new Pane();
        Pane button5 = new Pane();
        Pane button6 = new Pane();

        Pane button7 = new Pane();

        Pane button8 = new Pane();
        Pane button9 = new Pane();
        Pane button10 = new Pane();




        button1.setMinWidth(50);
        button1.setMinHeight(50);
        button1.setStyle("-fx-background-color: green;-fx-border-color: transparent transparent red transparent;");
        button5.setStyle("-fx-border-color: transparent transparent red transparent;");
        button5.setMaxWidth(Region.USE_PREF_SIZE);

        String nb_i = get_Text_i.getText();
        String nb_j = get_Text_j.getText();



        GridPane gridPane = new GridPane();

        gridPane.add(button1, 0, 0, 1, 1);
        gridPane.add(button2, 1, 0, 1, 1);
        gridPane.add(button3, 2, 0, 1, 1);
        gridPane.add(button4, 0, 1, 1, 1);
        gridPane.add(button5, 10, 10, 1, 1);
        gridPane.add(button6, 0, 0, 1, 1);
        gridPane.add(button7, 1, 0, 1, 1);
        gridPane.add(button8, 2, 0, 1, 1);
        gridPane.add(button9, 0, 1, 1, 1);
        gridPane.add(button10, 10, 10, 1, 1);
         btn_start.setOnMouseClicked(action ->{
            if(!anchor_game.getChildren().contains(gridPane))
                anchor_game.getChildren().add(gridPane);
        });


    }
}