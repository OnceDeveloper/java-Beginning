import java.util.*;

class AQ2 {

	ArrayList<Object> list = new ArrayList<Object>();

	void in(){
		list.add(1);
		list.add(new Integer(10));
		list.add("오십");
		list.add("백");
	}

	void out(){
		int size = list.size();
		for(int i=0; i<size; i++){
			Object obj = list.get(i);
			if(obj instanceof Integer){
				Integer iobj = (Integer)obj;
				int j = iobj.intValue();/// (= int j = iobj;)
				System.out.println(j+1);
			}else{
				String str = (String)obj;
				System.out.println(str+"일");
			}
		}

	}

	public static void main(String[] args) 
	{
		AQ2 a = new AQ2();
		a.in();
		a.out();
	}
}
