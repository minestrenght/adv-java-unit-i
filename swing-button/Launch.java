import javax.swing.JFrame;
import javax.swing.JButton;

public class Launch {

    public static void main(String[] args) {
		JFrame f = new JFrame("My Swing Frame");
		JButton b = new JButton("Click me !");
		f.getContentPane().add(b);
		f.pack();
		f.setLocationRelativeTo(null);//position in d center
		f.setVisible(true);//show on d screen
		//unlike awt frame, by default swing frame get hidden on close,
		//but it won't kill app
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//kill app on close
    }
}
