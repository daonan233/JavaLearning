package jiekou;

public interface inter {
    public int num =10;
    public final int num2=20;//接口里默认为public static final int,
    int num3=30;
    //public inter();接口里不能有构造方法,要在实现类里面写
    //public void ass();会报错
    public abstract void method();
    void showshow();//也可以这么写，默认跟public abstract一样


}
