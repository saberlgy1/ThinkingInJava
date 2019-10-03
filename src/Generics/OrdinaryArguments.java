package Generics;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-07-26 17:20
 **/


class OrdinarySetter {
    void set(Base base){
        System.out.println("OrdinarySetter.set(Base)");
    }
}


class DerivedSetter extends OrdinarySetter{
    void set(Derived1 derived1) {
        System.out.println("DerivedSetter.set(Derived)");
    }
}

public class OrdinaryArguments {

    public static void main(String[] args) {
        Base base = new Base();
        Derived1 derived1 = new Derived1();
        DerivedSetter ds = new DerivedSetter();
        ds.set(derived1);
        ds.set(base);
    }

}
