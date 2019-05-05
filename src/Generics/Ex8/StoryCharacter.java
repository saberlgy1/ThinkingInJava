package Generics.Ex8;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-05-01 14:41
 **/

public class StoryCharacter {
    private static long counter = 0;
  	private final long id = counter++;
  	public String toString() {
  	    return getClass().getSimpleName() + " " + id;
  	}

}
