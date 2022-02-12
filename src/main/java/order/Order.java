package order;

import java.io.Serializable;


public class Order implements Serializable {
    public String order_id, date, time, product_name;
    public int customer_id;

    public Order(String order_id, String date, String time, String product_name, int product_id, int customer_id) {
        this.order_id = order_id;
        this.date = date;
        this.time = time;
//        this.product_name = product_name;
//        this.product_id = product_id;
        this.customer_id = customer_id;
    }
}