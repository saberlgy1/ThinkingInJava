package containers;

import util.Countries;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-12-10 15:16
 **/

public class Ex2 {

    public static void main(String[] args) {
        Map<String,String> hm = new HashMap<>();
        Set<String> hs = hm.keySet();
        Pattern p = Pattern.compile("A[a-zA-z]*");
        for (int i = 0; i < Countries.DATA.length; i++) {
            if (p.matcher(Countries.DATA[i][0]).matches()){
                hm.put(Countries.DATA[i][0],Countries.DATA[i][1]);
            }
        }
        System.out.println(hm);
        System.out.println(hs);
    }

}
