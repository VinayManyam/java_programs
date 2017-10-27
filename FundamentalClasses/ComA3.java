package FundamentalClasses;

public class ComA3 {

	int x;
	ComA3(int x){
		this.x=x;
		}
	public int hashCode() {
		return x;
	}
	public int JVMHC() {
		return super.hashCode();
	}
}
