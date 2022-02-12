package order;

public class Orders {
    public int id, user_id;
    public String date, time;

    public Orders(int id, int user_id, String date, String time) {
        this.id = id;
        this.user_id = user_id;
        this.date = date;
        this.time = time;
    }
}
