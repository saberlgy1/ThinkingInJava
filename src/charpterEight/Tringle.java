package charpterEight;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-03-13 17:22
 **/

public class Tringle extends Shape {



    private int wheels = 3;

    public void ride(){
        System.out.println(this.wheels);
    }

    public void draw(){
        System.out.println("draw a Tringle");
    }

    public void erase(){
        System.out.println("erase a Tringle");
    }

}
