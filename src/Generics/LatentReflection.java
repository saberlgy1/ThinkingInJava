package Generics;

import java.lang.reflect.Method;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-09-30 16:36
 **/


class Mime {

    public void walkAgainstTheWind() {
    }

    public void sit() {
        System.out.println("sitting");
    }

    public void pushInvisibleWalls() {
    }

    @Override
    public String toString() {
        return "Mime{}";
    }
}

class Dog {
    public void speek() {
        System.out.println("speak");
    }

}

class CommunicateReflectively {
    public static void perfornm(Object speaker) {

        Class<?> speak = speaker.getClass();
        try{
            try {
                Method method = speak.getMethod("speek");
               // speak.invoke(speaker);
            } catch (NoSuchMethodException e) {
                System.out.println("cannot speak");
            }
            try {
                Method method = speak.getMethod("sit");
                // speak.invoke(speaker);
            } catch (NoSuchMethodException e) {
                System.out.println("cannot sit");
            }

        }catch(Exception e){
            throw new RuntimeException(speaker.toString(),e);
        }
    }


}

public class LatentReflection {

    public static void main(String[] args) {
        CommunicateReflectively.perfornm(new Dog());
        CommunicateReflectively.perfornm(new Mime());
    }

}
