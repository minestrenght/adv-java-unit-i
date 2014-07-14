import java.awt.Frame;
import java.awt.Checkbox;
import java.awt.BorderLayout;

import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class Launch {

    public static void main(String[] args) {
		ItemListener il = new ItemListener() {
			public void itemStateChanged(ItemEvent ie) {
				Checkbox cb = (Checkbox)ie.getSource();//<-- get checkbox
				String state = cb.getState() ? "marked" : "un-marked";
				System.out.printf("%s was %s\n", cb.getLabel(), state);
			}
		};
		Frame f = new Frame("My AWT Frame"); //set title
        Checkbox c = new Checkbox("Veg");
		f.add(c, BorderLayout.WEST); //add to frame
		c.addItemListener(il);//<-- attach item listener
		c = new Checkbox("Non-Veg", true);//<-- selected
		f.add(c, BorderLayout.EAST);
		c.addItemListener(il);
		f.pack();
		f.setLocationRelativeTo(null); //put in center of screen
		f.setVisible(true); //show to the user
    }
}
