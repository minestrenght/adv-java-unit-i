import javax.swing.JFrame;

public class Launch {

    public static void main(String[] args) {
		JFrame f = new JFrame("My Swing Frame");
		f.setSize(300,200);//set width, height
		f.setLocationRelativeTo(null);//position in d center
		f.setVisible(true);//show on d screen
		//unlike awt frame, by default swing frame get hidden on close,
		//but it won't kill app
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//kill app on close
    }
}
