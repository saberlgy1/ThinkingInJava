package Generics;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-05-07 09:27
 **/


class Box{

}
public class SimpleHolder {
    private Object obj;

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public static void main(String[] args) {
        Box box = new Box();
        SimpleHolder simpleHolder = new SimpleHolder();
        simpleHolder.setObj(box);
        System.out.println(simpleHolder.getObj());
    }

}
