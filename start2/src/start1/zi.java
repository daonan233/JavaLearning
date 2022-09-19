package start1;

public class zi extends fu //表明zi类继承了fu类
{
    public void method()
    {
        int age=30;
        System.out.println("method方法被调用");
        System.out.println("this.age："+this.age);//输出的是20，本类中的成员变量
        System.out.println("age："+age);//输出30，本方法中的变量
        System.out.println("super.age"+super.age);//调用父类的成员变量
    }
    public void show()//方法重写
    {
        super.show();
        System.out.println("zi中show（）方法被调用");
    }
    public int height = 175;
    public int age=20;
}

