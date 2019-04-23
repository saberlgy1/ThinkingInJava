package charpterSeven;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-03-11 15:39
 **/


class Art{
    Art(){
        System.out.println("art");
    }
}

class Drawing extends Art{
    Drawing(){
        System.out.println("drawing");
    }
}


public class Cartoon extends Drawing {
    Cartoon(){
        System.out.println("cartoon");
    }

    public static void main(String[] args) {
        Cartoon cartoon = new Cartoon();
        Drawing drawing = new Drawing();
    }
}
