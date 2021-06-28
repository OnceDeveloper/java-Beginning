import java.util.*;

//Generic 적용 + Boxing 
class AAA 
{
	ArrayList<Integer> list = new ArrayList<Integer>(); //모든 타입을 저장 

    void in(){
		list.add(10); // AutoBoxing ( int -> Integer ) 
		list.add(20);
		list.add(30);
		list.add(40);
	}
	void out(){
		int size = list.size();
		for(int i=0; i<size; i++){
			//Integer iObj = list.get(i); 
			//int j = iObj.intValue();
			
			int j = list.get(i);//UnBoxing ( Integer -> int) 
			System.out.println(j);
		}
	}
	public static void main(String[] args) 
	{
		AAA a = new AAA();
		a.in();
		a.out();
	}
}

