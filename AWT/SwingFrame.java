package MyFrame;

import java.awt.*;

import javax.swing.*;

public class SwingFrame extends JFrame {
SwingFrame(){
	JButton b=new JButton("this Button");
	add(b);
	setLayout(new FlowLayout());
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setVisible(true);
	}
public static void main(String s[]) {new SwingFrame();}
}
