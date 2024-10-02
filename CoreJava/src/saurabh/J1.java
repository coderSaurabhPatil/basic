package saurabh;

//How To Convert ArrayList to String Array In Java
import java.util.ArrayList;
import java.util.List;

public class J1 {
	public static void main(String args[]) {
		
		List al = new ArrayList<String>();
		
		al.add("one");
		al.add("two");
		al.add("Three");
		
		String[] stringArrayObject = new String[al.size()];
		al.toArray(stringArrayObject);
		
		for(String temp : stringArrayObject)
			System.out.println(temp);
	}

}
