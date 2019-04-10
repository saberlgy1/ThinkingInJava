package CharpeterSevenBefore;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-02-22 14:31
 **/

class StringNull {


    void f(float x){
        System.out.println("float");
    }
    void f(long x){
        System.out.println("long");
    }
    void f(double x){
        System.out.println("double");
    }

}

public class Test{
    public static void main(String[] args) {
        StringNull stringNull = new StringNull();
        char x = 'a';
        stringNull.f(x);

    }
}
