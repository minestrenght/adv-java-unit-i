import java.awt.Window;

public class Launch {

    public static void main(String[] args) {
		System.out.println("Press ctrl + c to exit");
		Window w = new Window(null);
		w.setSize(300, 200); //width, height
		w.setLocationRelativeTo(null); //put in center of screen
		w.setVisible(true); //show to the user
    }
}
