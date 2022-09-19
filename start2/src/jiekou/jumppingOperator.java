package jiekou;

public class jumppingOperator {
    public void usejumpping (jumpping2 j)//接口名做形参
    {
        j.jump();
    }
    public jumpping2 getJumpping2()
    {
        jumpping2 j =new jumppingShiXian();
        return j;
    }

}
