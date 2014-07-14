import java.awt.Frame;
import java.awt.Button;
import java.awt.BorderLayout;

public class Launch {

    public static void main(String[] args) {
		Frame f = new Frame("My AWT Frame"); //set title
		f.setSize(300, 200); //width, height
		f.setLocationRelativeTo(null); //put in center of screen
		//by default layout manager for the frame is BorderLayout, no need to set
		// it has only five regions only, if more added it over laps
		f.add(new Button("center")); // directly button added to the center
		f.add(new Button("north"), BorderLayout.NORTH);
		f.add(new Button("south"), BorderLayout.SOUTH);
		f.add(new Button("east"), BorderLayout.EAST);
		f.add(new Button("west"), BorderLayout.WEST);
		f.setVisible(true); //show to the user
    }
}
