import java.awt.Frame;
import java.awt.Button;
import java.awt.FlowLayout;

public class Launch {

    public static void main(String[] args) {
		Frame f = new Frame("My AWT Frame"); //set title
		f.setSize(300, 200); //width, height
		f.setLocationRelativeTo(null); //put in center of screen
		f.setLayout(new FlowLayout()); //set the layout manager for the frame
		f.add(new Button("one")); // directly button added
		f.add(new Button("two"));
		f.setVisible(true); //show to the user
    }
}
