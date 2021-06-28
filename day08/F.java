import java.util.*;

class F 
{
	Vector<Integer> v1 = new Vector<Integer>();
	Vector<Integer> v2 = new Vector<Integer>();
	Vector<Vector> v = new Vector<Vector>();
   
    void in(){
		v1.add(1); v1.add(2); v1.add(3);
		v2.add(40); v2.add(50);

		v.add(v1); v.add(v2);
	}
	void out1(){ //(1) 고전적
		for(int i=0; i<v.size(); i++){
			Vector<Integer> vec = v.get(i);
			for(int j=0; j<vec.size(); j++){
				int val = vec.get(j);
				System.out.println("val: " + val);
			}
		}
	}
	void out2(){ //(2) 진보된 
		for(Vector<Integer> vec : v){
			for(int i : vec){
				System.out.println("i: " + i);
			}
		}
	}
	public static void main(String[] args) 
	{
		F f = new F();
		f.in();
		f.out1();
		//f.out2();
	}
}
