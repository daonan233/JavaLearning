package fanxing;
//泛型的英语：generic
public class Generic <T> {
    public T t;
    public T getT()
    {
        return t;
    }
    public void setT(T t)
    {
        this.t=t;
    }
    public<T> void show(T t)//泛型方法，其实不写<T>也可以实现
    {
        System.out.println(t);
    }

}
//public class Generic  这个太麻烦了 我们用泛型类:public class Generic<T>{}
//{
//    public void show(String s)
//    {
//        System.out.println(s);
//    }
//    public void show(Integer i)
//    {
//        System.out.println(i);
//    }
//    public void show(Boolean b)
//    {
//        System.out.println(b);
//    }
//}
