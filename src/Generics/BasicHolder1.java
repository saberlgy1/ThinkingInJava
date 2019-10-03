package Generics;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-07-25 16:47
 **/

public class BasicHolder1<T> {
    T e;

    public T getE() {
        return e;
    }


    public void setE(T e) {
        this.e = e;
    }

    void f(){
        System.out.println(e.getClass().getSimpleName());
    }
}

