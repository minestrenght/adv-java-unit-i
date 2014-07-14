import java.awt.Frame;
import java.awt.Checkbox;
import java.awt.BorderLayout;

public class Launch {

    public static void main(String[] args) {
		Frame f = new Frame("My AWT Frame"); //set title
        Checkbox c = new Checkbox("Veg");
		f.add(c, BorderLayout.WEST); //add to frame
		c = new Checkbox("Non-Veg", true);//<-- selected
		f.add(c, BorderLayout.EAST);
		f.pack();
		f.setLocationRelativeTo(null); //put in center of screen
		f.setVisible(true); //show to the user
    }
}
