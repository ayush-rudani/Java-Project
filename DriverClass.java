//---------- Ayush Rudani ----------//

import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.io.*;
import javax.swing.SortOrder;
import java.time.LocalDateTime;
import java.lang.Math;

import customer.*;
import product.*;

public class DriverClass {

    // ********** Get all details of Customer **********

    Customer getAlldetailsOfCustomer() {
        Scanner sc = new Scanner(System.in);

        Customer c = null;

        int id;
        String name, phone_no, dob, email;
        String street, city, state;
        int pincode;

        System.out.print("\nEnter Your ID: ");
        id = sc.nextInt();
        sc.nextLine();

        System.out.print("\nEnter Your Name: ");
        name = sc.nextLine();

        System.out.print("\nEnter Email: ");
        email = sc.nextLine();

        System.out.print("\nEnter Date of Birth: ");
        dob = sc.nextLine();

        System.out.print("\nEnter Mobile Number: ");
        phone_no = sc.nextLine();

        System.out.print("\nEnter Street: ");
        street = sc.nextLine();

        System.out.print("\nEnter City: ");
        city = sc.nextLine();

        System.out.print("\nEnter State: ");
        state = sc.nextLine();

        System.out.print("\nEnter Pincode: ");
        pincode = sc.nextInt();

        Address cus_address = new Address(street, city, state, pincode);
        c = new Customer(id, name, phone_no, dob, email, cus_address);

        return c;
    }

    public static void BuyProduct(int customer_id, ArrayList<Product> product_list)
            throws IOException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Available Products: ");
        System.out.println(product_list);

        System.out.print("Enter the product ID for the item you want to purchase: ");
        int prod_id = sc.nextInt();
        while (prod_id < 1 || prod_id > 5) {
            System.out.println("Please Enter valid product id: ");
            prod_id = sc.nextInt();
        }

        String OrderId = "O";
        OrderId = OrderId.concat(Integer.toString((int) (Math.random() * (200 - 0 + 1) + 0)));

        DateTimeFormatter dt_format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter time_format = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDateTime dt = LocalDateTime.now();
        LocalDateTime tm = LocalDateTime.now();
        String prod_name = "";
        for (int i = 0; i < product_list.size(); i++) {
            if (product_list.get(i).getId() == prod_id) {
                prod_name = product_list.get(i).getName();
            }
        }

        Order o1 = new Order(OrderId, dt_format.format(dt), time_format.format(tm), prod_name, prod_id, customer_id);

    }

    // ******************** Main ********************

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<Product> productList = new ArrayList<Product>();
        productList
                .add(new Software(1, "Visual Studio Code", "Programming language editor, debugger, compiler and IDE.",
                        500, "Programming", "Lifetime", "Microsoft"));
        productList.add(new Software(2, "MS Office", "MS Word, Excel, PowePoint, OneNote and Other MS services", 8000,
                "Application", "Lifetime", "Microsoft"));
        productList.add(new Software(3, "AutoCad",
                "2D and 3D drafting, design, and modeling with solids, surfaces, mesh objects, etc.", 500000,
                "Engineering", "2-Years", "Autodesk"));
        productList.add(new Software(4, "Emerge", "Busiess Inventory for all type of business", 55000, "Accounting",
                "1-Year", "Emerage Pvt. Ltd."));

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome!!");
        System.out.println("Are you new Customer(Y/N): ");
        String ckh = sc.nextLine();

        if (ckh.equals("Y")) {

        }

    }
}
