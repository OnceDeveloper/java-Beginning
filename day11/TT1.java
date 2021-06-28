package aa.bb;

import aa.cc.TT1Friend;

public class TT1{

	public int i = 10;

	
	private TT1(){
		TT1Friend t = new TT1Friend(this);
		t.use();
	}
	public void m(){
		System.out.println("호출가능해?");
	}
	
	public static void main(String[] args) 
	{
		new TT1();
	}
}
