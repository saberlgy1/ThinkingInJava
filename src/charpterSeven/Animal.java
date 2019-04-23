package charpterSeven;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-03-12 08:57
 **/

class Dog{
    void bark(int x){
        System.out.println("waa" + x);
    }


    void bark(String x){
        System.out.println("waa" + x);
    }


    void bark(char x){
        System.out.println("waa" + x);
    }
}

class Cat extends Dog{
    void bark(float x){
        System.out.println("miao" + x);
    }
}


public class Animal {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.bark(1f);
        cat.bark(1);
        cat.bark('a');
        cat.bark("s");
    }

}
