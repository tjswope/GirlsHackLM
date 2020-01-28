// Class: Girl
// Written by: Mr. Swope
// Date: 1/27/2020
// Description: This class implements an Girl. 
import java.awt.Rectangle;


public class Girl extends Sprite{
	
	// method: Default constructor - see packed constructors comments for a description of parameters.
	public Girl(){
		this(200, 300);
	}

	// method: Girl's packed constructor
	// description: Initialize a new Girl object.
	// parameters: imageChoice - used to determine which image to load when a Girl is instantiated.  
	//			   x_coordinate - the initial x-coordinate for Character.
	//			   y_coordinate - the initial y-coordinate for Character.
	public Girl(int x_coordinate, int y_coordinate){

		super(x_coordinate, y_coordinate);

		imageResource = new ImageResource("images/girl/", 16, 100);
		jumpCounter = -1;
	}

	public Rectangle getBounds(){
		return new Rectangle(x_coordinate, y_coordinate, imageResource.getImage().getIconWidth(), 
				imageResource.getImage().getIconWidth());
	}


}
