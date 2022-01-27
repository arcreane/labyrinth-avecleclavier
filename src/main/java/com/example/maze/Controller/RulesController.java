package com.example.maze.Controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class RulesController implements Initializable {

    @FXML
    private Button btn_confirm_rules;

    @FXML
    private AnchorPane image_rules;

    @FXML
    private TextField phrase1_rules;

    @FXML
    private TextField phrase2_rules;

    @FXML
    private TextField phrase3_rules;

    @FXML
    private TextField phrase4_rules;

    @FXML
    private TextField txt_rules;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        if (!image_rules.isVisible()){
            image_rules.getChildren().addAll(phrase1_rules,phrase2_rules,phrase3_rules,phrase4_rules,txt_rules,btn_confirm_rules);
            image_rules.setVisible(true);
        }

        btn_confirm_rules.setOnMouseClicked(confirm_rules->{
            if(!confirm_rules.getButton().equals(MouseButton.PRIMARY)){
                if (image_rules.isVisible()){
                    image_rules.getChildren().removeAll(phrase1_rules,phrase2_rules,phrase3_rules,phrase4_rules,txt_rules,btn_confirm_rules);
                    image_rules.setVisible(false);
                }
            }
        });
    }
}
