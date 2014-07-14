import java.awt.Frame;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.BorderLayout;

public class Launch {

    public static void main(String[] args) {
		Frame f = new Frame("My AWT Frame"); //set title
		CheckboxGroup cbg = new CheckboxGroup(); 
        Checkbox c = new Checkbox("Male", cbg, true);//<-- selected
		f.add(c, BorderLayout.WEST); //add to frame
		c = new Checkbox("Female", cbg, false);
		f.add(c, BorderLayout.EAST);
		f.pack();
		f.setLocationRelativeTo(null); //put in center of screen
		f.setVisible(true); //show to the user
    }
}
