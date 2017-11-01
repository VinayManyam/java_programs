package IOstream;

public class Bank implements java.io.Serializable {
	
	static double minBalance=5000;
private long accNo;
private String accHName;
private String userName;
private transient String password;
private double balance;

public void setAccHName(String accHName) {this.accHName=accHName;}
public String getAccHName() {return accHName;}

public void setAccNo(long accNo) {this.accNo=accNo;}
public long getAccNo() {return accNo;}

public void setUserName(String userName) {this.userName=userName;}
public String getUserName() {return userName;}

public void setPassword(String password) {this.password=password;}
public String getPassword() {return password;}

public void setBalance(double balance) {
	this.balance=minBalance+balance;
	}
public double geBalance() {return balance;}

public String toString() {
	return "accNo:"+accNo+"\naccHName:"+accHName+"\nuserName:"+userName+"\npassword:"+password+"\nbalance:"+balance+"\nminbalance:"+minBalance;
}

}
