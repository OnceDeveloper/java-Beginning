import java.io.*;

class A 
{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	void m1(){ 
		System.out.print("Your name : ");
		try{
			String name = br.readLine();
			System.out.println("Your name is  " + name);
		}catch(IOException e){ //CheckedException 
			System.out.println("���� �߻��� " + e.toString());
			m1();
		}
	}
	void m2(){
		String ageStr = "";
		System.out.print("Your age : ");
		try{
			ageStr = br.readLine();
		}catch(IOException ie){}

		try{
			int i =  Integer.parseInt(ageStr);
			System.out.println("���⿡�� " + (i+1) + "���� �ǳ׿�");
		}catch(NumberFormatException ne){  //RuntimeException 
			System.out.println("���� ���°� �ƴ� ���ڿ��̳�.. ������ ���̸� �Է����ּ���");
			m2();
		}
	}
	void m22(){
		String ageStr = "";
		System.out.print("#Your age : ");
		try{
			ageStr = br.readLine();
			int i =  Integer.parseInt(ageStr);
			System.out.println("���⿡�� " + (i+1) + "���� �ǳ׿�");
		}catch(IOException ie){
		}catch(NumberFormatException ne){  //RuntimeException 
			System.out.println("���� ���°� �ƴ� ���ڿ��̳�.. ������ ���̸� �Է����ּ���");
			m22();
		}
	}
	public static void main(String[] args) 
	{
		A a = new A();
		//a.m1();
		//a.m2();
		a.m22();
	}
}
