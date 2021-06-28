import java.util.*;

//Generic Àû¿ë + Boxing 
class BBB 
{
	TreeSet<Float> set=new TreeSet<Float>();
    void in(){
		set.add(new Float(10.12f)); 
		set.add(20.12f); //AutoBoxing ( float -> Float ) 
		set.add(30.12f);
		set.add(40.12f);
	}
	void out(){
		Iterator<Float> iter = set.iterator();
		//Iterator iter = set.descendingIterator();
		while(iter.hasNext()){
			//Float item = iter.next();
			//float f = item.floatValue();

            float f = iter.next(); //UnBoxing( Float -> float )
			System.out.println("f: " + f);
		}
	}
	public static void main(String[] args) 
	{
		BBB b = new BBB();
		b.in();
		b.out();
	}
}

