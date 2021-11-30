package gui;

import javax.swing.*;
import java.awt.*;

public class Gui extends JFrame {
    Container cPane = getContentPane();
    JTextArea in = new JTextArea();
    JTextArea out = new JTextArea();
    JButton encodeBut = new JButton("Encode");
    JButton decodeBut = new JButton("Decode");
    JPanel buttonPanel = new JPanel(new GridLayout(2,1));

    public Gui(){
        add(cPane);
        cPane.setLayout(new GridLayout(1,3));
        cPane.add(in);
        cPane.add(buttonPanel);
        cPane.add(out);

        out.setEditable(false);
        buttonPanel.add(encodeBut);
        buttonPanel.add(decodeBut);






    }


}
