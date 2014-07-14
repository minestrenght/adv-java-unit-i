import java.awt.Frame;
import java.awt.Label;

public class Launch {

    public static void main(String[] args) {
		Frame f = new Frame("My AWT Frame"); //set title
		f.setSize(300, 200); //width, height
		f.setLocationRelativeTo(null); //put in center of screen
		Label l = new Label("Press ctrl + c on terminal to exit"); //new label
		f.add(l); //add label to frame
		f.setVisible(true); //show to the user
    }
}
