import java.util.*;

class AA1{

	Vector<String> v = new Vector<String>();

	void in(){
		v.add("��");
		v.add("��");
		v.add("��");
		v.add("õ");
		v.add("��");
	}

	void out(){
		int size = v.size();
		for(int i=0; i<size; i++){
			String str = v.get(i);
			System.out.println(str);
			//System.out.println(v.get(i));
		}
	}

	public static void main(String[] args) 
	{
		AA1 a = new AA1();
		a.in();
		a.out();
	}
}
