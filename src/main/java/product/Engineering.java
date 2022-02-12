package product;

class Engineering extends Software {
	String version;
//	String Features;

	public Engineering() {
	}

	public Engineering(int id, String name, String description, double price, String type, String validity,
			String creator, String version) {
		super(id, name, description, price, type, validity, creator);
		this.version = version;
	}

	// Override the toString() method
	@Override
	public String toString() {
		return ("\n" + super.toString() + "\n" + "Version: " + version);
	}
}