package CartasP;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Iinterface extends JFrame implements ActionListener {
    private JButton Revolver, Head, Pick, Hand;
    private JEditorPane vista;
    private Deck pl;

    public static void main(String[] args) {
        Deck op = new Deck();
        Iinterface frame = new Iinterface();
        frame.setSize(550, 550);
        frame.createGUI();
        frame.setVisible(true);
        frame.CreateDeck();
    }

    private void CreateDeck() {
        pl = new Deck();
    }


    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        JLabel Titulo = new JLabel("Bienvenido a Poker \n QUE OPCION DECEAS REALIZAR?");
        window.add(Titulo);
        Revolver = new JButton("Revolver"); //boton
        window.add(Revolver);
        Revolver.addActionListener(this);
        Head = new JButton("Head"); //boton
        window.add(Head);
        Head.addActionListener(this);
        Pick = new JButton("Pick"); //boton
        window.add(Pick);
        Pick.addActionListener(this);
        Hand = new JButton("Hand"); //boton
        window.add(Hand);
        Hand.addActionListener(this);

        vista = new JEditorPane();
        window.add(vista);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        vista.setText("");

        if (e.getSource() == Revolver) {
            vista.setText(pl.shuffle());
        } else if (e.getSource() == Head) {
            vista.setText(pl.head());
        } else if (e.getSource() == Pick) {
            vista.setText(pl.pick());
        } else if (e.getSource() == Hand) {
            vista.setText(pl.hand());
        }
    }
}