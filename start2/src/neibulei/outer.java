package neibulei;

/*内部类格式：
   public class 类名{
      修饰符 class 类名{
      }
   }
 */
//外部类要访问内部类的成员，必须创建对象
public class outer {
    private int num = 10;

    public class Inner {
        public void show() {
            System.out.println(num);
        }
    }

    public void method3()//局部内部类
    {
        class Inner2
        {
            public void showshowway()
            {
                System.out.println("num:"+num);
            }
        }
        Inner2 ii=new Inner2();
        ii.showshowway();
    }

    public void method() {
        Inner i = new Inner();
        i.show();
    }

    public void method2() {
        class Inner2 {
            public void show2() {
                System.out.println("class outer-void method2-class Inner2-void show2");
            }
        }
    }



}
