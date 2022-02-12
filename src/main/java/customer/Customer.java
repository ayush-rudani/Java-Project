package customer;

import java.io.Serializable;
import java.util.ArrayList;
import order.*;

public class Customer {
	private int id;
	private String name, phone_no, DOB, email;
	private Address address;
	ArrayList<Order> orders;
	// private Address shipping;

	Customer(int id, String name, String phone, String DOB, String email, Address address) {
		this.id = id;
		this.name = name;
		this.phone_no = phone;
		this.DOB = DOB;
		this.email = email;
		this.address = address;
		this.orders = null;
	}

	void setOrders(ArrayList<Order> orders) {
		this.orders = orders;
	}
}
