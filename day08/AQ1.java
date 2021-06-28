import java.util.*;

class AQ1 {

	Vector<Object> vec = new Vector<Object>();

	void in(){
		vec.add("�ϳ�");
		vec.add(new Integer(2));
		vec.add(3);//������ �� : new Integer(3); ->AutoBoxing
		vec.add("��");
		vec.add("�ټ�");
		
	}

	void out(){
		int size = vec.size();
		for(int i=0; i<size; i++){
			Object obj = vec.get(i);//������ get�� �����ִ°� ��� ������! 
			if(obj instanceof Integer){//obj�� �����ִ� String�� Integer�߿� Integer�� ��ü�ΰ�?->true�϶��� ���� �ִ´�.
									   //��, obj�� Integer���� ��쿡�� ���� �ִ� ���ǽ�
				Integer iobj = (Integer)obj;//iobj�� Integer���� obj�� �ִµ� obj�� Integer���� ũ�⶧���� ��������ȯ������
				int j = iobj.intValue();//���� ��ڽ�          ///Auto unboxing -> int j = iobj;
				System.out.println(j+1);//int���̶� ��������� ��������
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
