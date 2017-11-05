package MyFrame;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class DialogPro extends Frame implements ActionListener {

	MyDialog d;
	Button b1;
	Font f1;
	
	@SuppressWarnings("deprecation")
	DialogPro(){
		setBackground(Color.pink);
		setForeground(Color.blue);
		setTitle("Dialog title");
		setLayout(new FlowLayout());
		
		f1=new Font("Arial",Font.BOLD,12);
		setFont(f1);
		
		d=new MyDialog(this,"DIalog Box");
		d.b.addActionListener(this);
		
		b1=new Button("Show dialog box");
		b1.addActionListener(this);
		add(b1);
		setSize(600,600);
		show();
	}

	public void actionPerformed(ActionEvent bn) {
		
		if(bn.getSource()==b1) {
			d.show();
			
		}else if(bn.getSource()==d.b) {
			d.dispose();
		}
	}
	public static void main(String []a) {
		new DialogPro();
	}

}
