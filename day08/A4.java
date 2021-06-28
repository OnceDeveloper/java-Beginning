import java.util.*;

class A4 {
	
	ArrayList<Object> lis = new ArrayList<Object>();//제네릭을 사용하여 Note 메시지 안 나오게 함.
	
	void in(){
		lis.add("안녕");
		lis.add("하세요");
		lis.add("어려워");
		lis.add("요");
		lis.add("!");
	}

	void out(){
		int size = lis.size();
		for(int i=0; i<size; i++){
			Object obj = lis.get(i);//obj라는 참조형 변수에 lis에 있는 i번째 값을 넣는다.ex)lis.get(0) = "안녕"
			String str = (String)obj;//lis에 String형만 넣었으니까 Object가 된 lis를 원 상태인 String으로 돌려주기 위해 obj를 강제형변환해줌
			System.out.println("lis["+i+"] : "+str);
		}
	}

	public static void main(String[] args) 
	{
		A4 a = new A4();
		a.in();
		a.out();
	}
}
