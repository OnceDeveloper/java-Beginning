import java.util.*;

//Generic ���� + Boxing + Enhanced Loop
class AAAA 
{
	ArrayList<Integer> list = new ArrayList<Integer>(); //��� Ÿ���� ���� 

    void in(){
		list.add(10); // AutoBoxing ( int -> Integer ) 
		list.add(20);
		list.add(30);
		list.add(40);
	}
	void out(){
		for(int i: list) System.out.println(i);
	}
	public static void main(String[] args) 
	{
		AAAA a = new AAAA();
		a.in();
		a.out();
	}
}


