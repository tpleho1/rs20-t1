package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Controller {

    public Label helloWorld;
    public GridPane grid;
    public void actionButton(ActionEvent actionEvent){
    }

    public void actionButton(javafx.event.ActionEvent actionEvent) {

        helloWorld.setText("Hello World !");

        grid.setId("grid1");


    }
}
