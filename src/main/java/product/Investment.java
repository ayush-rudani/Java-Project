package product;

class Investment extends Software {
	private double updationCharges;
//	private String Features;

	public Investment() {
	}

	public Investment(int id, String name, String description, double price, String type, String validity,
			String creator, double updationCharges) {
		super(id, name, description, price, type, validity, creator);
		this.updationCharges = updationCharges;
	}

	// Override the toString() method
	@Override
	public String toString() {
		return ("\n" + super.toString() + "\n" + "Updation Charges: " + updationCharges);
	}
}
