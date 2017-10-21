package garbageCollection;

public class GarbageColl {
	GarbageColl g;
	
public void finalize() {
	System.out.println("its gone");
}
	GarbageColl m1(GarbageColl g) {
	System.out.println("GarbageColl Non-static object m1(g)->g:"+g);
	g=null;
	//Runtime.getRuntime().gc();
	//System.gc();
	System.out.println("GarbageColl Non-static object m1(g)->g:"+g);
	GarbageColl h=new GarbageColl();
	System.out.println("GarbageColl Non-static object m1->h:"+h);
	return h;
}
	
public static void main(String []a) {
	System.out.println("GarbageColl main()");
	GarbageColl b,c,d,e,f,i,j,k;
	b=new GarbageColl();
	e=new GarbageColl();
	f=new GarbageColl();
	i=new GarbageColl();
	j=new GarbageColl();
	k=new GarbageColl();

	
	c=b.m1(b);
	System.out.println("GarbageColl local object c:"+c);
	d=new GarbageColl();
	System.out.println("GarbageColl local object d:"+d);
	d=b;//d is unrefferenced by overwritting with b object
	System.out.println("GarbageColl local object b:"+b);
	System.out.println("GarbageColl local object d:"+d);
	b=null;
	System.out.println("GarbageColl local object b:"+b);
	System.out.println("========= Islans of isolation ============");
	System.out.println("GarbageColl local object e:"+e);
	System.out.println("GarbageColl local object f:"+f);
	System.out.println("GarbageColl non-static object e.g:"+e.g);
	System.out.println("GarbageColl non-static object f.g:"+f.g);
	e.g=e;
	f.g=f;
	
	System.out.println("GarbageColl non-static object e.g:"+e.g);
	System.out.println("GarbageColl non-static object f.g:"+f.g);
	//System.out.println();
	e=null;
	f=null;
	System.out.println("GarbageColl local object e:"+e);
	System.out.println("GarbageColl local object f:"+f);
/*	System.out.println("GarbageColl non-static object e.g:"+e.g);
	System.out.println("GarbageColl non-static object f.g:"+f.g);
*/	
	System.out.println("========= calling garbage Collectors =========");

//Runtime.getRuntime().gc();
 System.gc();
System.out.println("Exicuting System.gc()");


	
}
}
