import java.util.*;

//Generic 적용 
class AA 
{
	ArrayList<String> list = new ArrayList<String>(); //모든 타입을 저장 

    void in(){
		list.add("봄"); 
		list.add("가을");
		list.add("여름");
		list.add("겨울");
	}
	void out(){
		int size = list.size();
		for(int i=0; i<size; i++){
			String str = list.get(i);
			System.out.println(str);
		}
	}
	public static void main(String[] args) 
	{
		AA a = new AA();
		a.in();
		a.out();
	}
}

