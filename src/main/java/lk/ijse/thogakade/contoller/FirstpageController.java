package lk.ijse.thogakade.contoller;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.ZoomEvent;
import javafx.scene.text.Text;

public class FirstpageController {
    public Button savebtn;
    public TextField txtfield;
    public Text code;
    public static String Hcode;
    public static int count;

    public void savebtnonAction(ActionEvent actionEvent) {
        count+=1;
        if(count==10){
            code.setVisible(true);
        }
    }

    public void txtfieldonaction(ActionEvent actionEvent) {
        if(txtfield.getText().equals(Hcode)){
            code.setVisible(true);
        }else if(txtfield.getText().equals("#o")){
            code.setVisible(false);
        }else{
            txtfield.clear();
            savebtn.requestFocus();
        }
    }
}
