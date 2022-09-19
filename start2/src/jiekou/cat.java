package jiekou;

public class cat  implements  jumpping{//继承接口用implements，而不用extends
    @Override
    public void jump() {
        System.out.println("猫可以跳高了");
    }
}
