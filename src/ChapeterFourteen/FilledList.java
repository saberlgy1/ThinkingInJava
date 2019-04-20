package ChapeterFourteen;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-04-19 21:11
 **/

class Count{
    private static long count;
    private final Long id = count++;
    public String toString(){return Long.toString(id);}
}

public class FilledList<T>{
    private Class<T> type;

    public FilledList(Class<T> type) {this.type = type;}

    public List<T> create(int nElements){

        List<T> result = new ArrayList<T>();
        try {
            for (int i = 0; i < nElements; i++)
                result.add(type.newInstance());

        }catch (Exception e){
            throw new RuntimeException(e);
        }
        return result;
    }

    public static void main(String[] args) {
        FilledList<Count> list =
                new FilledList<Count>(Count.class);
        System.out.println(list.create(15));
    }
}