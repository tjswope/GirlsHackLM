// Class: Dog
// Written by: Mr. Swope
// Date: 1/27/2020
// Description: This class implements an Dog. 
import java.awt.Rectangle;


public class Dog extends Sprite{
	
	// method: Default constructor - see packed constructors comments for a description of parameters.
	public Dog(){
		this(200, 300);
	}

	// method: Dog's packed constructor
	// description: Initialize a new Dog object.
	// parameters: imageChoice - used to determine which image to load when a Dog is instantiated.  
	//			   x_coordinate - the initial x-coordinate for Character.
	//			   y_coordinate - the initial y-coordinate for Character.
	public Dog(int x_coordinate, int y_coordinate){

		super(x_coordinate, y_coordinate);

		imageResource = new ImageResource("images/dog/", 8, 100);
		jumpCounter = -1;
	}

}
