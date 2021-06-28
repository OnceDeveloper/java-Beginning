import java.util.*;

//Generic Àû¿ë + Boxing + Enhanced Loop
class BBBB 
{
	TreeSet<Float> set=new TreeSet<Float>();
    void in(){
		set.add(new Float(10.12f)); 
		set.add(20.12f); //AutoBoxing ( float -> Float ) 
		set.add(30.12f);
		set.add(40.12f);
	}
	void out(){
		for(float f : set) System.out.println("f: " + f);
	}
	public static void main(String[] args) 
	{
		BBBB b = new BBBB();
		b.in();
		b.out();
	}
}

