package Generics.Ex1;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-04-24 16:46
 **/

class Robot {
    private String name;
    public Robot(String name) { this.name = name; }
    public String toString() {
        return name;
    }
}

public class Ex1<T> {
    private T x, y, z;

    public Ex1(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public T getY() {
        return y;
    }

    public void setY(T y) {
        this.y = y;
    }

    public T getZ() {
        return z;
    }

    public void setZ(T z) {
        this.z = z;
    }

    public String toString() {
        return x + ", " + y + ", " + z;
    }

    public static void main(String[] args) {
        Robot a = new Robot("a");
        Robot b = new Robot("b");
        Robot c = new Robot("c");
        Ex1<Robot> robotEx1 = new Ex1<>(a, b, c);
        System.out.println(robotEx1);
    }
}

