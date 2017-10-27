package FundamentalClasses;

public class Student {
private int sno;
private String sname;
private int withclass;
public String toString() {
	return sno+sname+withclass;
}

public Student(int sno,String sname,int withclass) {
	this.sno=sno;
	this.sname=sname;
	this.withclass=withclass;
	}

public boolean equals(Object e) {
	if(this==e) {
		return true;
	}else {
		if(e instanceof Student) {
			Student s=(Student)e;
			return this.sno==s.sno&&this.sname==s.sname&&this.withclass==s.withclass;
		}
		else return false;
	}
	
}

}
