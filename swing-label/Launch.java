import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;

public class Launch {

    public static void main(String[] args) {
		JFrame f = new JFrame("My Swing Frame");
		JLabel l = new JLabel("Its a label, in the left");
		f.getContentPane().add(l, BorderLayout.NORTH);
		l = new JLabel("in the center", JLabel.CENTER);
		f.getContentPane().add(l, BorderLayout.CENTER);
		l = new JLabel("yup, on the right", JLabel.RIGHT);
		f.getContentPane().add(l, BorderLayout.SOUTH);
		f.pack();
		f.setLocationRelativeTo(null);//position in d center
		f.setVisible(true);//show on d screen
		//unlike awt frame, by default swing frame get hidden on close,
		//but it won't kill app
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//kill app on close
    }
}
