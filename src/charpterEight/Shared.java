package charpterEight;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-03-15 10:22
 **/

public class Shared {

    private int refcount = 0;
	private static long counter = 0;
	private final long id = counter++; 
	public Shared() { System.out.println("Creating " + this); }
	public void addRef() { refcount++; }
	public String toString() { return "Shared " + id; }
	public void showRefcount() { System.out.println("refcount = " + refcount); }
    
}
