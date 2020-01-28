// Class: AdventureBoy
// Written by: Mr. Swope
// Date: 1/27/2020
// Description: This class implements an AdventureBoy. 
import java.awt.Rectangle;

public class AdventureBoy extends Sprite{
	
	// method: AdventureBoy's packed constructor
	// description: Initialize a new AdventureBoy object.
	// parameters: imageChoice - used to determine which image to load when an AdventureBoy is instantiated.  
	//			   x_coordinate - the initial x-coordinate for Character.
	//			   y_coordinate - the initial y-coordinate for Character.
	public AdventureBoy(int x_coordinate, int y_coordinate){

		super(x_coordinate, y_coordinate);

		imageResource = new ImageResource("images/adventureBoy/", 10, 80);
		jumpCounter = -1;
	}

	public Rectangle getBounds(){
		return new Rectangle(x_coordinate, y_coordinate, imageResource.getImage().getIconWidth(), 
				imageResource.getImage().getIconWidth());
	}


}
