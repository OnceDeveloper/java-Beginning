import java.util.*;
//int�� float�� String�� ���� ����ϱ�
class AQ3 {

	Vector<Object> vec = new Vector<Object>();

	void in(){
		vec.add(1);
		vec.add(new Float (2.2f));
		vec.add(3);
		vec.add("�ȳ�");
		vec.add("�ϼ���");
		vec.add("�ȳ�");
	}

	void out(){
		int size = vec.size();
		for(int i=0; i<size; i++){
			Object obj = vec.get(i);
			if(obj instanceof Integer){
				Integer iobj = (Integer)obj;
				int j = iobj.intValue();
				System.out.println(j+1);
			}else if(obj instanceof Float){
				Float fobj = (Float)obj;
				float f = fobj.floatValue();
				System.out.println(f+1);
			}else{
				String str = (String)obj;
				System.out.println(str);
			}
		}
	}

	public static void main(String[] args) 
	{
		AQ3 a = new AQ3();
		a.in();
		a.out();
	}
}
