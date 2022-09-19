package doudizhu;

import java.util.ArrayList;

public class kanpai {
    public static void lookPoker(String name, ArrayList<String> array)
    {
        System.out.println(name+"的牌是:");
        for(String poker :array)
            System.out.print(poker+" ");
        System.out.println("");
    }

}
