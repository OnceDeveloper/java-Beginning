package aa.cc;

import aa.bb.TT1;

public class TT1Friend{

	private TT1 tt;

	public TT1Friend(TT1 tt){//private�� �ƴ϶� public
		this.tt = tt;
	}

	public void use(){
		System.out.println(tt.i);
		tt.m();
	}
	
}
