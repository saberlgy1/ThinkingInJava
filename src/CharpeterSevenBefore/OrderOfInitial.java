package CharpeterSevenBefore;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-02-26 13:12
 **/

class Window{
    Window(int x){
        System.out.println("window" + x);
    }
}

class House{
    Window w1 = new Window(1);
    House(){
        System.out.println("house");
        w3 = new Window(33);
    }
    Window w2 = new Window(2);
    void f(){
        System.out.println("f()");
    }
    Window w3 = new Window(3);
}



public class OrderOfInitial {
    public static void main(String[] args) {
        House h = new House();
        h.f();

    }
}
