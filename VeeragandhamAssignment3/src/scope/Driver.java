package scope;

//Superclass
class Vehicle {
 private void privateMethod() {
     System.out.println("Private method in Vehicle");
 }

 void defaultMethod() {
     System.out.println("Default method in Vehicle");
 }

 protected void protectedMethod() {
     System.out.println("Protected method in Vehicle");
 }

 public void publicMethod() {
     System.out.println("Public method in Vehicle");
 }
}

//Subclass
class Car extends Vehicle {
 // This method is not overriding the privateMethod() in Vehicle, as private methods cannot be overridden
 private void privateMethod() {
     System.out.println("Private method in Car");
 }

 // Valid override: same (default) access level
 void defaultMethod() {
     System.out.println("Default method in Car");
 }

 // Valid override: same (protected) access level
 protected void protectedMethod() {
     System.out.println("Protected method in Car");
 }

 // Valid override: same (public) access level
 public void publicMethod() {
     System.out.println("Public method in Car");
 }
}
public class Driver {

	public static void main(String[] args) {
		
		
		//here we can see that we cannot access private methods
		Car obj1=new Car();
		obj1.protectedMethod();
		Vehicle obj2=new Vehicle();
		obj2.protectedMethod();
		

	}

}
