package doudizhu;

import java.util.HashMap;
import java.util.TreeSet;

public class kanpai2 {
    public static void lookPokers(String name, TreeSet<Integer> ts, HashMap<Integer,String> hm)
    {
        System.out.print(name+"的牌是:");
        for(Integer key:ts)
        {
            String poker = hm.get(key);
            System.out.print(poker+" ");
        }
        System.out.println("");
    }
}
