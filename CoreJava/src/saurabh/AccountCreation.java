package saurabh;

public class AccountCreation {
	
	private static AccountCreation instance;
	
	private  AccountCreation()
	{
		
	}
	
	public synchronized static AccountCreation	getInstance() {
		
		if (instance==null)
		{
			instance = new AccountCreation();
			System.out.println("Account class object is created...!!");
		}
		else {
			System.out.println("AccountCreation class object not Created just returned created one...!");
		}
		return instance;
	}
	
	public void create(int no) {
		System.out.println("Account Created Successfully,with number:" +no);
	}

}
