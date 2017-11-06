package entities;

public class Fruit {

	Apple apple;
	Pear pear;
	
	public Fruit() {}

	public Apple getApple() {
		return apple;
	}

	public void setApple(Apple apple) {
		this.apple = apple;
	}

	public Pear getPear() {
		return pear;
	}

	public void setPear(Pear pear) {
		this.pear = pear;
	}

	@Override
	public String toString() {
		return "Fruit [apple=" + apple + ", pear=" + pear + "]";
	}
	
}
