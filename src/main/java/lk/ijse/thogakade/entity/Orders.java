package lk.ijse.thogakade.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "orders")
public class Orders {

    @Id
    @Column(name = "id",length = 7)
    private String id;
    @Column(name = "date")
    private LocalDate date;
    @ManyToOne
    @JoinColumn(name = "customerId")
    private Customer customer;


    public Orders() {
    }

    public Orders(String id, LocalDate date, Customer customer) {
        this.id = id;
        this.date = date;
        this.customer = customer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id='" + id + '\'' +
                ", date=" + date +
                ", customer=" + customer +
                '}';
    }
}
