package Generics;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-07-18 19:42
 **/




class Subtype extends BasicHolder1<Subtype>{

}
public class CRG
{
    public static void main(String[] args) {
        Subtype t1 = new Subtype(), t2 = new Subtype();
        t1.setE(t2);
        Subtype t3 = t1.getE();
        t1.f();
        t3.setE(t3);
        t3.f();

    }


}
