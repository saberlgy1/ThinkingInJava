package ChapterTen.TeachThress;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-03-19 14:30
 **/

public class DoThis {

    void f(){
        System.out.println("DoThis.f()");
    }

    public class Inner{
        public DoThis outer(){
            return DoThis.this;
        }
    }
    public Inner inner(){
        return new Inner();
    }

    public static void main(String[] args) {
        DoThis dt = new DoThis();
        Inner dti = dt.inner();
        dti.outer().f();
        DoThis dt1 = new DoThis();
        Inner dni = dt1.new Inner();
    }

}
