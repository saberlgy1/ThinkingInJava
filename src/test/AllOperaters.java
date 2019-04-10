package test;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-02-21 13:24
 **/

public class AllOperaters {

    public static void main(String[] args) {

        int a = 0;
        for (int i = 1; i < 1000; i++){
            for (int j = 1; j < i ; j++){
                if (i % j == 0 && j != 1){
                    a = 0;
                    break;
                }else {
                    a = i;
                }
            }
            if (a != 0)
                System.out.println(a);

        }
    }

}

