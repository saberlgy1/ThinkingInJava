package Generics;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-07-08 09:44
 **/


class Fixed<T>{
    private int x = 0;
    private Object[] storage;

    public Fixed(int size) {
        storage = new Object[size];
    }

    public void push(T item){
        storage[x++] = item;
    }
    public T pop(){
        return (T)storage[--x];
    }
}

public class GenericCast {
    public static void main(String[] args) {
        Fixed<String> stringFixed = new Fixed<>(10);
        for (String s : "A B C D E F G H I J".split(" "))
            stringFixed.push(s);
        for (int i = 0; i < 10; i++){
            String s = stringFixed.pop();
            System.out.println(s);
        }
    }


}
