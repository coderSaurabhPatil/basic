package saurabh;

public class Static_class {
	
	static int outerStaticVar = 10;
	int outerInstanceVar = 20;
	
	//Static nested class
	
	static class NestedStaticClass {
		public void display () {
			System.out.println("Static outer variable:" + outerStaticVar);
			
			//cannot access intance variable directly
            //System.out.println("Instance outer variable: " + outerInstanceVar);
		}
	}
	
	public static void main(String[] args) {
        // Creating object of static nested class
        Static_class.NestedStaticClass nestedObj = new Static_class.NestedStaticClass();
        nestedObj.display();
    }

}


	

