import javax.swing.JOptionPane;

public class Launch {

    public static void main(String[] args) {
		//simple message box
        JOptionPane.showMessageDialog(null, "Hi there");
        //error message box
        JOptionPane.showMessageDialog(null, "Problem occured", "Error", JOptionPane.ERROR_MESSAGE);
        //confirm box
        int opt = JOptionPane.showConfirmDialog(null, "choose one", "choose one", JOptionPane.YES_NO_OPTION);
        StringBuilder sb = new StringBuilder("You choose: ");
        if(JOptionPane.YES_OPTION == opt) {
            sb.append("Yes");
        } else {
            sb.append("No");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
        Object[] options = { "Go Ahead", "Nooo !" };
        opt = JOptionPane.showOptionDialog(null, "What to do now?", "Warning", JOptionPane.DEFAULT_OPTION, 
            JOptionPane.WARNING_MESSAGE,  null, options, options[0]);
        String name = JOptionPane.showInputDialog("Whatz ur name?");
        if(null == name) {
            JOptionPane.showMessageDialog(null, "Hi, " + name);
        } else {
            JOptionPane.showMessageDialog(null, "How mean !!");
        }
    }
}
