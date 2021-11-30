package gui;

import javax.swing.*;
import java.awt.*;

public class Gui extends JFrame {
    Container cPane = getContentPane();
    JTextArea in = new JTextArea(1, 20);
    JTextArea out = new JTextArea(1, 20);
    JButton encodeBut = new JButton("Encode");
    JButton decodeBut = new JButton("Decode");
    JPanel buttonPanel = new JPanel(new GridLayout(1,2));

    public Gui(){
        cPane.setLayout(new GridLayout(3,1));

        cPane.add(new JPanel().add(in));
        cPane.add(buttonPanel);
        cPane.add(new JPanel().add(out));

        out.setEditable(false);

        buttonPanel.add(encodeBut);
        buttonPanel.add(decodeBut);


        setSize(600,400);
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }


}
