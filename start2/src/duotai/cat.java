package duotai;

public class cat extends animal{
    @Override//表示方法重写
    public void eat()
    {
        System.out.println("猫吃老鼠");
    }
    public void playGame()
    {
        System.out.println("猫捉迷藏");
    }
    public int age=20;
    public int weight=10;

}
