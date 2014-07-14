import java.awt.Frame;

public class Launch {

    public static void main(String[] args) {
		System.out.println("Press ctrl + c to exit");
		Frame f = new Frame("My AWT Frame"); //set title
		f.setSize(300, 200); //width, height
		f.setLocationRelativeTo(null); //put in center of screen
		f.setVisible(true); //show to the user
    }
}
