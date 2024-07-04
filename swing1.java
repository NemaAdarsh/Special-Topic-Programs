import javax.swing.*;
public class swing1
{
    JFrame frame;
 
    swing1()
    {
        // creating instance of JFrame with name "First Way"
        frame=new JFrame("First Way");
         
        // creates instance of JButton
        JButton button = new JButton("Let's See");
 
        button.setBounds(200, 150, 90, 50);
         
        // setting close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        // adds button in JFrame
        frame.add(button);
 
        // sets 500 width and 600 height
        frame.setSize(500, 600);
         
        // uses no layout managers
        frame.setLayout(null);
         
        // makes the frame visible
        frame.setVisible(true);
    }
     
    public static void main(String[] args)
    {
        new swing1();
    }
}