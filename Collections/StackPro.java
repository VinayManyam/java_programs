package Collections;

import java.util.Stack;

public class StackPro {
@SuppressWarnings("unchecked")
public static void main(String []a) {
	Stack s=new Stack();
	s.push(123);
	s.push(new Integer(10));
	s.push(new Integer(20));
	s.push(new Integer(30));
	s.push(new Integer(40));
	s.push(new Integer(50));
	System.out.println("s:"+s);
	System.out.println(s.pop());
	System.out.println("s:"+s);
	System.out.println(s.peek());
	System.out.println("s:"+s);
	
	System.out.println("index of 10:"+(s.size()-s.search(new Integer(10))));
	
	
}
}
