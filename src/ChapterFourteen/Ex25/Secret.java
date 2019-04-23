package ChapterFourteen.Ex25;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-04-23 20:30
 **/



class Ex25 implements A{

    @Override
    public void e() {
        System.out.println("public");
    }

    private void f(){
        System.out.println("private");
    }
    protected void g(){
        System.out.println("procetect");
    }
    void h(){
        System.out.println("package");
    }

}

public class Secret {
    public static A makeA(){
        return new Ex25();
    }
}
