package aa.cc;

import aa.bb.T1;

public class T1Friend 
{
	private T1 t;

	public T1Friend(T1 t){
		this.t = t;
	}
	public void use(){
		System.out.println("t.i: " + t.i);
		t.m();
	}
}
