package MyFrame;
//flow layout
import java.awt.*;
import java.awt.event.*;

public class Add extends Frame implements ActionListener {
	Label l1,l2,l3;
	TextField tf1,tf2,tf3;
	Button b1,b2;
	Add(){
		
		
		l1=new Label("First No:");
		l2=new Label("Secound No:");
		l3=new Label("Result");
		
		tf1=new TextField(20);
		tf2=new TextField(20);
		tf3=new TextField(20);
		
		b1=new Button("Add");
		b2=new Button("Clear");
		b1.addActionListener(this);
		b2.addActionListener(this);
		add(l1);
		add(tf1);
		add(l2);
		add(tf2);
		add(l3);
		add(tf3);
		add(b1);
		add(b2);
		
		
		//setting frame properties
		
		setTitle("addtion window");
		setSize(500,500);
		setVisible(true);
	setLayout(new FlowLayout());
	setFont(new Font("Arial",Font.BOLD,24));
	setBackground(Color.CYAN);
	setForeground(Color.BLUE);
	
	}
	public void actionPerformed(ActionEvent e) {
	String bn=e.getActionCommand();
	if(bn.equals("Add")) {
		String s1=tf1.getText();
		String s2=tf2.getText();
		int n1=Integer.parseInt(s1);
		int n2=Integer.parseInt(s2);
		int n3=n1+n2;
		tf3.setText(n3+"");
		
	}else if(bn.equals("Clear")){
		tf1.setText("");
		tf2.setText("");
		tf3.setText("");
	}
		
	}
	
public static void main(String []a) {
	Add f=new Add();
	
	
}



}
