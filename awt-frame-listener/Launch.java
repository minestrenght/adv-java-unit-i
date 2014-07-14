import java.awt.Frame;

import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;

public class Launch {

    public static void main(String[] args) {
		System.out.println("Press ctrl + c to exit");
		Frame f = new Frame("My AWT Frame"); //set title
		WindowListener wl = new WindowListener() {
			public void windowClosing(WindowEvent we) {
				System.out.println("window was closing");
				Frame w = (Frame)we.getWindow();
				w.setVisible(false);//<-- hide, it won't stop the app
				w.dispose();//<-- kill the frame instance/object
				//System.exit(0) //<-- use this command to kill app forcefully
			}
			public void windowClosed(WindowEvent we) {
				System.out.println("window was closed");
			}
			public void windowOpened(WindowEvent we) {
				System.out.println("window was opened");
			}
			public void windowIconified(WindowEvent we) {
				System.out.println("window was minimized");
			}
			public void windowDeactivated(WindowEvent we) {
				System.out.println("window was blurred");
			}
			public void windowActivated(WindowEvent we) {
				System.out.println("window was focused");
			}
			public void windowDeiconified(WindowEvent we) {
				System.out.println("window was restored");
			}
		};
		f.addWindowListener(wl);
		f.setSize(300, 200); //width, height
		f.setLocationRelativeTo(null); //put in center of screen
		f.setVisible(true); //show to the user
    }
}
