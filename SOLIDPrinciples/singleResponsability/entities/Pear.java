package entities;

public class Pear {
	private String name;
	private int quantity;
	
	public Pear() {	
		this.name = "Pear";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Pear [name=" + name + ", quantity=" + quantity + "]";
	}
	
}
