package UI.loginPop;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginFrameController implements Initializable {

    public ComboBox<String> login_selectUser_combo;
    public static TextField login_useraccess_input;
    public static Button login_login_button;



    public void loginButtonClicked(){

        String userName = login_selectUser_combo.getValue();
        String userCode = login_useraccess_input.getText();
        System.out.println("login button clicked");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        login_selectUser_combo = new ComboBox<String>();
        login_selectUser_combo.getItems().addAll("user1","user2","user3");
    }
}
