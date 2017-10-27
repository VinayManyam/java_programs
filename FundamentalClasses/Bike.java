package FundamentalClasses;

public class Bike implements Cloneable {
private int engineNumber;
private int modelNumber;
private String type;
private int bikeNumber;
public Bike(int engineNumber,int modelNumber,String type) {
	this.engineNumber=engineNumber;
	this.modelNumber=modelNumber;
	this.type=type;
}
public void setBikeNumber(int bikeNumber) {
	this.bikeNumber=bikeNumber;
	}
public Bike clone() throws CloneNotSupportedException{
	Bike n=(Bike)super.clone();
	n.engineNumber=this.engineNumber+10;
	return n;
}

public String toString() {
	return "Bike Number: "+bikeNumber+"\n"+"Engin Number:"+engineNumber+"\n"+"Model Number:"+modelNumber+"\nType:"+type;
	
}

	
}
