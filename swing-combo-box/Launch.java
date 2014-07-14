import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Launch {

    public static void main(String[] args) {
		String[] list = {"Select", "Fruits", "Fish", "Salad", "Chicken 65"};
		JComboBox cb = new JComboBox(list);//set list for combo box
		JFrame f = new JFrame("My Swing Frame");
		f.getContentPane().add(cb);//add combo box to frame
		f.pack();
		f.setLocationRelativeTo(null);//position in d center
		f.setVisible(true);//show on d screen
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//kill app on close
    }
}
