package func_interface;

import java.util.function.Predicate;
import java.util.Scanner;
public class PredicateTest {//Predicate接口通常用于判断参数是否满足指定的需求
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
//         boolean b1=checkString(str3,(String s)->{
//             return s.length()>8;
//         });
        boolean b1=checkString1(str1,s->s.length()>8);
        System.out.println(b1);

        String str2=sc.nextLine();
        boolean b3=checkString2(str2,s->s.length()>8,s->s.length()<15);
        System.out.println(b3);

    }
    //判断指定的字符串是否满足要求
    private static boolean checkString1 (String s, Predicate<String> pre) {
        return pre.test(s);
//        return pre.negate().test(s);     //相当于逻辑非
    }
    //返回一个组合判断，对应短路与/或
    private static boolean checkString2(String s,Predicate<String> pre1,Predicate<String>pre2) {
        boolean b1 = pre1.test(s);
        boolean b2=pre2.test(s);
        return b1&&b2;//短路与
    }
}
