package IOStreams;

import java.io.Serializable;

public class IOB1 extends IOA1{
int y;
IOB1(){
	y=60;
	System.out.println("IOA1 y:"+y);
}
public String toString() {
	return "x:"+x+" y:"+y;
}



}
