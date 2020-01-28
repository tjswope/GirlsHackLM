// Class: Boy
// Written by: Mr. Swope
// Date: 1/27/2020
// Description: This class implements a Boy. 
import java.awt.Rectangle;

public class Boy extends Sprite{

	// method: Default constructor - see packed constructors comments for a description of parameters.
	public Boy(){
		this(200, 300);
	}

	// method: Boy's packed constructor
	// description: Initialize a new Boy object.
	// parameters: imageChoice - used to determine which image to load when a Boy is instantiated.  
	//			   x_coordinate - the initial x-coordinate for Character.
	//			   y_coordinate - the initial y-coordinate for Character.
	public Boy(int x_coordinate, int y_coordinate){

		super(x_coordinate, y_coordinate);

		imageResource = new ImageResource("images/boy/", 15, 80);
		jumpCounter = -1;
	}

	public Rectangle getBounds(){
		return new Rectangle(x_coordinate, y_coordinate, imageResource.getImage().getIconWidth(), 
				imageResource.getImage().getIconWidth());
	}


}
