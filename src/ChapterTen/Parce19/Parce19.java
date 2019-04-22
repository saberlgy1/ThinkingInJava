package ChapterTen.Parce19;


/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-03-19 19:41
 **/


abstract class Destination {

    public Destination(String dest){
        System.out.println(dest);
    }

    public abstract String readLabel();
}

public class Parce19 {

    public Destination destination(final String dest){
        return new Destination(dest){

          public String readLabel(){
              return dest;
          }
        };
    }

    public static void main(String[] args) {
        Parce19 parce19 = new Parce19();
        Destination d = parce19.destination("1");
        System.out.println(d.readLabel());
    }

}
