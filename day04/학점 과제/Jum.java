import java.io.*;

class Subj{
	String name = "����";

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

		System.out.print(s1.name+" ������ �Է��Ͻÿ� : ");
		try{
			String jumsu = br.readLine();
			kor = Integer.parseInt(jumsu);
			//System.out.println("�Էµ� ����: " + i);
		}catch(IOException ie){
		}catch(NumberFormatException ne){
			System.out.println("���ڰ� �ƴ��ݾƿ� �Ф�");
			in_1();
		}
	}
	
	void in_2(){
		s2 = new Subj("����");

		System.out.print(s2.name+" ������ �Է��Ͻÿ� : ");
		try{
			String jumsu = br.readLine();
			eng = Integer.parseInt(jumsu);
			//System.out.println("�Էµ� ����: " + i);
		}catch(IOException ie){
		}catch(NumberFormatException ne){
			System.out.println("���ڰ� �ƴ��ݾƿ� �Ф�");
			in_2();
		}
	}
	void in_3(){
		s3 = new Subj("����");

		System.out.print(s3.name+" ������ �Է��Ͻÿ� : ");
		try{
			String jumsu = br.readLine();
			mat = Integer.parseInt(jumsu);
			//System.out.println("�Էµ� ����: " + i);
		}catch(IOException ie){
		}catch(NumberFormatException ne){
			System.out.println("���ڰ� �ƴ��ݾƿ� �Ф�");
			in_3();
		}
	}

	void in_4(){
		s4 = new Subj("��ȸ");

		System.out.print(s4.name+" ������ �Է��Ͻÿ� : ");
		try{
			String jumsu = br.readLine();
			soc = Integer.parseInt(jumsu);
			//System.out.println("�Էµ� ����: " + i);
		}catch(IOException ie){
		}catch(NumberFormatException ne){
			System.out.println("���ڰ� �ƴ��ݾƿ� �Ф�");
			in_4();
		}
	}
	void in_5(){
		s5 = new Subj("����");

		System.out.print(s5.name+" ������ �Է��Ͻÿ� : ");
		try{
			String jumsu = br.readLine();
			sci = Integer.parseInt(jumsu);
			//System.out.println("�Էµ� ����: " + i);
		}catch(IOException ie){
		}catch(NumberFormatException ne){
			System.out.println("���ڰ� �ƴ��ݾƿ� �Ф�");
			in_5();
		}
	}
}
