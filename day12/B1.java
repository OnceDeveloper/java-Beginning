package aa.bb;

public abstract interface B1{
	//jdk7����
	public static final int i = 7;
	public abstract void m1();

	//jdk8�̻�
	public static void m2(){
		System.out.println("B�� m2()");
	}
	public default void m3(){
		System.out.println("B�� m3()");
	}
}
