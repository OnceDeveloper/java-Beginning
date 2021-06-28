package aa.bb;

public abstract interface B1{
	//jdk7이하
	public static final int i = 7;
	public abstract void m1();

	//jdk8이상
	public static void m2(){
		System.out.println("B의 m2()");
	}
	public default void m3(){
		System.out.println("B의 m3()");
	}
}
