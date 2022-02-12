package product;

public class Product {
	private int id;
	private String name, description;
	private double price;
	private static int numberOfProducts;

	// Constructor
	public Product() {
	}

	public Product(int id, String name, String des, double price) {
		this.id = id;
		this.name = name;
		this.description = des;
		this.price = price;
	}

	static {
		numberOfProducts = 0;
	}

	{
		numberOfProducts++;
	}

	// ********** Getter methods **********

	int getId() {
		return id;
	}

	String getName() {
		return name;
	}

	double getPrice() {
		return price;
	}

	String getDesc() {
		return description;
	}

	static int getNumberOfProducts() {
		return numberOfProducts;
	}

	// ********** Setter methods **********

	public void setID(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDesc(String desc) {
		this.description = desc;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	// Overriding the default toString()
	@Override
	public String toString() {
		return "\nProduct Id: " + getId() + "\nProduct Name: " + getName() + "\nProduct Description: " + getDesc()
				+ "\nPrice: " + this.price;
	}
}
