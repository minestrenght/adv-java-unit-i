import java.awt.Frame;
import java.awt.Button;
import java.awt.GridLayout;

public class Launch {

    public static void main(String[] args) {
		Frame f = new Frame("My AWT Frame"); //set title
		f.setLayout(new GridLayout(2, 3)); //set the layout manager rows=2, cols=3
		f.add(new Button("one")); // directly button added
		f.add(new Button("two"));
		f.add(new Button("three"));
		f.add(new Button("four"));
		f.add(new Button("five"));
		f.pack();//<-- set auto width, height
		f.setLocationRelativeTo(null); //put in center of screen
		f.setVisible(true); //show to the user
    }
}
