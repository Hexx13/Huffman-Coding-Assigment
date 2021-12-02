package gui;

import huff.HuffmanTree;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//TODO GUI
// - Dazzle it up~~~
public class Gui extends JFrame implements ActionListener {
    Container cPane = getContentPane();
    JTextArea in = new JTextArea(1, 20);
    JTextArea out = new JTextArea(1, 20);
    JButton encodeBut = new JButton("Encode");
    JButton decodeBut = new JButton("Decode");
    JPanel buttonPanel = new JPanel(new GridLayout(1, 2));
    HuffmanTree tree;

    public Gui(HuffmanTree tree) {
        this.tree = tree;
        cPane.setLayout(new GridLayout(3, 1));

        cPane.add(new JPanel().add(in));
        cPane.add(buttonPanel);
        cPane.add(new JPanel().add(out));

        out.setEditable(false);

        buttonPanel.add(encodeBut);
        buttonPanel.add(decodeBut);
        encodeBut.addActionListener(this);
        decodeBut.addActionListener(this);
        setSize(600, 400);
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        //TODO Gui Input
        // -Implement Validation
        if (e.getSource() == decodeBut) {
            tree.decode(in.getText());
        } else if (e.getSource() == encodeBut) {
            tree.encode(tree.getRoot(), in.getText(),"");
            out.setText(tree.getEnResult());
        }
    }
}
