package UI.manager;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class ManageFrameController implements Initializable {
    //top:menu
    @FXML
    private MenuItem checkAllMenu;

    //left:user option radio
    @FXML
    private RadioButton radioAll;
    @FXML
    private RadioButton radioKen;
    @FXML
    private RadioButton radioZhao;
    @FXML
    private RadioButton radioJiahua;




    //middle:table
    @FXML
    private TextField nameInput;
    @FXML
    private TextField quantityInput;
    @FXML
    private TextField dayInput;
    @FXML
    private Button addButton;


    //right:report area

    //footer:record


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("manage frame initialized");
        //top:menu
        checkAllMenu.setOnAction(e->System.out.println("fire check all"));

        //left:user option radio

        radioAll.setOnAction(e->System.out.println("show all items"));
        radioAll.setSelected(true);
        radioKen.setOnAction(e->System.out.println("show Ken's"));
        radioZhao.setOnAction(e->System.out.println("show Zhao's"));
        radioJiahua.setOnAction(e->System.out.println("show Jiahua's"));

        ToggleGroup userToggle = new ToggleGroup();
        userToggle.getToggles().addAll(radioAll,radioKen,radioZhao,radioJiahua);




        //middle:table

        //right:report area

        //footer:record
    }

    public void addButtonClicked(){
        System.out.println("name: "+nameInput.getText()+", qty: "+quantityInput.getText()+", goodFor: "+dayInput.getText());
    }
}
