package daonan;

public class xiushifu {
    private void show1()
    {
        System.out.println("private");
    }
    void show2()
    {
        System.out.println("默认");
    }
    protected void show3()
    {
        System.out.println("protected");
    }
    public void show4()
    {
        System.out.println("public");
    }

    public static void main(String[] args) {
        final int ceshi =20;
        //ceshi=100;不能改了
        System.out.println("ceshi1:"+ceshi);
    }

    public final int xiushi=30;
    public int ceshi2=10;

}
