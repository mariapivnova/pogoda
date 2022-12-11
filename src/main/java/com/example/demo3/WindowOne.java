package com.example.demo3;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.*;

public class WindowOne {


    @FXML
    private Button addname;

    @FXML
    private Button addpass;

    @FXML
    private Button addsurname;

    @FXML
    private Button further;

    @FXML
    private ImageView image;

    @FXML
    private TextField name;

    @FXML
    private TextField pass;

    @FXML
    private TextField surname;
    @FXML
    public void initialize() {
        addname.setOnAction(clik -> {
            try {
                String line=(name.getText());
                FileOutputStream fileOutputStream =new FileOutputStream("C:\\Users\\User\\IdeaProjects\\demo3\\src\\main\\resources\\com\\example\\demo3\\inputName.txt");
                byte[] buffer=line.getBytes();
                fileOutputStream.write(buffer);
                System.out.println("Имя сохранено");
            } catch (Exception e) {
                System.out.println("Имя не удалось сохранить");
            }
        });
        addsurname.setOnAction(clik -> {
            try {
                String line=(surname.getText());
                FileOutputStream fileOutputStream =new FileOutputStream("C:\\Users\\User\\IdeaProjects\\demo3\\src\\main\\resources\\com\\example\\demo3\\inputSurname.txt");
                byte[] buffer=line.getBytes();
                fileOutputStream.write(buffer);
                System.out.println("Фамилия сохранена");
            } catch (Exception e) {
                System.out.println("Фамилию не удалось сохранить");
            }
        });
        addpass.setOnAction(clik -> {
            try {
                String line=(pass.getText());
                FileOutputStream fileOutputStream =new FileOutputStream("C:\\Users\\User\\IdeaProjects\\demo3\\src\\main\\resources\\com\\example\\demo3\\inputPass.txt");
                byte[] buffer=line.getBytes();
                fileOutputStream.write(buffer);
                System.out.println("Пароль сохранен");
            } catch (Exception e) {
                System.out.println("Пароль не удалось сохранить");
            }
        });
        further.setOnAction(clik -> {
            try {


                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("windowTwo.fxml"));
                loader.load();
                Parent root = loader.getRoot();
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.show();
                stage.setTitle("Погода ");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
    }

}



