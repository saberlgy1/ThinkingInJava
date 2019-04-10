package ChapeterNine.Practice11;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-03-18 13:25
 **/

public class StringMixer {


    public String process(String s){
        char[] ca = new char[s.length()];
        if (s.length() % 2 == 0){
            for (int i = 0; i< s.length(); i += 2){
                ca[i] = s.charAt(i + 1);
                ca[i + 1] = s.charAt(i);
            }
            System.out.println(ca.toString());
            return ca.toString();
        }
        else {
            for (int i = 0; i< s.length() - 1; i += 2){
                ca[i] = s.charAt(i + 1);
                ca[i + 1] = s.charAt(i);
            }
            ca[s.length() - 1] = s.charAt(s.length() - 1);
            System.out.println(ca);
            return ca.toString();
        }
    }


}
