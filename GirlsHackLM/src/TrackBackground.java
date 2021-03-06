// Class: Background
// Written by: Mr. Swope
// Date: 1/27/2020
// Description: This class provides the implementation for a TrackBackground. You probably won't want to modify this
//              class.
import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;

public class TrackBackground extends Background {
	
	public TrackBackground() {
		ClassLoader cldr = this.getClass().getClassLoader();	// These five lines of code load the background picture.
		String imagePath = "images/background/raceTrack.png";	// Change this line if you want to use a different 
		URL imageURL = cldr.getResource(imagePath);				// background image.  The image should be saved in the
		scale = 1;
		
		image = new ImageIcon(imageURL);
		
		Image scaled = image.getImage().getScaledInstance(image.getIconWidth() / scale, 
				image.getIconHeight() / scale, Image.SCALE_SMOOTH);
		
		image = new ImageIcon(scaled);
	}
}
