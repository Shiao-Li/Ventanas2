import javax.swing.*;

public class ventana1 extends JFrame{
    private JTextField ingreseSuNombreTextField;
    private JButton okButton;
    private JPasswordField contraseñaPasswordField;
    private JPanel panel1;

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("ventana1");
        frame.setContentPane(new ventana1().panel1);
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);


    }
}
