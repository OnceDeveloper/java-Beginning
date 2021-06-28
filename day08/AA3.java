import java.util.*;

class AA3 {
	
	ArrayList<Boolean> list = new ArrayList<Boolean>();

	void in(){
		list.add(true);
		list.add(new Boolean(false));
		list.add(false);
	}

	void out1(){
		int size = list.size();
		for(int i=0; i<size; i++){
			Boolean bobj = list.get(i);
			boolean b = bobj.booleanValue();
			System.out.println(b);
		}
	}
	void out2(){
		int size = list.size();
		for(int i=0; i<size; i++){
			boolean b = list.get(i);
			System.out.println(b);
		}
	}

	void out3(){//Enhanced Loop
		for(boolean b : list){
			System.out.println(b);
		}
	}

	public static void main(String[] args) 
	{
		AA3 a = new AA3();
		a.in();
		a.out1();
		System.out.println("");
		a.out2();
		System.out.println("");
		a.out3();
	}
}
