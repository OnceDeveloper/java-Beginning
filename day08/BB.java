import java.util.*;

//Generic ���� 
class BB 
{
	TreeSet<String> set=new TreeSet<String>();
    void in(){
		set.add("��");
		set.add("����");
		set.add("����");
		set.add("�ܿ�");
	}
	void out(){
		String item = "";
		Iterator<String> iter = set.iterator();
		//Iterator iter = set.descendingIterator();
		while(iter.hasNext()){
			item = iter.next();
			System.out.println("item: " + item);
		}
	}
	public static void main(String[] args) 
	{
		BB b = new BB();
		b.in();
		b.out();
	}
}
