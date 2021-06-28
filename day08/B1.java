import java.util.*;

class B1{
	
	TreeSet set1 = new TreeSet();
	

	void in(){
		set1.add("봄");
		set1.add("여름");
		set1.add("여름");
		set1.add("가을");
		set1.add("10");
	}

	void out(){
		String item = "";//지역변수니까 초기화를 해줌
		Iterator iter = set1.descendingIterator();//set1에 있는 값을 내림차순해준다.
		while(iter.hasNext()){//set에 요소가 있을때 까지만 반복
			item = (String)iter.next();//item에 iter의 값을 넣어준다
			System.out.println("item: " +item);
		}
	}

	public static void main(String[] args) 
	{
		B1 b = new B1();
		b.in();
		b.out();
	}
}
