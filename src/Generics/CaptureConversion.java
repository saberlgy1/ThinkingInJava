package Generics;



/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-05-17 15:57
 **/

class Bana{}

class Abab extends Bana{}

public class CaptureConversion {
    static <T> void f1(Holder<T> holder){
        T t = holder.getItem();
        System.out.println(t.getClass().getSimpleName());
    }

    static <T> void f2(Holder<Abab> holder){
        Abab t = holder.getItem();
        System.out.println(t.getClass().getSimpleName());
        f1(holder);
    }

    public static void main(String[] args) {
        Holder raw = new Holder<Integer>(1);
        f1(raw);
        f2(raw);
        Holder rawBasic = new Holder();
        rawBasic.setItem(new Bana());
        f2(rawBasic);
        Holder<Abab> wildHolder = new Holder<Abab>();
        f2(wildHolder);

    }



}
