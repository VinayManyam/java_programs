package FundamentalClasses;

public class CloneAdress2  implements Cloneable {
int flatno=123;
String colony="sr nagar";
String city="Hyd";

public CloneAdress2 clone() throws CloneNotSupportedException {
	System.out.println("CloneAdress2 clone:"+(CloneAdress2)super.clone());
	return (CloneAdress2)super.clone();
}

}
