package CharpterSevenBefore;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-02-21 17:17
 **/

public class Switch {
    public static void main(String[] args) {
        for(int i = 0; i < 11; i++) {
            switch(i) {
                case 0: System.out.println("zero"); 
                case 1: System.out.println("isa");  
                case 2: System.out.println("dalawa"); 
                case 3: System.out.println("tatlo"); 
                case 4: System.out.println("apat"); 
                case 5: System.out.println("lima"); 
                case 6: System.out.println("anim"); 
                case 7: System.out.println("pito"); 
                case 8: System.out.println("walo"); 
                case 9: System.out.println("siyam"); 
                default: System.out.println("default");
            }
        }
    }
}
