// Class: Character
// Written by: Mr. Swope
// Date: 10/28/15
// Description: This class implements a Character.  This Character will be drawn onto a graphics panel. 
// 
// If you modify this class you should add comments that describe when and how you modified the class.  

import java.awt.Rectangle;


public class Dog extends Sprite{
	
	// method: Default constructor - see packed constructors comments for a description of parameters.
	public Dog(){
		this(200, 300);
	}

	// method: Character's packed constructor
	// description: Initialize a new Character object.
	// parameters: imageChoice - used to determine which image to load when a Character is instantiated.  You can change
	//			   existing options or add other options. 0 - pirate, 1 - parrot.
	//			   x_coordinate - the initial x-coordinate for Character.
	//			   y_coordinate - the initial y-coordinate for Character.
	public Dog(int x_coordinate, int y_coordinate){

		super(x_coordinate, y_coordinate);

		imageResource = new ImageResource("images/dog/", 8, 100);
		jumpCounter = -1;
	}

	public Rectangle getBounds(){
		return new Rectangle(x_coordinate, y_coordinate, imageResource.getImage().getIconWidth(), 
				imageResource.getImage().getIconWidth());
	}


}
