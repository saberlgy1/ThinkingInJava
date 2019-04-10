package CharpeterSevenBefore;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-02-22 15:54
 **/

public class Teddy {

    void bark(String s){
        System.out.println("bark string");
    }

    void bark(int i){
        System.out.println("bowling int");
    }

    public static void main(String[] args) {
        Teddy teddy = new Teddy();
        Teddy teddy1 = new Teddy();

        teddy.bark(1);
        teddy1.bark("1");
    }

}
