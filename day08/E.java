class E 
{
	String strs[] = {"��", "����", "����", "�ܿ�", "null"};

	void out1(){ //(1) �������� for
		for(int i=0; i<strs.length; i++){
			System.out.println("1) strs["+i+"]: " + strs[i]);
		}
	}
	void out2(){ //(2) Enhanced Loop
		for(String str : strs){
			System.out.println(str);
		}
	}
	void out3(){ //(3) index with Enhanced Loop
		int i = 0; 
		for(String str : strs){
			System.out.println("2) strs["+ i++ +"]: " + str);
		}
	}
	
	public static void main(String[] args) 
	{
		E e = new E();
		//e.out1();
		//e.out2();
		e.out3();
	}
}
