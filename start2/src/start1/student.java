package start1;
import java.util.Scanner;
public class student {
    public String name;
    private int studentID = 2021210;

    public void getName() {

        System.out.println(name);
    }

    public int getStudentID(int a) {
        a = studentID;
        return a;
    }

    int age;
    String school;

    public void regist(String school, int age) {
        Scanner sc = new Scanner(System.in);
        school = sc.nextLine();
        age = sc.nextInt();
        System.out.println("school:" + school);
        System.out.println("age:" + age);
    }

    public int getAge() {
        return age;
    }
    public String getName1()
    {
        return name;
    }


}
