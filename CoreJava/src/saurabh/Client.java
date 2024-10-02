package saurabh;

public class Client {
	public static void main(String[] args)throws Exception
	{
		
		AccountCreation tc = AccountCreation.getInstance();
		AccountCreation tc1 = AccountCreation.getInstance();
		
		tc.create(123456);
		tc1.create(1234556);
		int price = -120;
		
		if(price < 0) 
			throw new MyOwnExceptionClass(price);
			else
				System.out.println("price is:" + price);
		
		
		
	}

}
