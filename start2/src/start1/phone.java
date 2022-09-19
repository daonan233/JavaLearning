package start1;
public class phone{
    //成员变量
    String brand;
    int price;
    private int phoneID=55;
    public void call()
    {
        System.out.println("打电话");
    }
    public void setPhoneID(int phoneID)
    {
        this.phoneID=phoneID;
        //this指代的是类里面定义的，没有this修饰的是形参表里的
    }
    public int getPhoneID()
    {
        return phoneID;
    }
    public void sendMessage()
    {
        System.out.println("发短信");
    }

    //构造方法
    public phone() {
    }
    public phone(int  price)
    {
        this.price=price;
    }
}
