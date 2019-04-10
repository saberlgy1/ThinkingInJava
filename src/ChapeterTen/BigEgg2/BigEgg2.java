package ChapeterTen.BigEgg2;

import ChapeterTen.BigEgg.BigEgg;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-03-21 15:54
 **/

class Egg2{
    protected class Yolk {
        public Yolk(){
            System.out.println("Egg2.Yolk()");
        }
        public void f(){
            System.out.println("Egg2.Yolk.f()");
        }
    }
    protected class Test {
        public Test(){
            System.out.println("test");
        }
    }
    private Test test = new Test();
    private Yolk y = new Yolk();
    public Egg2(){
        System.out.println("new Egg2()");
    }
    public void insertYolk(Yolk yy){
        this.y = yy;
    }
    public void g(){
        this.y.f();
    }
}


public class BigEgg2 extends Egg2  {

    public class Yolk extends Egg2.Yolk {
        public Yolk(){
            System.out.println("BigEgg2.Yolk()");
        }
        public void f(){
            System.out.println("BigEgg2.Yolk.f()");
        }
    }

    public BigEgg2(){
        insertYolk(new Yolk());
    }

    public static void main(String[] args) {
        Egg2 egg2 = new BigEgg2();
        egg2.g();
    }

}
