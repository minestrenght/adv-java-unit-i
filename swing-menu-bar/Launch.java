import javax.swing.JFrame;
import javax.swing.JMenuBar;

public class Launch {

    public static void main(String[] args) {
		JFrame f = new JFrame("My Swing Frame");
        JMenuBar mb = new JMenuBar();
        f.setJMenuBar(mb);//frame can have only 1 menu bar
		f.setSize(300, 200);
		f.setLocationRelativeTo(null);//position in d center
		f.setVisible(true);//show on d screen
		//unlike awt frame, by default swing frame get hidden on close,
		//but it won't kill app
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//kill app on close
    }
}
