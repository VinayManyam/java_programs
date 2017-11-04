package App;

public class Address implements java.io.Serializable{
	String city;
	int hno,streetNo;
	Address(int hno,int streetNo,String city){
		this.hno=hno;
		this.streetNo=streetNo;
		this.city=city;
		}
	public String toString() {
		return "hno:"+hno+"\nstreetNo:"+streetNo+"\ncity:"+city;
	}

}
