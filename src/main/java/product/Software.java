package product;

public class Software extends Product {
	private String type;
	private String validity;
	private String creator;

	public Software() {
	}

	public Software(int id, String name, String description, double price, String type, String validity,
			String creator) {
		super(id, name, description, price);
		this.type = type;
		this.validity = validity;
		this.creator = creator;
	}

	// ********** Setter methods **********

	public void setValidity(String validity) {
		this.validity = validity;
	}

	public void setCreator(String ct) {
		this.creator = ct;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String setCreator() {
		return creator;
	}

	// ********** Getter methods **********

	public String getValidity() {
		return validity;
	}

	public String getType() {
		return type;
	}

	public String getCreator() {
		return creator;
	}

	// Overriding the default toString()
	public String toString() {
		return (super.toString() + "\nType Of Product: " + this.type + "\nProduct Lincense Value: " + this.validity
				+ "\nProduct Created By: " + creator + "\n-------------------------");
	}
}
