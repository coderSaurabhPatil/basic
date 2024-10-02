package saurabh;

public class Test {
    public static void main(String[] args) {
        Static obj1 = new Static();
        Static obj2 = new Static();

        obj1.var = 5;  // Instance variable, separate for obj1
        obj2.var = 10; // Instance variable, separate for obj2

        Static.var2 = 20; // Static variable, shared between obj1 and obj2

        System.out.println("obj1.var: " + obj1.var); // 5
        System.out.println("obj2.var: " + obj2.var); // 10
        System.out.println("MyStatic.var2: " + Static.var2); // 20 (same for both)
    }
}