package saurabh;

//How to Remove Unwanted Characters From String in Java

public class j2 {
	
	public static void main(String[] args)
	{
		String s = "(123)-456-789";
		s = s.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(s);
	}

}
