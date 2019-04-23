package CharpterSevenBefore;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-03-11 13:43
 **/


class Connection{
   public Connection(){
       System.out.println("Creating a packaged class");
   }
}


public class ConnectionManager {

    public static void main(String[] args) {
        Connection pc = new Connection();
    }

}
