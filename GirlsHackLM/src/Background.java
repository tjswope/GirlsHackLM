import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;

public abstract class Background {

	protected ImageIcon image;
	protected int scale;
	
//	public Background() {
//
//		ClassLoader cldr = this.getClass().getClassLoader();	// These five lines of code load the background picture.
//		String imagePath = "images/background/raceTrack.png";	// Change this line if you want to use a different 
//		URL imageURL = cldr.getResource(imagePath);				// background image.  The image should be saved in the
//		scale = 1;
//		
//		image = new ImageIcon(imageURL);
//		
//		Image scaled = image.getImage().getScaledInstance(image.getIconWidth() / scale, 
//				image.getIconHeight() / scale, Image.SCALE_SMOOTH);
//		
//		image = new ImageIcon(scaled);
//	}

	public void draw(Component c, Graphics g) {
		image.paintIcon(c, g, 0, 0);
	}
	
	public int getHeight() {
		return image.getIconHeight();
	}
	
	public int getWidth() {
		return image.getIconWidth();
	}
	
}
