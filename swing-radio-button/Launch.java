import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class Launch {

    public static void main(String[] args) {
		JFrame f = new JFrame("My Swing Frame");
        ButtonGroup bg = new ButtonGroup();
		JRadioButton b = new JRadioButton("Male", true);//default checked
        bg.add(b);//put radio in group to avoid multiple selection
		f.getContentPane().add(b, BorderLayout.EAST);
        b = new JRadioButton("Female");
        bg.add(b);
		f.getContentPane().add(b, BorderLayout.WEST);
		f.pack();
		f.setLocationRelativeTo(null);//position in d center
		f.setVisible(true);//show on d screen
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//kill app on close
    }
}
