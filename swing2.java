// Java Program to create a label 
// and add an image to it.
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

class swing2 extends JFrame
{
	// frame
    static JFrame f;
 
    // label to display text
    static JLabel l;
 
    // default constructor
    swing2()
    {
    }
 
    // main class
    public static void main(String[] args)
    {
        // create a new frame to store text field and button
        f = new JFrame("Label");
 
        // create a new image icon
        ImageIcon i = new ImageIcon("floral.jpg");
 
        // create a label to display image
        l = new JLabel(i);
 
        // create a panel
        JPanel p = new JPanel();
 
        // add label to panel
        p.add(l);
 
        // add panel to frame
        f.add(p);
 
        // set the size of frame
        f.setSize(500, 500);
 
        f.show();
    }
}