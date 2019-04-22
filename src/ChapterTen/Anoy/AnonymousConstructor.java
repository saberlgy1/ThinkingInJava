package ChapterTen.Anoy;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-03-20 09:04
 **/


abstract class Base{
    public Base(int i ){
        System.out.println("Base constructor: " + i);
    }
    public abstract void f();
}


public class AnonymousConstructor {

    public static Base getBase(int i){
        return new Base(i){

            {
                System.out.println("inside initializer instance");
            }

            @Override
            public void f() {
                System.out.println("In Anonymous f()");
            }
        };
    }


    public static void main(String[] args) {
        Base base = getBase(47);
        base.f();
    }


}
