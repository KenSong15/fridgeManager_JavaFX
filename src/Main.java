package UI;

import Data.Constants;
import Model.Drink;
import Model.Food;
import Model.Fridge;
import Model.Person;
import Util.Checker;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main extends Application {

    public static Parent loginStage;
    public static Parent manageStage;

    @Override
    public void start(Stage primaryStage) throws Exception{
        loginStage = FXMLLoader.load(getClass().getResource("loginPop/loginFrame.fxml"));
        manageStage = FXMLLoader.load(getClass().getResource("manager/manageFrame.fxml"));

        Stage friStage = new Stage();
        friStage.setScene(new Scene(loginStage));
        Stage secStage = new Stage();
        secStage.setScene(new Scene(manageStage));

        friStage.show();
        secStage.show();


//        primaryStage.setTitle("Hello World");
//        primaryStage.setScene(new Scene(manageStage));
//        primaryStage.show();
    }


    public static void main(String[] args) {

        launch(args);

    }
}
