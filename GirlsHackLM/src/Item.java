// Class: Item
// Written by: Mr. Swope
// Date: 10/28/15
// Description: This class implements a Character.  This Character will be drawn onto a graphics panel. 
// 
// If you modify this class you should add comments that describe when and how you modified the class.  

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.net.URL;
import javax.swing.ImageIcon;

public class Item{
	
	// movement variables
	protected int x_coordinate;			// These ints will be used for the drawing the png on the graphics panel.
	protected int y_coordinate;			// When the Character's move method is called you should update one or both
	// of these instance variables.  (0,0) is the top left hand corner of the
	// panel.  x increases as you move to the right, y increases as you move down.

	protected int x_direction;			// -3 running left, -2 walking left, -1 idle facing left
	// 1 idle facing right, 2 walking right, 3 running right

	protected int y_direction;			// 0 : not moving
	// - 1 : up
	// 1 : down
	protected ImageIcon image;
	private int imageScale;

	// method: Default constructor - see packed constructors comments for a description of parameters.
	public Item(){
		this(200, 300, 2, "images/forest/Object/Tree_2.png");
	}

	public Item(int x_coordinate, int y_coordinate, String imageString){
		this(x_coordinate, y_coordinate, 2, imageString);
	}
	
	// method: Character's packed constructor
	// description: Initialize a new Character object.
	// parameters: imageChoice - used to determine which image to load when a Character is instantiated.  You can change
	//			   existing options or add other options. 0 - pirate, 1 - parrot.
	//			   x_coordinate - the initial x-coordinate for Character.
	//			   y_coordinate - the initial y-coordinate for Character.
	public Item(int x_coordinate, int y_coordinate, int imageScale, String imageString){

		this.x_coordinate = x_coordinate;						// Initial coordinates for the Character.
		this.y_coordinate = y_coordinate; 

		x_direction = 1;
		y_direction = 0;
		
		ClassLoader cldr = this.getClass().getClassLoader();	// These five lines of code load the background picture.
		String imagePath = "images/forest/objects/Tree_2.png";	// Change this line if you want to use a different 
		URL imageURL = cldr.getResource(imagePath);				// background image.  The image should be saved in the
		
		image = new ImageIcon(imageURL);
		
		Image scaled = image.getImage().getScaledInstance(image.getIconWidth() / imageScale, 
				image.getIconHeight() / imageScale, Image.SCALE_SMOOTH);
		
		image = new ImageIcon(scaled);
		
	}
	


	// method: getBounds
	// description: This method will return the coordinates of a rectangle that would be drawn around the 
	// 				Character's png.  This rectangle can be used to check to see if the Character bumps into 
	//				another character on your panel by calling the Rectangle's intersects method:
	//
	//							p.getBounds().intersects(c.getBounds());
	//
	//				in this example p is an instance of the Character class and c is an instance of another
	//				class that has a getBounds method that also returns a Rectangle, so p.getBounds and
	//				c.getBounds would both return or evaluate to Rectangle objects.  The intersects method
	//				return true if the two rectangles overlap, false if they do not.
	// return: A Rectangle - This rectangle would be like drawing a rectangle around the Character's image.
	public Rectangle getBounds(){
		return new Rectangle(x_coordinate, y_coordinate, image.getIconWidth(), 
				image.getIconWidth());
	}

	// method: getX
	// description:  This method will return the x-coordinate of the top left hand corner of the the image.
	// return: int - the x-coordinate of the top left hand corner of the the image.
	public int getX(){
		return x_coordinate;
	}

	// method: getY
	// description:  This method will return the y-coordinate of the top left hand corner of the the image.
	// return: int - the y-coordinate of the top left hand corner of the the image.
	public int getY(){
		return y_coordinate;
	}

	// method: move
	// description: This method should modify the Character's x or y (or perhaps both) coordinates.  When the 
	//				graphics panel is repainted the Character will then be drawn in it's new location.
	// parameters: int direction - This parameter should represent the direction that you want to move
	//			   the Character, so decide on a standard for what each integer value will stand for and then
	//			   add comments below that describe these integer values, for example...
	//			   1 - move Character to the right.

	public void move(){
		// move to the right or left - speed will be positive
		if (((x_coordinate > 0 && x_direction == -2) || (x_coordinate < 950 && x_direction == 2 )))
			x_coordinate += (x_direction);
		// jump
		else if ((y_coordinate > 0 && y_direction == -1) || (y_coordinate < 343 && y_direction == 1 ))
			y_coordinate += (y_direction);

	}


	// methods that deal with horizontal movement
	public void walkRight() {
		x_direction = 2;
	}
	public void walkLeft() {
		x_direction = -2;
	}
	public void run() {
		x_direction = (x_direction < 0) ? -5 : 5;
	}
	public void slowDown() {
		x_direction = (x_direction < 0) ? -2 : 2;
	}
	public void idle() {
		x_direction = (x_direction < 0) ? -1 : 1;
	}

	
	public void stop_Vertical() {
		y_direction = 0;
	}

	public void moveUp() {
		y_direction = -1;
	}
	
	public void moveDown() {
		y_direction = 1;
	}

	// method: draw
	// description: This method is used to draw the image onto the GraphicsPanel.  You shouldn't need to 
	//				modify this method.
	// parameters: Graphics g - this object draw's the image.
	//			   Component c - this is the component that the image will be drawn onto.
	public void draw(Graphics g, Component c) {
		image.paintIcon(c, g, x_coordinate, y_coordinate);

	}

}
