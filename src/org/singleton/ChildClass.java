package org.singleton;

public class ChildClass  {
	
	
	public static void main(String[] args) {
		
		Singleton instance = Singleton.getInstance();
		System.out.println(instance.b);
		Singleton instance2 = Singleton.getInstance();
		System.out.println(instance2);
		System.out.println(instance);
		
	}

}
