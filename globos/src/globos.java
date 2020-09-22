
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class globos extends JFrame implements ActionListener {
    private JButton growButton,growButton2, moveButton,moveButton2;
    private JPanel panel;
    private globo globo;
    public static void main(String[] args)
    {
        globos demo = new globos();
        demo.setSize(400,420);
        demo.createGUI();
        demo.setVisible(true);
    }
    private void createGUI()
    {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(300, 300));
        panel.setBackground(Color.white);
        window.add(panel);
        moveButton = new JButton("move Rig");
        window.add(moveButton);
        moveButton.addActionListener(this);
        growButton = new JButton("grow");
        window.add(growButton);
        growButton.addActionListener(this);
        //utilizamos las 2 nuevas variables para hacer los botones
        moveButton2 = new JButton("move Lef");
        window.add(moveButton2);
        moveButton2.addActionListener(this);
        growButton2 = new JButton("Reduce");
        window.add(growButton2);
        growButton2.addActionListener(this);
        globo = new globo();
    }
    public void actionPerformed(ActionEvent event)
    {
        Graphics paper = panel.getGraphics();
        if (event.getSource() == moveButton)
        {
            globo.moveRight(20);
        }
        else if(event.getSource() == growButton)
        {
            globo.changeSize(20);
        }
        //se agrega el evento y su metodo
        Graphics paper2 = panel.getGraphics();
        if (event.getSource() == moveButton2)
        {
            globo.moveleft(20);
        }
        else if(event.getSource() == growButton2)
        {
            globo.reduceSize(20);
        }
        paper.setColor(Color.white);
        paper.fillRect(0, 0, 300, 300);
        globo.display(paper);
    }
}