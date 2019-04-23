package charpterEight;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-03-13 17:21
 **/

public class Square extends Shape {


    private int wheels = 2;

    public void ride(){
        System.out.println(this.wheels);
    }

    public void draw(){
        System.out.println("draw a Square");
    }

    public void erase(){
        System.out.println("erase a Square");
    }


}
