package Collections;

public class Customer {
String name;
int age;
Address Address;

Customer(String name,int age,Address Address){
	this.name=name;
	this.age=age;
	this.Address=Address;
}

public String toString() {
	return ("name:"+name+"\nAge:"+age+"\nH.no:"+Address.hno+"\nStreet:"+Address.street+"\ncity:"+Address.city+"\nph:"+Address.ph);
}
}
