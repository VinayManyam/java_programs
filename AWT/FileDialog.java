package MyFrame;

import java.awt.*;
import java.awt.event.*;
import java.io.*;


public class FileDialog  extends Frame implements ActionListener{

	TextArea t1;
	Button b1,b2,b3;
	FileDialog dlg;
	Font f1;
	String strFileName;
	
	FileDialog (){
		setBackground(Color.pink);
		setForeground(Color.blue);
		setTitle("File Dialog title");
		setLayout(new FlowLayout());
		
		f1=new Font("Arial",Font.BOLD,12);
		setFont(f1);
		
		t1=new TextArea(15,60);
		
		b1=new Button("Open");
		b2=new Button("Save");
		b3=new Button("Exit");
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		add(t1);
		add(b1);
		add(b2);
		add(b3);
		setSize(450,350);
		show();
		
		
	}
	
	
    public static File loadFile(Frame f, String title, String defDir, String defFile, 
            String[] fileExtensions, boolean allowDirectories) { 
        FileDialog fd = new FileDialog(f, title, FileDialog.LOAD); 
        fd.setFile(defFile); 
        //fd.setFilenameFilter(); 
        fd.setDirectory(defFile); 
        fd.setLocation(50, 50); 
        fd.setVisible(true); 
        if (fd.getDirectory() != null && fd.getFile() != null) { return new File(fd.getDirectory(), 
                fd.getFile()); } 
         
        return null; 
 
    } 
	public void actionPerformed(ActionEvent a) {
		if(a.getSource()==b1) {
		//	dlg =new FileDialog(this,"tttt",FileDialog.LOAD);
			dlg.show();
			try {
				//strFileName=d1.getDirectory()+"\\"+d1.getFile();
				FileReader f2=new FileReader("C:\\Users\\java\\eclipse-workspace\\Awt\\src\\MyFrame\\Add2.java");
				BufferedReader bu=new BufferedReader(f2);
				t1.setText("");
				String str;
				while((str=bu.readLine())!=null) {
					t1.append(str);
				}
			}catch(Exception e) {e.printStackTrace();}
		}else if(a.getSource()==b2) {
			String st1="C:\\Users\\java\\eclipse-workspace\\Awt\\src\\MyFrame\\Add4.java";
			try {
				FileWriter f3=new FileWriter(st1);
				f3.write(t1.getText());
				t1.setText("test text copyed or not!!!...");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}else if(a.getSource()==b3) {
			System.exit(0);
		}
		
		
		
		
	}
	public static void main(String []a) {
		new FileDialog();
	}

}
