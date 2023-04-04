package to_dos.prototype;

//Create the Rectangle concrete class which extends the Shape abstract class
public class Rectangle extends Shape {

	// TO-DO: Declare the constructor
	public Rectangle() {
		super.setId("1");
		// Set type to be similar with class name
		super.type = "Rectangle";
	}

	// TO-DO: Declare the draw() method
	@Override
	public void draw() {
		/*
		 * Only print out the draw() method to test. No need to implement the real
		 * drawing
		 */
		System.out.println("Inside Rectangle::draw() method.");

	}
}