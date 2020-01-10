import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

import javax.swing.ImageIcon;

public class BackGround {

	private ClassLoader cldr;
	private String imagePath;
	private URL imageURL;
	private ImageIcon background1Image;
	private ImageIcon background2Image;
	private int x_coordinate;

	public BackGround() {

		cldr = this.getClass().getClassLoader();	// These five lines of code load the background picture.
		imagePath = "images/background.png";				// Change this line if you want to use a different 
		imageURL = cldr.getResource(imagePath);				// background image.  The image should be saved in the
		background1Image = new ImageIcon(imageURL);
		background2Image = new ImageIcon(imageURL);
	}

	public void draw(Component c, Graphics g) {
		background1Image.paintIcon(c, g, x_coordinate, 0);
		background2Image.paintIcon(c, g, x_coordinate + (background1Image.getIconWidth() - 2), 0);
	}
	
	public void move() {
		if(x_coordinate > - background1Image.getIconWidth())
			x_coordinate--;
		else
			x_coordinate = 0;
	}
}
