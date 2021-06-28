import java.io.*;

class Subj{
	String name = "국어";

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

		System.out.print(s1.name+" 점수를 입력하시오 : ");
		try{
			String jumsu = br.readLine();
			kor = Integer.parseInt(jumsu);
			//System.out.println("입력된 점수: " + i);
		}catch(IOException ie){
		}catch(NumberFormatException ne){
			System.out.println("숫자가 아니잖아요 ㅠㅠ");
			in_1();
		}
	}
	
	void in_2(){
		s2 = new Subj("영어");

		System.out.print(s2.name+" 점수를 입력하시오 : ");
		try{
			String jumsu = br.readLine();
			eng = Integer.parseInt(jumsu);
			//System.out.println("입력된 점수: " + i);
		}catch(IOException ie){
		}catch(NumberFormatException ne){
			System.out.println("숫자가 아니잖아요 ㅠㅠ");
			in_2();
		}
	}
	void in_3(){
		s3 = new Subj("수학");

		System.out.print(s3.name+" 점수를 입력하시오 : ");
		try{
			String jumsu = br.readLine();
			mat = Integer.parseInt(jumsu);
			//System.out.println("입력된 점수: " + i);
		}catch(IOException ie){
		}catch(NumberFormatException ne){
			System.out.println("숫자가 아니잖아요 ㅠㅠ");
			in_3();
		}
	}

	void in_4(){
		s4 = new Subj("사회");

		System.out.print(s4.name+" 점수를 입력하시오 : ");
		try{
			String jumsu = br.readLine();
			soc = Integer.parseInt(jumsu);
			//System.out.println("입력된 점수: " + i);
		}catch(IOException ie){
		}catch(NumberFormatException ne){
			System.out.println("숫자가 아니잖아요 ㅠㅠ");
			in_4();
		}
	}
	void in_5(){
		s5 = new Subj("과학");

		System.out.print(s5.name+" 점수를 입력하시오 : ");
		try{
			String jumsu = br.readLine();
			sci = Integer.parseInt(jumsu);
			//System.out.println("입력된 점수: " + i);
		}catch(IOException ie){
		}catch(NumberFormatException ne){
			System.out.println("숫자가 아니잖아요 ㅠㅠ");
			in_5();
		}
	}
}
