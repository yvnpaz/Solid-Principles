package bien.solucion1;

public class Rectangle implements IRectangle {

	private int height;
	private int width;
	
	public Rectangle(int height, int width) {
		this.height = height;
		this.width = width;
	}
	
	@Override
	public int getWidth() {
		return width;
	}

	@Override
	public int getHeight() {
		return height;
	}

	@Override
	public int calculateArea() {
		return getHeight() * getWidth();
	}

}
