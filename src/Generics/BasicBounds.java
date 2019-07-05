package Generics;

import java.awt.*;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-05-15 16:20
 **/

interface HasColor{
    java.awt.Color getColor();
}

class Colored<T extends HasColor>{
    T item;
    Colored(T item){
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    java.awt.Color color(){
        return item.getColor();
    }


}

class Dimension{
    public int x, y, z;
}

class ColoredDimension<T extends Dimension & HasColor>{
    T item;
    ColoredDimension(T item){
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    java.awt.Color color(){
        return item.getColor();
    }

    int getX(){
        return item.x;
    }
    int getY(){
        return item.y;
    }
    int getZ(){
        return item.z;
    }
}

interface Weight{
    int weight();
}

class Solid<T extends Dimension & HasColor &Weight>{
    T item;
    Solid(T item){
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    java.awt.Color color(){
        return item.getColor();
    }

    int getX(){
        return item.x;
    }
    int getY(){
        return item.y;
    }
    int getZ(){
        return item.z;
    }

    int weight(){
     return item.weight();
    }
}

class Bounds extends Dimension implements HasColor, Weight{
    @Override
    public Color getColor() {
        return null;
    }

    @Override
    public int weight() {
        return 0;
    }
}

public class BasicBounds {

    public static void main(String[] args) {
        Solid<Bounds> solid = new Solid<>(new Bounds());
        solid.color();
        solid.getY();
        solid.weight();
    }

}
