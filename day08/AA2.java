import java.util.*;

class AA2 {

	ArrayList<Integer> list = new ArrayList<Integer>();

	void in(){
		list.add(0);
		list.add(new Integer(1));
		list.add(2);
		list.add(3);
	}
	void out1(){//¼öµ¿¾ð¹Ú½Ì
		int size = list.size();
		for(int i=0; i<size; i++){
			Integer j = list.get(i);
			int k = j.intValue();

			System.out.println(k+1);
		}
	}

	void out2(){//¾ð¹Ú½Ì
		int size = list.size();
		for(int i=0; i<size; i++){
			int j = list.get(i);
			System.out.println(j+2);
		}
	}

	public static void main(String[] args) 
	{
		AA2 a = new AA2();
		a.in();
		a.out1();
		System.out.println("");
		a.out2();
	}
}
