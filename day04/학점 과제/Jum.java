import java.io.*;

class Subj{
	String name = "厩嬢";

	Subj(){}
	Subj(String name){
		this.name = name;
	}
}
class Jum{	
	Subj s1,s2,s3,s4,s5;
	int kor,eng,mat,soc,sci;

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    void in_1(){
		s1 = new Subj();

		System.out.print(s1.name+" 繊呪研 脊径馬獣神 : ");
		try{
			String jumsu = br.readLine();
			kor = Integer.parseInt(jumsu);
			//System.out.println("脊径吉 繊呪: " + i);
		}catch(IOException ie){
		}catch(NumberFormatException ne){
			System.out.println("収切亜 焼艦摂焼推 ばば");
			in_1();
		}
	}
	
	void in_2(){
		s2 = new Subj("慎嬢");

		System.out.print(s2.name+" 繊呪研 脊径馬獣神 : ");
		try{
			String jumsu = br.readLine();
			eng = Integer.parseInt(jumsu);
			//System.out.println("脊径吉 繊呪: " + i);
		}catch(IOException ie){
		}catch(NumberFormatException ne){
			System.out.println("収切亜 焼艦摂焼推 ばば");
			in_2();
		}
	}
	void in_3(){
		s3 = new Subj("呪俳");

		System.out.print(s3.name+" 繊呪研 脊径馬獣神 : ");
		try{
			String jumsu = br.readLine();
			mat = Integer.parseInt(jumsu);
			//System.out.println("脊径吉 繊呪: " + i);
		}catch(IOException ie){
		}catch(NumberFormatException ne){
			System.out.println("収切亜 焼艦摂焼推 ばば");
			in_3();
		}
	}

	void in_4(){
		s4 = new Subj("紫噺");

		System.out.print(s4.name+" 繊呪研 脊径馬獣神 : ");
		try{
			String jumsu = br.readLine();
			soc = Integer.parseInt(jumsu);
			//System.out.println("脊径吉 繊呪: " + i);
		}catch(IOException ie){
		}catch(NumberFormatException ne){
			System.out.println("収切亜 焼艦摂焼推 ばば");
			in_4();
		}
	}
	void in_5(){
		s5 = new Subj("引俳");

		System.out.print(s5.name+" 繊呪研 脊径馬獣神 : ");
		try{
			String jumsu = br.readLine();
			sci = Integer.parseInt(jumsu);
			//System.out.println("脊径吉 繊呪: " + i);
		}catch(IOException ie){
		}catch(NumberFormatException ne){
			System.out.println("収切亜 焼艦摂焼推 ばば");
			in_5();
		}
	}
}
