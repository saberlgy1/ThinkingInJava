package containers;
import Generics.Generator;

import	java.util.ArrayList;
import java.util.Collections;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-12-09 16:14
 **/

public class CollectionData<T> extends ArrayList<T> {

    public CollectionData(Generator<T>gen, int quantity){

        for (int i = 0; i< quantity;i++){
            add(gen.next());
        }

    }

    public static <T> CollectionData list(Generator<T> gen, int quantity){
        return new CollectionData<T>(gen,quantity);
    }


}
