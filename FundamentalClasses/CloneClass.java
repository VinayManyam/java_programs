package FundamentalClasses;

public class CloneClass implements Cloneable{

	public CloneClass clone() throws CloneNotSupportedException{
		
		return (CloneClass)super.clone();
	}
}
