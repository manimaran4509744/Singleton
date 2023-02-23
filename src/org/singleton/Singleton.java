package org.singleton;

public class Singleton {
	private static Singleton a;
	public String b = "akash";
	private Singleton(String s) {
		System.out.println(s);
		
	
	}
	public static Singleton getInstance() {
		if(a==null) {
			a=new Singleton("S");
		}
		return a;
		
	}

	public static void main(String[] args) {
		Singleton a = getInstance();
		Singleton b = getInstance();
		
		System.out.println(System.identityHashCode(b));
		System.out.println(System.identityHashCode(a));
	}

}
