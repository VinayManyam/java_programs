package Enum;

public enum Month2 {
Jan(1),Feb(2);
	private int num;
	Month2(int num){
		this.num=num;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num=num;
	}
}
