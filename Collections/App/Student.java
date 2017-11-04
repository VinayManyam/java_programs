package App;

public class Student implements java.io.Serializable{

	int sno;
	String name;
	int withClass;
	public Student(int sno,String name,int withClass) {
		this.sno=sno;
		this.name=name;
		this.withClass=withClass;
		}
	public int hashCode() {
		return withClass;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student s=(Student)obj;
			if(this.sno==s.sno&&this.name==s.name&&this.withClass==s.withClass) {
				return true;
			} 
		}return false;
	}
	public String toString() {
		return withClass+":"+name;
	}
	
}
