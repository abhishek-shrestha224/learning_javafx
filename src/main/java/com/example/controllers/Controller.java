package com.example.controllers;

import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

public class Controller {

  @FXML
  private Circle myCircle;
  private double x, y;

  @FXML
  public void up() {
    System.out.println("UP");
    myCircle.setCenterY(y -= 1);
  }

  @FXML
  public void down() {
    System.out.println("DOWN");
    myCircle.setCenterY(y += 1);
  }

  @FXML
  public void left() {
    System.out.println("LEFT");
    myCircle.setCenterX(x -= 1);
  }

  @FXML
  public void right() {
    System.out.println("RIGHT");
    myCircle.setCenterX(x += 1);
  }

}
