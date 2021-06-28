class Account
{
	private String ssn = "200501-1234567";
    private long balance = 10000L;

    String getSsn(){
        return ssn;
	}
	/*void setSsn(String ssn){
		this.ssn = ssn;
	}*/
	long getBalance(){
		return balance;
	}
	void setBalance(long balance){
		this.balance = balance;
	}
}
class D 
{
	public static void main(String[] args) 
	{
		Account acc = new Account();

		System.out.println("(1)ssn: " + acc.getSsn());
		//acc.setSsn("123456-1234567"); //ºÒ°¡!!
		System.out.println("(2)ssn: " + acc.getSsn());

		System.out.println("(1)balance: " + acc.getBalance());
		acc.setBalance(20000L);
		System.out.println("(2)balance: " + acc.getBalance());
	}
}
