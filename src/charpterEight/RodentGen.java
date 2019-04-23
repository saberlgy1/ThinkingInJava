package charpterEight;

import java.util.Random;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-03-14 15:37
 **/

public class RodentGen {

    // same shared object to be passed to every Rodent:
	protected Shared shared = new Shared();
	private Random rand = new Random();
	public Rodent next() {
		switch(rand.nextInt(3)) {
			default:
			case 0: return new Mouse(shared);
			case 1: return new Rat(shared);
			case 2: return new Squirrel(shared);
		}
	}


}
