package CharpterSevenBefore;

/**
 * @program: ThinkingInJava
 * @description:静态数据初始化
 * @author: lgy
 * @create: 2019-02-26 13:47
 **/

class Bowl{
    Bowl(int marker){
        System.out.println("CharpterSevenBefore.Bowl(" + marker + ")");
    }

    void f1(int marker){
        System.out.println("f1(" + marker + ")");
    }
}


class Table {
    Bowl bowl6 = new Bowl(6);
    static Bowl bowl = new Bowl(1);
    Table(){
        System.out.println("table()");
        bowl2.f1(1);
    }
    void f2 (int marker){
        System.out.println("f2(" + ")");
    }
    static Bowl bowl2 = new Bowl(2);
}

class Cupboard {
    Bowl bowl3 = new Bowl(3);
    static Bowl bowl4 = new Bowl(4);
    Cupboard(){
        System.out.println("CharpterSevenBefore.Cupboard");
        bowl4.f1(2);
    }
    void f3(int marker){
        System.out.println("f3(" + marker + ")");
    }
    static Bowl bowl5 = new Bowl(5);
}



public class StaticInitialization {

    public static void main(String[] args) {
        System.out.println("start in main ");
        new Cupboard();
        System.out.println("start in main");
        new Cupboard();
        table.f2(1);
        cupboard.f3(1);
    }
    static Table table = new Table();
    static Cupboard cupboard = new Cupboard();

}
