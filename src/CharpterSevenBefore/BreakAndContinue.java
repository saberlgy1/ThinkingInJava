package CharpterSevenBefore;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-02-21 16:44
 **/

public class BreakAndContinue  {

    public static void main(String[] args) {
        int i = 0;
        outer:
        for (; true; i++){
            inner:
            for (; i < 10; i++){
                System.out.println("i = " + i);
                if (i == 2){
                    System.out.println("continue");
                    continue ;
                }
                if (i == 3){
                    System.out.println("break");
                    i++;
                    break;
                }
                if (i == 7){
                    System.out.println("continue outer");
                    continue outer;
                }
                if (i == 8){
                    System.out.println("break outer");
                    break outer;
                }
                for (int k = 0; k < 5; k++){
                    if (k == 3){
                        System.out.println("continue inner");
                        continue inner;
                    }
                }
            }
        }

    }

}
