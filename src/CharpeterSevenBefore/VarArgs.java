package CharpeterSevenBefore;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-02-26 16:37
 **/

class A{

}

public class VarArgs {
    static void printArray(Object... args){
        for (Object obj: args) System.out.println(obj + " ");
    }

    public static void main(String[] args) {
        printArray(new Integer(13),new Float(3.14),new Double(11.13));
        printArray(new A(),new A(),new A());
        printArray((Object[]) new Integer[]{1,2,3,4,5,6});
        printArray();
    }
}
