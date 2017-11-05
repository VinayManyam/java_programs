package MyFrame;

import java.awt.*;
import java.awt.FlowLayout;


import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class SwingPro4 extends JFrame {
SwingPro4(){
	JFrame frame=new JFrame("Jframe table");
	JPanel panel=new JPanel();
	String[][] rowsData= {{"abc","bcd","edr"},{"123","234","122"},{"123","234","hrh"}};
	String[] colData= {"1","2","3"};
	DefaultTableModel dt=new DefaultTableModel(rowsData,colData);
	JTable tb=new JTable(dt);
	dt.insertRow(0,new Object[]{"v1","50"});
	dt.insertRow(1,new Object[]{"v2","250"});
	dt.insertRow(3,new Object[]{"v3","350"});
	dt.insertRow(tb.getRowCount(),new Object[]{"vl","650"});
dt.removeRow(2);
	
	panel.add(tb);
	frame.add(panel);
	frame.setSize(450,350);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);

}
public static void main(String []a) {
	new SwingPro4();
}
}
