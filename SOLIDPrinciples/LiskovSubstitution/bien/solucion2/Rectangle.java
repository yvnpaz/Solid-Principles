package bien.solucion2;

public class Rectangle {

	public final int width;
	public final int height;

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
	
	public int calculateArea() {
		return getHeight() * getWidth();
	}
}
