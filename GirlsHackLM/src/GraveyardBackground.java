import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;

public class GraveyardBackground extends Background {
	
	public GraveyardBackground() {
		ClassLoader cldr = this.getClass().getClassLoader();	// These five lines of code load the background picture.
		String imagePath = "images/graveyard/BG.png";	// Change this line if you want to use a different 
		URL imageURL = cldr.getResource(imagePath);				// background image.  The image should be saved in the
		scale = 2;
		
		image = new ImageIcon(imageURL);
		
		Image scaled = image.getImage().getScaledInstance(image.getIconWidth() / scale, 
				image.getIconHeight() / scale, Image.SCALE_SMOOTH);
		
		image = new ImageIcon(scaled);
	}
}
