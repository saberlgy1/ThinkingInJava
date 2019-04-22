package ChapterTen.Ex26;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-03-21 14:26
 **/

class WithInner{
    public class Inner {
        public Inner(String x) {
            System.out.println(x);
        }
    }
}


public class Ex26 {

    class Ex26Inner extends WithInner.Inner {
        Ex26Inner(WithInner wi){
            wi.super("s");
            System.out.println("ssss");
        }
    }

    public static void main(String[] args) {
        WithInner wi = new WithInner();
        Ex26 ex26 = new Ex26();
        Ex26Inner ex26Inner = ex26.new Ex26Inner(wi);
    }


}
