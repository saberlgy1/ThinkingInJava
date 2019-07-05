package Generics.Ex30;

import Generics.Holder;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-07-05 17:01
 **/

public class Holders30 {
    public static void main(String[] args) {
        Holder<Character> charHolder = new Holder<Character>();
        Holder<Byte> byteHolder = new Holder<Byte>();
        Holder<Short> shortHolder = new Holder<Short>();
        Holder<Integer> intHolder = new Holder<Integer>();
        Holder<Long> longHolder = new Holder<Long>();
        Holder<Float> floatHolder = new Holder<Float>();
        Holder<Double> doubleHolder = new Holder<Double>();
        // Autoboxing and autounboxing work:
        charHolder.setItem('a');
        System.out.println(charHolder.getItem() + ", ");
        System.out.println(charHolder.getItem().getClass());
        char c = charHolder.getItem();
        System.out.println("char c = charHolder.getItem() = " + c);
        byte b = 1;
        byteHolder.setItem(b);
        System.out.println(byteHolder.getItem() + ", ");
        System.out.println(byteHolder.getItem().getClass());
        byte bb = byteHolder.getItem();
        System.out.println("byte bb = byteHolder.getItem() = " + bb);
        short s = 1;
        shortHolder.setItem(s);
        System.out.println(shortHolder.getItem() + ", ");
        System.out.println(shortHolder.getItem().getClass());
        short ss = shortHolder.getItem();
        System.out.println("short ss = shortHolder.getItem() = " + ss);
        intHolder.setItem(1);
        System.out.println(intHolder.getItem() + ". ");
        System.out.println(intHolder.getItem().getClass());
        int i = intHolder.getItem();
        System.out.println("int i = intHolder.getItem() = " + i);
        long l = 2;
        longHolder.setItem(l);
        System.out.println(longHolder.getItem() + ", ");
        System.out.println(longHolder.getItem().getClass());
        long ll = longHolder.getItem();
        System.out.println("long ll = longHolder.getItem() = " + ll);
        float f = 1f;
        floatHolder.setItem(f);
        System.out.println(floatHolder.getItem() + ", ");
        System.out.println(floatHolder.getItem().getClass());
        float ff = floatHolder.getItem();
        System.out.println("float ff = floatHolder.getItem() = " + ff);
        double d = 1.1;
        doubleHolder.setItem(d);
        System.out.println(doubleHolder.getItem() + ", ");
        System.out.println(doubleHolder.getItem().getClass());
        double dd = doubleHolder.getItem();
        System.out.println("double dd = doubleHolder.getItem() = " + dd);
    }

}