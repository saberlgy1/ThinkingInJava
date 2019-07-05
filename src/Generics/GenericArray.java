package Generics;

import java.lang.reflect.Array;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-05-15 15:41
 **/

public class GenericArray<T> {
    private T[] array;

    public GenericArray(Class<T> type, int size) {
        array = (T[]) Array.newInstance(type, size);
    }

    public void put(int index, T item){
        array[index] = item;
    }

    public T[] rep(){
        return array;
    }

    public static void main(String[] args) {
        GenericArray<Integer>  gai = new GenericArray<>(Integer.class,10);
        Integer[] ia = gai.rep();
        //Object[] io = gai.rep();
    }
}
