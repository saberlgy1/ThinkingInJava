package Generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-05-16 09:11
 **/


class Fruit{}

class Apple extends Fruit{}

class Joth extends Apple{}

class Orange extends Fruit{}
public class ConvariantArrays {

    public static void main(String[] args) {
        Fruit[] fruits = new Apple[10];
        fruits[0] = new Apple();
        fruits[0] = new Joth();
        try {
            fruits[0] = new Fruit();
        }catch (Exception e){
            System.out.println(e);
        }
        try {
            fruits[0] = new Orange();
        }catch (Exception e){
            System.out.println(e);
        }

        List<? extends Fruit> fruits1 = new ArrayList<Apple>();
        //fruits1.add(new Apple());
        //fruits1.add(new Fruit());
        //fruits1.add(new Orange());

    }

}
