// Class: ZombieGirl
// Written by: Mr. Swope
// Date: 1/27/2020
// Description: This class implements an Boy. 
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.net.URL;
import javax.swing.ImageIcon;

public class ZombieGirl extends Sprite{
	
	
	// method: Default constructor - see packed constructors comments for a description of parameters.
	public ZombieGirl(){
		this(200, 300);
	}
	// method: ZombieGirl's packed constructor
	// description: Initialize a new ZombieGirl object.
	// parameters: imageChoice - used to determine which image to load when a ZombieGirl is instantiated.  
	//			   x_coordinate - the initial x-coordinate for Character.
	//			   y_coordinate - the initial y-coordinate for Character.
	public ZombieGirl(int x_coordinate, int y_coordinate){

		super(x_coordinate, y_coordinate);

		imageResource = new ImageResource("images/zombieGirl/", 9, 80);
		jumpCounter = -1;
	}


}
