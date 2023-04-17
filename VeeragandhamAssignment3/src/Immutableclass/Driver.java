package Immutableclass;

public class Driver {
	 public static void main(String[] args)
	 {
		 ImmutableClass obj = new ImmutableClass(1, "John");
		 ImmutableClass obj1=new ImmutableClass(2,"john");
		 System.out.println("ID: " + obj1.getId());
		 System.out.println("Name: " + obj1.getName());
	 }

}
