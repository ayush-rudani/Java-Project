package order;

public class OrderDetails {
    int id, order_id;
    public int product_id;
    double price;
    public String date, time;

    public OrderDetails(int id, int order_id, int product_id, double price, String date, String time) {
        this.id = id;
        this.order_id = order_id;
        this.product_id = product_id;
        this.date = date;
        this.time = time;
        this.price = price;
    }
}
