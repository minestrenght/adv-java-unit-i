import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JDesktopPane;

public class Launch {

    public static void main(String[] args) {
		JDesktopPane dp = new JDesktopPane();
		JInternalFrame jif = new JInternalFrame("Simple");
		jif.setBounds(1, 1, 100, 60);//x, y, w, h
		jif.setVisible(true);//by default hidden
		dp.add(jif);
		jif = new JInternalFrame("Strech", true);
		jif.setBounds(10, 15, 100, 60);
		jif.setVisible(true);
		dp.add(jif);
		jif = new JInternalFrame("Close", false, true);
		jif.setBounds(30, 35, 100, 60);
		jif.setVisible(true);
		dp.add(jif);
		JFrame f = new JFrame("My Swing Frame");
		f.setContentPane(dp);
		f.setSize(300, 200);
		f.setLocationRelativeTo(null);//position in d center
		f.setVisible(true);//show on d screen
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//kill app on close
    }
}
