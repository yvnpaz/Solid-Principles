package entities;

public class Apple {

	private String name;
	private int quantity;
	
	public Apple() {
		this.name = "Apple";
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
		return "Apple [name=" + name + ", quantity=" + quantity + "]";
	}
	
}
