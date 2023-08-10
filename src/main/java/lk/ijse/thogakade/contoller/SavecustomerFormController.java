package lk.ijse.thogakade.contoller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;

public class SavecustomerFormController {
    public JFXTextField idtxt;
    public JFXTextField nametxt;
    public JFXTextField addresstxt;
    public JFXTextField salarytxt;
    public Button savebtn;

    SavecustomerFormController(){
        FirstpageController.Hcode = "#v";
    }

    public void savebtnonaction(ActionEvent actionEvent) {

    }
}
