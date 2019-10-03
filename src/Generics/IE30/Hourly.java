package Generics.IE30;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-07-05 17:07
 **/

interface Pay<T>{
    String getA();
}

class Emp implements Pay{
    @Override
    public String getA() {
        return "1";
    }
}

class Hour extends Emp{
    @Override
    public String getA() {
        return "2";
    }
}
public class Hourly extends Emp {
    public static void main(String[] args) {
        Hour hour = new Hour();
        Emp emp = new Emp();
        System.out.println(emp.getA());
    }
}
