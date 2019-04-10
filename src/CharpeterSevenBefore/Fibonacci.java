package CharpeterSevenBefore;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-02-21 17:19
 **/

public class Fibonacci {

    int fibonacci(int x){
       //if (x == 0) return 0;
       if (x < 2) return 1;
       else
           return fibonacci(x - 2) + fibonacci(x - 1);
    }

    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        //int k = Integer.parseInt(args[0]);
        System.out.println("First  CharpeterSevenBefore.Fibonacci number(s): ");
        for (int i = 0; i < 5; i++){
            System.out.println(f.fibonacci(i));
        }
    }

}
