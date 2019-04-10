import charpeterEight.Shape;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-03-14 16:51
 **/


class A{
    private String s;
    A(String s){
        System.out.println(s);
    }
}

class B{
    private  A a = new A("im");
    B(){
        System.out.println("B()");
    }
}

public class Test extends B {


    public static void main(String[] args) {
        Test test = new Test();
    }



}
