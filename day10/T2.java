//Q: this�� �� �����ڸ� ȣ������ �� �����Ǵ� ��ü�� ���� == 1�� 
class T2 extends Object 
{
	int i;
	T2(){
		//1
		this(10); //2
		//3
	}
	T2(int i){
	}

	public static void main(String[] args) 
	{
		T2 t = new T2();
	}
}
