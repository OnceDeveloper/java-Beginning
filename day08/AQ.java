import java.util.*;

class AQ 
{
	ArrayList<Object> list = new ArrayList<Object>(); //��� Ÿ���� ���� 

    void in(){
		list.add("��"); //String -> Object 
		//Integer iObj = 10; //Auto Boxing 
		list.add(10); //int -> Integer -> Object
		list.add("�ʰ���"); 
		list.add("����");
		list.add("����");
		list.add("�ܿ�");
	}
	void out(){
		int size = list.size();
		for(int i=0; i<size; i++){
			
			Object obj = list.get(i);
			if(obj instanceof Integer){
                Integer iObj = (Integer)obj;
				int j = iObj;
				System.out.println(j + 1);
            }else{
				String str = (String)obj;
				System.out.println(str);
			}
			//String str = list.get(i);
		}
	}
	public static void main(String[] args) 
	{
		AQ a = new AQ();
		a.in();
		a.out();
	}
}
