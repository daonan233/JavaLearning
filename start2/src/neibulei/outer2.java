package neibulei;

public class outer2 {
    public void method()
    {
        new inter()
        {//这个本质是一个继承了该类或实现了该接口的子类匿名对象
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        }.show();//对象调用了show方法
    }

    //如果想执行多次，就用多态的方法
    public void ass()
    {
        inter2 ii= new inter2()
        {
            @Override
            public void deep() {
                System.out.println("ass we can");
            }
        };
        ii.deep();
        ii.deep();//调用第二次

    }
}
