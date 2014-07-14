import javax.swing.JColorChooser;
import java.awt.Color;

public class Launch {

    public static void main(String[] args) {
		Color c = JColorChooser.showDialog(null, null, null);
		if(null == c) {
			System.out.println("U dn't choose color ...");
		} else {
			System.out.printf("u hv choosen color: %s\n", c);
		}
    }
}
