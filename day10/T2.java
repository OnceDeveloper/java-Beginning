//Q: this로 또 생성자를 호출했을 때 생성되는 객체의 갯수 == 1개 
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
