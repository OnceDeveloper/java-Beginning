class T4 {
	String ¾Ó²¿;
    int °¡°Ý;
	/*T4(){
		¾Ó²¿ = "°í±¸¸¶";
		°¡°Ý = 1000;
	}*/
	T4(String ¾Ó²¿, int °¡°Ý){
		this.¾Ó²¿ = ¾Ó²¿;
		this.°¡°Ý = °¡°Ý;
	}

	public static void main(String[] args) 
	{
		T4 t = new T4("°­Á¦¾Ó²¿", 1200);
		System.out.println("¾Ó²¿: " + t.¾Ó²¿);
		System.out.println("°¡°Ý: " + t.°¡°Ý);
	}
}
