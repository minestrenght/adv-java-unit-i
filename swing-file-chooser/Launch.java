import javax.swing.JFileChooser;
import java.io.File;

public class Launch {

    public static void main(String[] args) {
		JFileChooser fc = new JFileChooser();
		fc.showOpenDialog(null);
		File file = fc.getSelectedFile();
		if(null == file) {
			System.out.println("U hv not choose any file/folder");
		} else {
			String what = file.isFile() ? "file" : "folder";
			System.out.printf("U hv choose %s named: %s", what, file.getName());
		}
    }
}
