import javax.swing.JOptionPane;

public class Gui {
    public static void main(Stringjj[] args) {
        Stringjj name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, args, "hello" + name, 0);
    }

}
