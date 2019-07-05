package Generics;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-05-16 10:03
 **/

public class Holder<T> {

    private T item;

    public Holder(T item) {
        this.item = item;
    }

    public Holder() {
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }



    public static void main(String[] args) {
        Holder<Apple> appleHolder = new Holder<>(new Apple());
        Apple d = appleHolder.getItem();
        appleHolder.setItem(d);
        Holder<? extends Fruit> fruit = appleHolder;
        d = (Apple)fruit.getItem();
        try {
            Orange c = (Orange)fruit.getItem();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
