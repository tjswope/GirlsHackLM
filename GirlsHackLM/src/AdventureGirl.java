// Class: AdventureGirl
// Written by: Mr. Swope
// Date: 1/27/2020
// Description: This class implements an AdventureGirl.
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.net.URL;
import javax.swing.ImageIcon;

public class AdventureGirl extends Sprite{

	// method: Default constructor - see packed constructors comments for a description of parameters.
	public AdventureGirl(){
		this(200, 300);
	}

	// method: AdventureGirl's packed constructor
	// description: Initialize a new AdventureBoy object.
	// parameters: imageChoice - used to determine which image to load when an AdventureBoy is instantiated.  You can change
	//			   existing options or add other options. 0 - pirate, 1 - parrot.
	//			   x_coordinate - the initial x-coordinate for Character.
	//			   y_coordinate - the initial y-coordinate for Character.
	public AdventureGirl(int x_coordinate, int y_coordinate){

		super(x_coordinate, y_coordinate);

		imageResource = new ImageResource("images/adventureGirl/", 8, 80);
		jumpCounter = -1;
	}
}
