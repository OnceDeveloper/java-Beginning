package aa.bb;

import aa.cc.T1Friend;

public class T1 
{
	public int i = 10;
	private T1(){
		T1Friend f = new T1Friend(this);
		f.use();
	}
	public void m(){
		System.out.println("T1ÀÇ m()");
	}

	public static void main(String args[]){
		new T1();
	}
}