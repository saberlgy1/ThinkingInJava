package ChapterFourteen;

import java.lang.reflect.InvocationTargetException;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-04-23 15:57
 **/
interface HasBatteries {}
interface Waterproof {}
interface Shoots {}

class Toy {
    Toy() {
        System.out.println("Creating Toy() object");
    }
    Toy(int i) {
        System.out.println("Creating Toy(" + i + ") object");
    }
}

class FancyToy extends Toy
        implements HasBatteries, Waterproof, Shoots {
    FancyToy() { super(1); }
}
public class ToysTest {

    public static void main(String[] args) {
        try {
            Toy.class.getDeclaredConstructor(int.class).newInstance(1);
        }catch (NoSuchMethodException e){
            System.out.println("sss");
        }catch (InstantiationException e){
            System.out.println("aaa");
        }catch (IllegalAccessException e){
            System.out.println("bbb");
        }catch (InvocationTargetException e){
            System.out.println("ccc");
        }
    }


}
