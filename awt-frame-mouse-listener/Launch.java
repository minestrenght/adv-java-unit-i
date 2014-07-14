import java.awt.Frame;

import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class Launch {

    public static void main(String[] args) {
		System.out.println("Press ctrl + c to exit");
		Frame f = new Frame("My AWT Frame"); //set title
		MouseListener ml = new MouseListener() {
			public void mouseEntered(MouseEvent me) {
				System.out.println("mouse entered on frame");
			}
			public void mouseExited(MouseEvent me) {
				System.out.println("mouse exited frame");
			}
			public void mousePressed(MouseEvent me) {
				System.out.println("mouse was pressed on frame");
			}
			public void mouseReleased(MouseEvent me) {
				System.out.println("mouse was released on frame");
			}
			public void mouseClicked(MouseEvent me) {
				System.out.println("mouse was clicked on frame");
			}
		};
		f.addMouseListener(ml);
		f.setSize(300, 200); //width, height
		f.setLocationRelativeTo(null); //put in center of screen
		f.setVisible(true); //show to the user
    }
}
