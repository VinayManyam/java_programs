package FundamentalClasses;

public class Student2 {
private int sno;
private String sname;
private int withclass;

public Student2(int sno,String sname,int withclass) {
	this.sno=sno;
	this.sname=sname;
	this.withclass=withclass;
	}

public boolean equals(Object e) {
	if(this==e) {
		return true;
	}else {
		if(e instanceof Student2) {
			Student2 s=(Student2)e;
			return this.sno==s.sno&&this.sname==s.sname&&this.withclass==s.withclass;
		}
		else return false;
	}
	
}

public int hashCode() {
	return sno+sname.length()+withclass;
}

}
