import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JTable;

public class Launch {

    public static void main(String[] args) {
		JFrame f = new JFrame("My Swing Frame");
		String[] col = {"Name", "Age", "Gender"};
		String[][] row = {
			{"Avinash", "21", "Male"},
			{"Aarti", "22", "Female"},
			{"Devjeet", "2", "Male"}
		};
		JTable tbl = new JTable(row, col);
		f.getContentPane().add(tbl.getTableHeader(), BorderLayout.NORTH);
		f.getContentPane().add(tbl, BorderLayout.CENTER);
		f.pack();
		f.setLocationRelativeTo(null);//position in d center
		f.setVisible(true);//show on d screen
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//kill app on close
    }
}
