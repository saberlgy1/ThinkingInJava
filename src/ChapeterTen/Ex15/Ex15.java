package ChapeterTen.Ex15;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-03-20 14:14
 **/

class One{
    private String s;
    One(String s) { this.s = s; }
    public String showS() { return s; }
}

public class Ex15 {
    public One getOne(String x){
        return new One(x){

        };
    }

    public static void main(String[] args) {
        Ex15 x = new Ex15();
        System.out.println(x.getOne("1").showS());
    }

}
