// Class: Background
// Written by: Mr. Swope
// Date: 1/27/2020
// Description: This is an abstract class that provides partial implementation for a Background. You can't
// 				create an instance of this class.
import java.awt.Component;
import java.awt.Graphics;
import javax.swing.ImageIcon;

public abstract class Background {

	protected ImageIcon image;
	protected int scale;
	
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
