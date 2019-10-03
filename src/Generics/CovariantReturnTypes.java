package Generics;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-07-26 17:10
 **/


class Base{}

class Derived1 extends Base{}

interface OrdinartyGetter{
    Base get();
}

interface DerivedGetter extends OrdinartyGetter{
    Derived1 get();
}


public class CovariantReturnTypes {

    void Test(DerivedGetter derivedGetter){
        Derived1 d = derivedGetter.get();
    }


}
