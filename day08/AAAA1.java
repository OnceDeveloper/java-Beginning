import java.util.*;

class AAAA1 {

	Vector<Integer> v = new Vector<Integer>();
	int ina[] = {0,1,2,3,4};
	int inb[] = {10,20,30,40,50};

	void in1(){//ina�� ���� inb�� �ٲ�� ���� ���� ����
		for(int i : ina) v.add(i);
	}

	void in2(){//ina[]�� ���� inb[]�� ������ �־���(for��)
		for(int i =0; i<ina.length; i++){
			ina[i]=inb[i];
		}
	}

	void in4(){
		for(int i=0; i < ina.length; i++){//v�� �ٲ� ina�� ���� �־���
			v.add(ina[i]);
		}
	}
	
	void out(){
		for(int i : v){//i�� v�� ��(�ٲ�� ���� ina�� + �ٲ� ina�� ��)�� �־���
			System.out.println(i+1);	
		}
	}

	public static void main(String[] args) 
	{
		AAAA1 a = new AAAA1();
		a.in1();
		a.in2();
		a.in4();
		a.out();
	}
}
