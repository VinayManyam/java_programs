package operators;

public class AllinOne {

	public static void main(String[] args) {
		int a=5,c=10,e=5,d;boolean b=true;

		
	//Increment
		System.out.println(a);
		System.out.println("postIncrement:"+ a++);
		System.out.println(a);
		System.out.println("preIncrement:"+ ++a);
		System.out.println(a);
		System.out.println("postIncrement:"+ a++ +"preIncrement:"+ ++a );
	//Decrement
		System.out.println(a);
		System.out.println("postDecrement:"+ a--);
		System.out.println(a);
		System.out.println("preDecrement:"+ --a);
		System.out.println(a);
		System.out.println("postDecrement:"+ a-- +"preDecrement:"+ --a );
	//conditions 
		System.out.println(a);
		System.out.println(a++ + ++a+a++ +a++ + ++a);

		System.out.println(+a);
		System.out.println(-a);
		System.out.println(b);
		System.out.println(!b);
		

		//Art. Operations
		d=a+c;
		System.out.println("Addition Operation(a+c):"+d);
		d=a-c;
		System.out.println("a-c:"+d);
		d=a*c;
		System.out.println("a*c:"+d);
		d=c/a;
		System.out.println("c/a:"+d);
		d=a%c;
		System.out.println("a%c:"+d);
		
	
	//relational operators
		System.out.println("a:"+a+" c:"+c+" e:"+e);
		b=a>c;
		System.out.println("a>c:"+b);
		b=a<c;
		System.out.println("a<c:"+b);
		
	//Equality operators	
		b=a==c;
		System.out.println("a==c:"+b);
		b=a==e;
		System.out.println("a==e:"+b);
		b=a!=c;
		System.out.println("a!=c:"+b);	
	
	//bitwise operators
		System.out.println("a:"+a+" c:"+c+" e:"+e);
		b=a==e&&a!=c;
		System.out.println("a==e&&a!=c :"+b);
		b=a==e&&c>a;
		System.out.println("a==e&&c>a :"+b);
		b=a==e&&c<a;
		System.out.println("a==e&&c<a :"+b);
		b=a==e||c<a;
		System.out.println("a||e&&c<a :"+b);

	//Logical operators	
		System.out.println("a:"+a+" c:"+c+" e:"+e);
		b=c>a?true:false;
		System.out.println(b);
				
		//Assignment operator
		System.out.println("a:"+a+" c:"+c+" e:"+e);
		a+=c;
		System.out.println(a);
		c-=a;
		System.out.println(c);
	}

}
