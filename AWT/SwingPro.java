package MyFrame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.JTableHeader;

public class SwingPro extends JFrame {
SwingPro(){
	JFrame frame=new JFrame("Jframe table");
	String[][] rowsData= {{"abc","bcd","edr"},{"123","234","122"},{"123","234","hrh"}};
	String[] colData= {"1","2","3"};
	JTable tb=new JTable(rowsData,colData);
	JTableHeader h=new JTableHeader();
	h.setBackground(Color.green);
	JScrollPane pane=new JScrollPane(tb);
	
	JPanel panel=new JPanel();
	panel.add(pane);
	panel.add(tb,BorderLayout.CENTER);
	frame.add(panel);
	frame.setSize(450,350);
	frame.setUndecorated(true);
	frame.getRootPane().setWindowDecorationStyle(JRootPane.PLAIN_DIALOG);
	frame.setLayout(new FlowLayout());
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);

}
public static void main(String []a) {
	new SwingPro();
}
}
