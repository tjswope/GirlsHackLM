// Class: ZombieBoy
// Written by: Mr. Swope
// Date: 1/27/2020
// Description: This class implements an ZombieBoy. 
import java.awt.Rectangle;


public class ZombieBoy extends Sprite{
	
	// method: Default constructor - see packed constructors comments for a description of parameters.
	public ZombieBoy(){
		this(200, 300);
	}

	// method: ZombieBoy's packed constructor
	// description: Initialize a new AdventureBoy object.
	// parameters: imageChoice - used to determine which image to load when a ZombieBoy is instantiated.  
	//			   x_coordinate - the initial x-coordinate for Character.
	//			   y_coordinate - the initial y-coordinate for Character.
	public ZombieBoy(int x_coordinate, int y_coordinate){

		super(x_coordinate, y_coordinate);

		imageResource = new ImageResource("images/zombieBoy/", 9, 80);
		jumpCounter = -1;
	}

	public Rectangle getBounds(){
		return new Rectangle(x_coordinate, y_coordinate, imageResource.getImage().getIconWidth(), 
				imageResource.getImage().getIconWidth());
	}


}
