package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BasicCalculator implements ActionListener {
	
	
	static JFrame frame;
	static JTextField text;
 
 
	BasicCalculator() {

	}
	
	public void actionPerformed(ActionEvent e) {
		
	}
 

    public static void main(String args[]) {

        frame = new JFrame("calculator");
 
        BasicCalculator calc = new BasicCalculator();
 
        text = new JTextField(16);
 
        text.setEditable(false);
 
        JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, ba, bs, bm, bd, be, bc, bp;
 
        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
 
        be = new JButton("=");
 
        ba = new JButton("+");
        bs = new JButton("-");
        bd = new JButton("/");
        bm = new JButton("*");

        bc = new JButton("C");
        
        bp = new JButton(".");
 
        JPanel panel = new JPanel();
 
        b0.addActionListener(calc);
        b1.addActionListener(calc);
        b2.addActionListener(calc);
        b3.addActionListener(calc);
        b4.addActionListener(calc);
        b5.addActionListener(calc);
        b6.addActionListener(calc);
        b7.addActionListener(calc);
        b8.addActionListener(calc);
        b9.addActionListener(calc);
        ba.addActionListener(calc);
        bs.addActionListener(calc);
        bm.addActionListener(calc);
        bd.addActionListener(calc);
        be.addActionListener(calc);
        bc.addActionListener(calc);
        bp.addActionListener(calc);

        panel.add(text);
        panel.add(ba);
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(bs);
        panel.add(b4);
        panel.add(b5);
        panel.add(b6);
        panel.add(bm);
        panel.add(b7);
        panel.add(b8);
        panel.add(b9);
        panel.add(bd);
        panel.add(be);
        panel.add(bc);
        panel.add(b0);
        panel.add(bp);
 
        panel.setBackground(Color.green);
 
        frame.add(panel);
 
        frame.setSize(250, 230);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}
