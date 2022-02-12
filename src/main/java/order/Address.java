package order;

import java.io.Serializable;

public class Address implements Serializable {
	private String home_no;
	private String street_name, city, state;
	private int pincode;

	public Address(String street_name, String city, String state, int pincode) {
		this.street_name = street_name;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}
}
