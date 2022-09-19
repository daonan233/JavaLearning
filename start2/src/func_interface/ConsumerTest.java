package func_interface;

import java.util.function.Consumer;

public class ConsumerTest {
    public static void main(String[] args) {
        String[] strArray ={"daonan,20","liyuan,21","pjy,22"};
        printInfo(strArray,(String str)-> {
            String name = str.split(",")[0];
            System.out.print("name:" + name+" ");
        },(String str)->{
            int age=Integer.parseInt(str.split(",")[1]);
            System.out.println("age:"+age);
        });
        System.out.println("--------------");
        //简化版
        printInfo(strArray,str-> System.out.print("name:"+str.split(",")[0]),str-> System.out.println(" age:"+str.split(",")[1]));
    }
    private  static void printInfo(String[] strArray, Consumer<String> con1, Consumer<String> con2) {
        for(String str :strArray) {
            con1.andThen(con2).accept((str));
        }
    }

}
