package MyFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


@SuppressWarnings("serial")
class MyDialog extends Dialog {
	Button b;Font fn;
MyDialog(Frame f,String name) {
		super(f,name,true);
		setBounds(100,50,220,100);
		setForeground(Color.blue);
		setLayout(new FlowLayout());
		fn=new Font("Arial",Font.BOLD,12);
		setFont(fn);
		b=new Button("Close");
		add(b);
		
	
	}
public void paint(Graphics g) {
	g.drawString("this is a custom dialog box",30,80);
}


public static void main(String []a) {
	Frame fn=new Frame();
	
	new MyDialog(fn,"hellow1");
}

}
