import java.util.*;

class AQQ 
{
	ArrayList<String> list = new ArrayList<String>(); //모든 타입을 저장 
	String strs[] = {"봄", "초가을", "가을", "여름", "겨울"};

    void in(){
		list.add("봄"); //String -> Object 
		//Integer iObj = 10; //Auto Boxing 
		//list.add(10); //int -> Integer -> Object
		list.add("초가을"); 
		list.add("가을");
		list.add("여름");
		list.add("겨울");
	}
	void in2(){
		for(String str: strs) list.add(str);
	}

	void in3(){
		for(int i=0; i<strs.length; i++){
			list.add(strs[i]);
		}
	}

	void out(){
		int size = list.size();
		for(int i=0; i<size; i++){
			Object obj = list.get(i);
			String str = (String)obj;
			System.out.println(str);
		}
	}
	public static void main(String[] args) 
	{
		AQQ a = new AQQ();
		//a.in();
		//a.in2();
		a.in3();
		a.out();
	}
}
