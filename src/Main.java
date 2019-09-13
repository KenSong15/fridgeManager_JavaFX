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

import java.time.Clock;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main extends Application {

    public Parent loginParent;
    public Parent manageParent;

    @Override
    public void start(Stage primaryStage) throws Exception{
        loginParent = FXMLLoader.load(getClass().getResource("UI/loginPop/loginFrame.fxml"));
        manageParent = FXMLLoader.load(getClass().getResource("UI/manager/manageFrame.fxml"));

        Stage loginStage = new Stage();
        loginStage.setTitle("login to FridgeManager");
        loginStage.setScene(new Scene(loginParent));

        Stage manageStage = new Stage();
        manageStage.setTitle("FridgeManager");
        manageStage.setScene(new Scene(manageParent));

        //loginStage.show();
        manageStage.show();

    }

    public static void testModel(){
        System.out.println("testModel start here");

        Calendar calNow = Calendar.getInstance();

        Calendar calIn3day = Calendar.getInstance();
        calIn3day.add(Calendar.DATE,3);

        Calendar calIn2month = Calendar.getInstance();
        calIn2month.add(Calendar.MONTH,2);

        Calendar calAgo5day = Calendar.getInstance();
        calAgo5day.add(Calendar.DATE,-5);

        System.out.println("current full time: " + calNow.getTime());
        System.out.println("current month and day: " + calNow.get(Calendar.MONTH) + " " +
                calNow.get(Calendar.DATE));
        System.out.println("------month from 0, day from 1");

        System.out.println("5 days ago full time: " + calAgo5day.getTime());
        System.out.println("5 days ago month: " + calAgo5day.get(Calendar.MONTH));
        System.out.println("------");

        System.out.println("3 days later full time: " + calIn3day.getTime());
        System.out.println("3 days later date: " + calIn3day.get(Calendar.DATE));
        System.out.println("------");

        System.out.println("2 months later full time: " + calIn2month.getTime());
        System.out.println("2 months later month: " + calIn2month.get(Calendar.MONTH));
        System.out.println("------");

        int gap_now_in3 = calNow.compareTo(calIn3day);
        System.out.println("now_in3 gap is: " + gap_now_in3);

        int gap_now_now = calNow.compareTo(calNow);
        System.out.println("now_now gap is: " + gap_now_now);

        int gap_in3_now = calIn3day.compareTo(calNow);
        System.out.println("in3_now gap is: " + gap_in3_now);
        System.out.println("------");
        System.out.println("front late is 1, equal 0, early -1");


        System.out.println("testModel done");
    }

    public static void main(String[] args) {

        launch(args);
        testModel();
    }
}
