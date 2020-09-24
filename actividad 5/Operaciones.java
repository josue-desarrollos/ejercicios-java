import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

    public class Operaciones extends JFrame implements ActionListener
    {
        private JButton calcu;
        private JLabel valor1,valor2,multi,divi,rest,sum,modul;
        private JTextField dig1, dig2;
        private JTextField resulatdosum,resulatdores,resulatdomult,resulatdodiv,resulatdomod;

    public static void main(String[] args)
      {
        Operaciones demo = new Operaciones();
        demo.setSize(280,500);
        demo.createGUI();
        demo.setVisible(true);
      }
        private void createGUI()
        {
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            Container window = getContentPane();
            window.setLayout(new FlowLayout());

            valor1 = new JLabel("\n Ingresa un numero"); //valor ingresado para realizar operacion
            window.add(valor1);
            dig1 = new JTextField(10);
            window.add(dig1);

            valor2 = new JLabel("\n Ingresa otro numero"); //segundo valor ingresado para realizar operacion
            window.add(valor2);
            dig2 = new JTextField(10);
            window.add(dig2);

            calcu = new JButton("\n Calcular"); //boton que va a calcular
            window.add(calcu);
            calcu.addActionListener(this);

            sum = new JLabel("\n la suma es ");
            window.add(sum);
            resulatdosum = new JTextField(10); //salida de texto de suma
            window.add(resulatdosum);

            rest = new JLabel("\n la resta es ");
            window.add(rest);
            resulatdores = new JTextField(10); //salida de texto de resta
            window.add(resulatdores);

            multi = new JLabel("\n la Multiplicacion es ");
            window.add(multi);
            resulatdomult = new JTextField(10); //salida de texto de multiplicacion
            window.add(resulatdomult);

            divi = new JLabel("\n la Division es ");
            window.add(divi);
            resulatdodiv = new JTextField(10); //salida de texto de division
            window.add(resulatdodiv);

            modul = new JLabel("\n el Modulo es ");
            window.add(modul);
            resulatdomod = new JTextField(10); //salida de texto de modulo
            window.add(resulatdomod);
              }

        @Override
        public void actionPerformed(ActionEvent event)
        {
            if (event.getSource() == calcu)
            {
                resulatdosum.setText("");
                resulatdores.setText("");
                resulatdomult.setText("");
                resulatdodiv.setText("");
                resulatdomod.setText("");
                try
                {
                    int number = Integer.parseInt(dig1.getText());
                    int number2 = Integer.parseInt(dig2.getText());

                    resulatdosum.setText(Integer.toString(number+number2));
                    resulatdores.setText(Integer.toString(number-number2));
                    resulatdomult.setText(Integer.toString(number*number2));
                    resulatdodiv.setText(Integer.toString(number/number2));
                    resulatdomod.setText(Integer.toString(number%number2));
                }
                catch (NumberFormatException errorObject)
                {
                    JOptionPane.showMessageDialog(null, "Error in number: retype");
                }
            }
        }
    }
