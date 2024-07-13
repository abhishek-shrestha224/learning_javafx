package com.example.controllers;

import java.io.IOException;

import javafx.event.ActionEvent;

public class HomeController extends Controller {

  public void login(ActionEvent event) throws IOException {
    switchScene(event, "/views/Login.fxml");
  }

}
