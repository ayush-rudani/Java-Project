package customer;

import java.io.Serializable;
import java.util.ArrayList;

import order.*;

public class Customer {
    //    private int id;
    private String name, phone_no, DOB, email;
    private Address address;
//	ArrayList<Order> orders;
    // private Address shipping;

    Customer(String name, String phone, String DOB, String email, Address address) {
//        this.id = id;
        this.name = name;
        this.phone_no = phone;
        this.DOB = DOB;
        this.email = email;
        this.address = address;
//		this.orders = null;
    }

    public String getName() {
        return name;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public String getDOB() {
        return DOB;
    }

    public String getEmail() {
        return email;
    }

    public Address getAddress() {
        return address;
    }

    //    void setOrders(ArrayList<Order> orders) {
//        this.orders = orders;
//    }
}
