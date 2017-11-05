package MyFrame;

import java.awt.*;
import java.awt.event.*;

public class JavaEditor extends Frame implements ActionListener {

	TextArea ta;
	FileDialog dlg;
	Font f;
	String strFileName,str;
	MenuBar mb;
	Menu mFile,mFormat,mSubColor,mSubStyle;
	MenuItem miNew,miOpen,miSave,miExit;
	MenuItem miPink,miOrange,miGray,miPlain,miBold,miItalic;
	
	JavaEditor(){
		setForeground(Color.blue);
		setTitle("File Dialog title");
		setLayout(new FlowLayout());
		
		f=new Font("Arial",Font.BOLD,12);
		setFont(f);
		mb=new MenuBar();
		setSize(600,600);
		ta=new TextArea();
		add(ta);
		show();
		
		mFile=new Menu("FIle");
		mFormat=new Menu("Format");
		mSubColor=new Menu("Color");
		mSubStyle=new Menu("Style");
		mb.add(mFile);
		mb.add(mFormat);
		
		miNew=new MenuItem("New");
		miOpen=new MenuItem("Open");
		miSave=new MenuItem("Save");
		miExit=new MenuItem("Exit");
		mFile.add(miNew);
		mFile.add(miOpen);
		mFile.add(miSave);
		mFile.add(miExit);
		
		mFormat.add(mSubColor);
		mFormat.add(mSubStyle);
		miPink=new MenuItem("Pink");
		miOrange=new MenuItem("Orange");
		miGray=new MenuItem("Gray");
		miPlain=new MenuItem("Plain");
		miBold=new MenuItem("Bold");
		miItalic=new MenuItem("Italic");
		mSubColor.add(miPink);
		mSubColor.add(miOrange);
		mSubColor.add(miGray);
		mSubStyle.add(miBold);
		mSubStyle.add(miItalic);
		
		setMenuBar(mb);
		
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent ae) {
if(ae.getSource()==miOpen) {
	f=new Font("Arial",Font.BOLD,12);
	//dlg=new FileDialog(this,"Save",FileDialog.LOAD);
	try{
	
		
		
		
	}catch(Exception e) {e.printStackTrace();}
}
		
	}
public static void main(String []a) {
	new JavaEditor();
}
}
