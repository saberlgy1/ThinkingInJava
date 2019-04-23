package CharpterSevenBefore;

/**
 * @program: ThinkingInJava
 * @description:父类
 * @author: lgy
 * @create: 2019-02-14 17:02
 **/

public class Light {

    //亮度
    private int brightness;

    //大小
    protected int size;

    //价格
    public int price;

    private void on(){
        System.out.println("私有函数打开灯，亮度为 ");
    }

    public void take(){
        System.out.println("保护函数拿起灯，大小为 " );
    }

    public void buy(){
        System.out.println("共有函数买到灯，价格为 ");
    }

    public Light() {
    }

    public void doSomething(Light light){
        light.take();
        light.buy();
    }

    public Light(int brightness, int size, int price) {
        this.brightness = brightness;
        this.size = size;
        this.price = price;
    }
}


