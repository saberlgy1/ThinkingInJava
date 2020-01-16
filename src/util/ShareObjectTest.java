package util;

import java.util.AbstractList;

/**
 * @program: ThinkingInJava
 * @description: 享元设计模式探索
 * @author: lgy
 * @create: 2019-12-10 11:36
 **/

public class ShareObjectTest extends AbstractList<Integer> {

    private int size;

    public ShareObjectTest(int size) {
        this.size = size < 0 ? 0 : size;
    }

    public Integer get(int index){
        return Integer.valueOf(index);
    }

    public int size(){
        return  size;
    };

    public static void main(String[] args) {
        System.out.println(new ShareObjectTest(10));
    }
}
