package lk.ijse.thogakade.contoller;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import lk.ijse.thogakade.entity.Customer;
import lk.ijse.thogakade.entity.Item;
import lk.ijse.thogakade.entity.Orders;
import lk.ijse.thogakade.repository.ItemRepository;
import lk.ijse.thogakade.repository.OrderRepository;

public class ManageorderController {
    public Button savebtn;
    public TextField idtxt;
    public TextField customeridtxt;
    public Button updatebtn;
    public Button deletebtn;
    public Button searchbtn;
    public DatePicker datetxt;

    public void savebtnonaction(ActionEvent actionEvent) {
        if(checkNull()==true){

            System.out.println(datetxt.getValue());
            Orders orders = new Orders();
            Customer customer = new Customer();
            orders.setId(idtxt.getText());
            customer.setId(customeridtxt.getText());
            orders.setCustomer(customer);

            OrderRepository orderRepository = new OrderRepository();
            boolean saved = orderRepository.saveOrders(orders);
            System.out.println("orders: " + saved);

            clear();
        }
    }

    public void updatebtnonaction(ActionEvent actionEvent) {

    }

    public void deletebtnonaction(ActionEvent actionEvent) {

    }

    public void searchbtnonaction(ActionEvent actionEvent) {

    }

    private boolean checkNull(){
        if(idtxt.getText()!=null&customeridtxt.getText()!=null){
            return true;
        }else{
            return false;
        }
    }

    private void clear(){
        idtxt.clear();
        customeridtxt.clear();
    }
}
