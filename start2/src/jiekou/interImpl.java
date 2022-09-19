package jiekou;

public class  interImpl extends Object implements inter {
    //接口名后面跟Impl表示这是这个接口的实现类
    //类Object是类层次结构的根。每个类都有Object作为超类。所有对象（包括数组）都实现了这个类的方法
    //超类：如果一个类没有父类，超类就是他的父类。
    public interImpl()
    {
        super();
    }

    @Override
    public void showshow() {
        System.out.println("gnssw，showshow方法被实现");
    }


    @Override
    public void method() {
        System.out.println("method被实现");
    }
}
