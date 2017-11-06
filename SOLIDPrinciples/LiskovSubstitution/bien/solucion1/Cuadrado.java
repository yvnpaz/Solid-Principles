package bien.solucion1;

public class Cuadrado implements IRectangle {

	private int height;
	private int width;
	
	public Cuadrado(int height) {
		this.height = height;
		this.width = height;
	}
	
	@Override
	public int getWidth() {
		return this.width;
	}

	@Override
	public int getHeight() {
		return this.height;
	}

	@Override
	public int calculateArea() {
		return getHeight() * getWidth();
	}

}
