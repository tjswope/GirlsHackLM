// Class: Cat
// Written by: Mr. Swope
// Date: 1/27/2020
// Description: This class implements a Cat. 
import java.awt.Rectangle;


public class Cat extends Sprite{
	
	// method: Default constructor - see packed constructors comments for a description of parameters.
	public Cat(){
		this(200, 300);
	}

	// method: Cat's packed constructor
	// description: Initialize a new AdventureBoy object.
	// parameters: imageChoice - used to determine which image to load when a Cat is instantiated.  
	//			   x_coordinate - the initial x-coordinate for Character.
	//			   y_coordinate - the initial y-coordinate for Character.
	public Cat(int x_coordinate, int y_coordinate){

		super(x_coordinate, y_coordinate);

		imageResource = new ImageResource("images/cat/", 8, 100);
		jumpCounter = -1;
	}

	public Rectangle getBounds(){
		return new Rectangle(x_coordinate, y_coordinate, imageResource.getImage().getIconWidth(), 
				imageResource.getImage().getIconWidth());
	}


}
