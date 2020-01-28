// Class: Dinosaur
// Written by: Mr. Swope
// Date: 1/27/2020
// Description: This class implements an Dinosaur. 
import java.awt.Rectangle;


public class Dinosaur extends Sprite{
	
	// method: Default constructor - see packed constructors comments for a description of parameters.
	public Dinosaur(){
		this(200, 300);
	}

	// method: Dinosaur's packed constructor
	// description: Initialize a new Dinosaur object.
	// parameters: imageChoice - used to determine which image to load when a Dinosaur is instantiated.  
	//			   x_coordinate - the initial x-coordinate for Character.
	//			   y_coordinate - the initial y-coordinate for Character.
	public Dinosaur(int x_coordinate, int y_coordinate){

		super(x_coordinate, y_coordinate);

		imageResource = new ImageResource("images/dinosaur/", 8, 80);
		jumpCounter = -1;
	}

	public Rectangle getBounds(){
		return new Rectangle(x_coordinate, y_coordinate, imageResource.getImage().getIconWidth(), 
				imageResource.getImage().getIconWidth());
	}


}
