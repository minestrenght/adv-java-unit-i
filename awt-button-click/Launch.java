import java.awt.Frame;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Launch {

    public static void main(String[] args) {
		Frame f = new Frame("My AWT Frame"); //set title
		Button b = new Button("Press ctrl + c on terminal to exit"); //new label
		f.add(b); //add label to frame
		f.pack(); //set auto width & height
		f.setLocationRelativeTo(null); //put in center of screen
		f.setVisible(true); //show to the user
		ActionListener al = new ActionListener() {//<-- annonymous class
			public void actionPerformed(ActionEvent ae) {
				System.out.println("Button was pressed !");
			}
		};//<-- mind it
		b.addActionListener(al);//<-- attach listener to button
    }
}
