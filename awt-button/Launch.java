import java.awt.Frame;
import java.awt.Button;

public class Launch {

    public static void main(String[] args) {
		Frame f = new Frame("My AWT Frame"); //set title
		f.setSize(300, 200); //width, height
		f.setLocationRelativeTo(null); //put in center of screen
		Button b = new Button("Press ctrl + c on terminal to exit"); //new label
		f.add(b); //add label to frame
		f.setVisible(true); //show to the user
    }
}
