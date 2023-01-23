import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class IMC_Ventana {
    private JPanel panel2;
    private JButton Calcular;
    private JTextField Ingrese_talla;
    private JTextField Iingrese_peso;
    private JLabel RESPUESTALabel;

    public IMC_Ventana() {

        Calcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DecimalFormat df = new DecimalFormat("0.##");
                double altura = Double.parseDouble(Ingrese_talla.getText());
                double peso = Double.parseDouble(Iingrese_peso.getText());
                double resultado_imc=peso/(altura*altura);

                /*Me mostrara una ventana emergente con los el resultado */
                //JOptionPane.showMessageDialog(null, df.format(resultado_imc));

                /*Me mostrara el resultado donde estaba el Jlabel */
                RESPUESTALabel.setText("RESULTADO: " + df.format(resultado_imc));

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame1 = new JFrame("IMC_Ventana");
        frame1.setContentPane(new IMC_Ventana().panel2);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.pack();
        frame1.setVisible(true);
    }
}
