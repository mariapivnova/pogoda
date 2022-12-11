package com.example.demo3;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;



public class WindowTwo {

    @FXML
    private Button button;

    @FXML
    private TextField text;

    @FXML
    private TextField texte;

    @FXML
    private TextField pass;

    @FXML
    void initialize() {


        button.setOnAction(clik -> {
            button.setText("Спасибо за регистрацию ");
            System.out.println("Имя: " + text.getText());
            System.out.println("Фамилия: " + texte.getText());
            System.out.println("Пароль: " + pass.getText());
            button.getScene().getWindow().hide();


            try {
                BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\User\\IdeaProjects\\demo3\\src\\main\\resources\\com\\example\\demo3\\inputName.txt")) {
                };
                String line;
                while ((line = reader.readLine()) != null) {
                    if (line.equals(texte.getText().trim())){
                        try {
                            FXMLLoader loader = new FXMLLoader();
                            loader.setLocation(getClass().getResource("date.fxml"));
                            loader.load();
                            Parent root = loader.getRoot();
                            Stage stage = new Stage();
                            stage.setScene(new Scene(root));
                            stage.show();
                            stage.setTitle("Погода");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                    }else {
                        FXMLLoader loader = new FXMLLoader();
                        loader.setLocation(getClass().getResource("error.fxml"));
                        loader.load();
                        Parent root = loader.getRoot();
                        Stage stage = new Stage();
                        stage.setScene(new Scene(root));
                        stage.show();
                        stage.setTitle("Погода ");
                    }
                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\User\\IdeaProjects\\demo3\\src\\main\\resources\\com\\example\\demo3\\inputPass.txt")) {
                };
                String line;
                while ((line = reader.readLine()) != null) {
                    if (line.equals(pass.getText().trim())){
                        try {
                            FXMLLoader loader = new FXMLLoader();
                            loader.setLocation(getClass().getResource("date.fxml"));
                            loader.load();
                            Parent root = loader.getRoot();
                            Stage stage = new Stage();
                            stage.setScene(new Scene(root));
                            stage.show();
                            stage.setTitle("Погода ");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                    }else {
                        FXMLLoader loader = new FXMLLoader();
                        loader.setLocation(getClass().getResource("error.fxml"));
                        loader.load();
                        Parent root = loader.getRoot();
                        Stage stage = new Stage();
                        stage.setScene(new Scene(root));
                        stage.show();
                        stage.setTitle("Погода ");
                    }
                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\User\\IdeaProjects\\demo3\\src\\main\\resources\\com\\example\\demo3\\inputSurname.txt")) {
                };
                String line;
                while ((line = reader.readLine()) != null) {

                    if (line.equals(text.getText().trim())){
                        try {
                            FXMLLoader loader = new FXMLLoader();
                            loader.setLocation(getClass().getResource("date.fxml"));
                            loader.load();
                            Parent root = loader.getRoot();
                            Stage stage = new Stage();
                            stage.setScene(new Scene(root));
                            stage.show();
                            stage.setTitle("Погода ");
                        } catch (Exception e) {
                            FXMLLoader loader = new FXMLLoader();
                            loader.setLocation(getClass().getResource("error.fxml"));
                            loader.load();
                            Parent root = loader.getRoot();
                            Stage stage = new Stage();
                            stage.setScene(new Scene(root));
                            stage.show();
                            stage.setTitle("Погода ");
                            e.printStackTrace();
                        }


                    }else {
                        FXMLLoader loader = new FXMLLoader();
                        loader.setLocation(getClass().getResource("error.fxml"));
                        loader.load();
                        Parent root = loader.getRoot();
                        Stage stage = new Stage();
                        stage.setScene(new Scene(root));
                        stage.show();
                        stage.setTitle("Погода ");
                    }

                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }

}
