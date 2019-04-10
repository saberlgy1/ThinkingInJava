package charpeterEight;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-03-13 17:19
 **/

public class Shape {

    private int wheels = 1;

    public void ride(){
        System.out.println(this.wheels);
        draw();
    }

    public void draw(){
        System.out.println("draw a shape");
    }
}
