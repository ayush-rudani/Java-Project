package order;

import java.io.Serializable;

public class Address implements Serializable {
    private String home_no;
    private String street_name, city, state;
    private String pincode;

    public Address(String home_no, String street_name, String city, String state, String pincode) {
        this.home_no = home_no;
        this.street_name = street_name;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }

    public String getHome_no() {
        return home_no;
    }

    public String getStreet_name() {
        return street_name;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getPincode() {
        return pincode;
    }
    //	public Address(String street_name, String city, String state, int pincode) {
//		this.street_name = street_name;
//		this.city = city;
//		this.state = state;
//		this.pincode = pincode;
//	}
}
