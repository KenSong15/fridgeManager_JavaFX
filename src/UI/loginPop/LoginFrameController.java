package UI.loginPop;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginFrameController implements Initializable {

    @FXML
    private ComboBox<String> combo;
    @FXML
    private TextField input;
    @FXML
    private Button button;


    public void loginButtonClicked(){
        String userName = combo.getValue();
        String userCode = input.getText();

        //todo: check if the user code valid
        System.out.println("clicked, user: " + userName + " code: "+ userCode);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("login frame initialized");

        //todo: add all the user name exist in database
        combo.getItems().addAll("Ken","Zhao","Jiahua");
    }
}
