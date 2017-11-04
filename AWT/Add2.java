package MyFrame;
//Custom layout
import java.awt.*;
import java.awt.event.*;


public class Add2 extends Frame implements ActionListener{
	Label l1,l2,l3;
	TextField tf1,tf2,tf3;
	Button Add,Cancel;
	Toolkit tk;
	Dimension d;
	Add2(String name){
		super(name);
		setVisible(true);
		//creating window with monitor size
		tk=Toolkit.getDefaultToolkit();
		d=tk.getScreenSize();
		int h=d.height;
		int w=d.width;
		setSize(h,w);
		setLayout(null);
		setFont(new Font("Times New Roman",Font.BOLD,30));
		setBackground(Color.gray);
		setForeground(Color.red);
		

		l1=new Label("Fno:");
		l1.setBounds(100,50,80,50);
		add(l1);
		tf1=new TextField(20);
		tf1.setBounds(200,50,200,50);
		add(tf1);		

		l2=new Label("Sno:");
		l2.setBounds(400,50,80,50);
		add(l2);
		tf2=new TextField(20);
		tf2.setBounds(500,50,200,50);
		add(tf2);
		
		l3=new Label("Sum:");
		l3.setBounds(150,150,80,50);
		add(l3);
		tf3=new TextField(20);
		tf3.setBounds(300,150,200,50);
		add(tf3);
		
		
		Add=new Button("Add");
		Add.setBounds(150,250,100,50);
		add(Add);
		Cancel=new Button("Cancel");
		Cancel.setBounds(350,250,100,50);
		add(Cancel);
		
		Add.addActionListener(this);
		Cancel.addActionListener(this);
		
		
	}

	
	public void actionPerformed(ActionEvent e1) {
try {
	if(e1.getSource()==Add) {
		try {
			int x=Integer.parseInt(tf1.getText());
			int y=Integer.parseInt(tf2.getText());
			int z=x+y;
			tf3.setText(z+"");
			
		}catch(NumberFormatException b) {
			b.printStackTrace();
		}catch(NullPointerException d) {
			d.printStackTrace();
		}catch(Exception f) {
			f.printStackTrace();
		}
	}
	
}catch(Exception g) {g.printStackTrace();}

if(e1.getSource()==Cancel) {
	try {
		tf1.setText("");
		tf2.setText("");
		tf3.setText("");

	}catch(Exception f) {
		f.printStackTrace();
	}
}





		
	}
	public static void main(String []a) {
		new Add2("add Frame").show();
	}

}
