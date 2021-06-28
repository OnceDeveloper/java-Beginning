import java.util.*;

class AAAA1 {

	Vector<Integer> v = new Vector<Integer>();
	int ina[] = {0,1,2,3,4};
	int inb[] = {10,20,30,40,50};

	void in1(){//ina의 값이 inb로 바뀌기 전에 값을 넣음
		for(int i : ina) v.add(i);
	}

	void in2(){//ina[]의 값을 inb[]의 값으로 넣어줌(for문)
		for(int i =0; i<ina.length; i++){
			ina[i]=inb[i];
		}
	}

	void in4(){
		for(int i=0; i < ina.length; i++){//v에 바뀐 ina의 값을 넣어줌
			v.add(ina[i]);
		}
	}
	
	void out(){
		for(int i : v){//i에 v의 값(바뀌기 전인 ina값 + 바뀐 ina의 값)을 넣어줌
			System.out.println(i+1);	
		}
	}

	public static void main(String[] args) 
	{
		AAAA1 a = new AAAA1();
		a.in1();
		a.in2();
		a.in4();
		a.out();
	}
}
