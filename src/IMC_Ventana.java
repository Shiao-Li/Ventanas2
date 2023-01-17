import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IMC_Ventana {
    private JPanel panel2;
    private JButton Calcular;
    private JTextField Ingrese_talla;
    private JTextField Iingrese_peso;

    public IMC_Ventana() {

        Calcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    public static void main(String[] args) {
        JFrame frame1 = new JFrame("IMC_Ventana");
        frame1.setContentPane(new IMC_Ventana().panel2);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.pack();
        frame1.setVisible(true);
    }
}
