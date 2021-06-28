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
			System.out.println("예외 발생함 " + e.toString());
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
			System.out.println("내년에는 " + (i+1) + "살이 되네요");
		}catch(NumberFormatException ne){  //RuntimeException 
			System.out.println("숫자 형태가 아닌 문자열이네.. 숫자의 나이를 입력해주세요");
			m2();
		}
	}
	void m22(){
		String ageStr = "";
		System.out.print("#Your age : ");
		try{
			ageStr = br.readLine();
			int i =  Integer.parseInt(ageStr);
			System.out.println("내년에는 " + (i+1) + "살이 되네요");
		}catch(IOException ie){
		}catch(NumberFormatException ne){  //RuntimeException 
			System.out.println("숫자 형태가 아닌 문자열이네.. 숫자의 나이를 입력해주세요");
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
