package Generics.Ex20;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-05-06 16:01
 **/

interface A{
    public void f();
    public void g();
}

class B implements A{

    @Override
    public void f() {
        System.out.println("b.f");
    }

    @Override
    public void g() {
        System.out.println("b.g");
    }

    public void h(){
        System.out.println("b.h");
    }
}
class G {
    public static <T extends A> void j(T x) {
        x.f();
        x.g();
    }
}
public class Ex20 {

    public static void main(String[] args) {
        B a3 = new B();
        G.j(a3);
    }


}
