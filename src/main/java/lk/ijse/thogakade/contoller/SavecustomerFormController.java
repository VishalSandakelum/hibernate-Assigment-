package lk.ijse.thogakade.contoller;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import lk.ijse.thogakade.entity.Customer;
import lk.ijse.thogakade.repository.CustomerRepository;

import java.net.URL;
import java.util.ResourceBundle;

public class SavecustomerFormController implements Initializable {
    public TextField idtxt;
    public TextField nametxt;
    public TextField addresstxt;
    public TextField salarytxt;
    public Button savebtn;


    public void savebtnonaction(ActionEvent actionEvent)throws Exception {
        if(checkNull()==true){

            Customer customer = new Customer();
            customer.setId(idtxt.getText());
            customer.setName(nametxt.getText());
            customer.setAddress(addresstxt.getText());
            customer.setSalary(Double.parseDouble(salarytxt.getText()));

            CustomerRepository cusRepository = new CustomerRepository();
            boolean savedCusId = cusRepository.saveCustomer(customer);
            System.out.println("Saved Cus Id: " + savedCusId);

            clear();
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            FirstpageController.Hcode = "#v";
        }catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    private boolean checkNull(){
        if(idtxt.getText()!=null&nametxt.getText()!=null&addresstxt.getText()!=null&salarytxt.getText()!=null){
            return true;
        }else{
            return false;
        }
    }

    private void clear(){
        idtxt.clear();
        nametxt.clear();
        addresstxt.clear();
        salarytxt.clear();
    }
}
