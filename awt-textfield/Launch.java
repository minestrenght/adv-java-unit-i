import java.awt.Frame;
import java.awt.TextField;

public class Launch {

    public static void main(String[] args) {
		Frame f = new Frame("My AWT Frame"); //set title
		f.setSize(300, 200); //width, height
		f.setLocationRelativeTo(null); //put in center of screen
		TextField tf = new TextField("Press ctrl + c on terminal to exit");
		f.add(tf); //add to frame
		f.setVisible(true); //show to the user
    }
}
