import java.util.*;

class AQ1 {

	Vector<Object> vec = new Vector<Object>();

	void in(){
		vec.add("하나");
		vec.add(new Integer(2));
		vec.add(3);//생략된 것 : new Integer(3); ->AutoBoxing
		vec.add("넷");
		vec.add("다섯");
		
	}

	void out(){
		int size = vec.size();
		for(int i=0; i<size; i++){
			Object obj = vec.get(i);//아직은 get이 갖고있는게 모두 참조형! 
			if(obj instanceof Integer){//obj가 갖고있는 String과 Integer중에 Integer의 객체인가?->true일때만 값을 넣는다.
									   //즉, obj가 Integer형인 경우에만 값을 넣는 조건식
				Integer iobj = (Integer)obj;//iobj에 Integer형인 obj만 넣는데 obj는 Integer보다 크기때문에 강제형변환을해줌
				int j = iobj.intValue();//수동 언박싱          ///Auto unboxing -> int j = iobj;
				System.out.println(j+1);//int형이라서 산술연산이 가능해짐
			}else{
				String sobj = (String)obj;
				System.out.println(sobj);
			}
			//System.out.println(i);
		}
	}

	public static void main(String[] args) 
	{
		AQ1 a = new AQ1();
		a.in();
		a.out();
	}
}
