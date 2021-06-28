import java.util.*;

class BBB1{

	TreeSet<Float> ts = new TreeSet<Float>();

	void in(){
		ts.add(new Float(1.1f));
		ts.add(2.3f);//Auto Boxing(float -> Float)
		ts.add(3.3f);
		ts.add(4.3f);
	}

	void out(){
		Iterator<Float> iter = ts.iterator();
		while(iter.hasNext()){
			Float item = iter.next();
			float f = item.floatValue();
			//float f = iter.next(); Unboxing

			System.out.println(f+1);
		}

	}

	public static void main(String[] args) 
	{
		BBB1 b = new BBB1();
		b.in();
		b.out();
	}
}
