package singleton;

public class Driver {

	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		singleton.doSomething();
		SynchronizedSingleton singleton1 = SynchronizedSingleton.getInstance();
		singleton1.doSomething();


	}

}
