package CharpterSevenBefore;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-02-26 16:55
 **/

public class VarageType {
    static void f(Character... args){
        System.out.println(args.getClass() + " length " + args.length);
    }
    static void g(int...args){
        System.out.println(args.getClass() + " length " + args.length);
    }

    public static void main(String[] args) {
        f('a');
        f();
        g(1);
        g();
        System.out.println("int[] " + new int[0].getClass());
    }
}
