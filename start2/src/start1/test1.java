package start1;
//                      一. 输出
/*public class test1{
	/*public static void main(String[] args){
		System. out.println("Hello World");
		System. out.println(666);
		System. out.println(true);
		System. out.println('A');
		System. out.println("ass");
		//System.out.println(null);
		 int i=1;
		 System.out.println("i:"+i);
		 int j=2;
	s	 System.out.println(i==j);//输出false
		 System.out.println(i=j);//输出2（i被赋值为j）
	}*/
	/*
	public static void main(String[] args)
	{
		System.out.println(a);
	}
}*///可以写中文注释
/*you can also write like this sentence */



//                二.数据类型，整数型多一个byte（-128~127），内存占用1
/*public class test1{
	public static void main(String[] args)
	{
		double d=13.14;//
		long e = 10000000000000L;//为了防止数字太大而用的是int，在long后面习惯加个L
		float a= 3.14F;//同样的，为了防止float被转换成double，在float后面加上F
		System.out.println(d);
		System.out.println(e);
		System.out.println(a);
	}
}*/



//              三.标识符，不能以数字开头，不能是关键字，区分大小写。可以以$和_组成
/*命名约定：1.小驼峰命名法（方法和变量）：一个单词首字母小写，多个单词首小后大
 *         2.大驼峰命名法（类）：每个单词首字母都大写
 */


//              四：类型转换
/*public class test1{
	public static void main(String[] args)
	{
		//自动类型转换：占内存小换占内存大的
		double d=10;
		System.out.println(d);//输出10.0
		byte b=10;
	    int c=b;
	    System.out.println(c);
	    //强制类型转换
	    int k=(int)88.88;
	    System.out.println(k);//输出88，数值丢失
	}
}*/



//              五：字符和字符串的拼接
/*public class test1{
	public static void main(String[] args) {
		char a='a';
		char b='c';
		char c=(char)(a+b);
		System.out.println(c);//输出的是(int)a+(int)b对应的char
		String d="ass";
		String e="hole";
		System.out.println(d+e);
		System.out.println("哈哈哈"+6+66);//先出现字符串，后面数字运算按照字符串连接处理
		System.out.println(1+99+"瓶酒");//先出现数字运算，就先算出结果后再连接
	}
}*/



//             六：逻辑运算符

/*public class test1{
	public static void main(String[] args)
	{
		int i=10;
		int j=20;
		int k=30;
		//& 逻辑与（有false则false）
		System .out.println((i>j)&(i>k));    //false
		//| 逻辑或 （有true则true）
		System.out.println((i<j)|(j>k));    //true
		//^ 逻辑异或 （相同为false，不同为true）
		System.out.println((i<j)^(j<k));    //false
		//! 逻辑非 （这个不用说了把。。加奇数个为否，偶数个不变，奇变偶不变）

		//短路与：&&  左边为假，右边不执行
		//短路或：|| 左边为真，右边不执行
	}
}*/



//             七：数据输入

/*//导包
import java.util.Scanner;//导包的动作出现在类定义的上面
public class test1{
	public static void main(String[] args)
	{
		//创建对象
		Scanner sc=new Scanner(System.in);//这个格式里面只有sc是变量名可以变，其他的都不能变
		//接收数据
		int i=sc.nextInt();//这个格式里面只有i是变量名，可以变，其他的都不允许变
		System.out.println("i:"+i);
		//一个案例
		int height1=sc.nextInt();
		int height2=sc.nextInt();
		int height3=sc.nextInt();
		int taller=height1>height2?height1:height2;
		int tallest=taller>height3?taller:height3;
		System.out.println("最高的是："+tallest);
	}
}
*/



//              八：分支、循环、跳转
/*import java.util.Scanner;
public class test1{
	public static void main(String[] args)
	{
		//if..else、else if 语句
		int i=110;
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a==i)
			{
			  System.out.println("Right");
			  a=0;
			}
		else if(a<=i)
			System.out.println("Smaller");
		else
			System.out.println("Bigger");

		//switch语句
		int tmp= sc.nextInt();
		switch (tmp)//JDK5以后可以是枚举，JDK7以后可以是字符串
		{
		case 1:
			System.out.println(tmp);//case 和数值中间记得空格一下
			break;
		case 2:
			System.out.println(tmp);
			break;
		default:
			System.out .println("Too big!");

		}

		//for循环，和C/C++一样
		for ( int j=0;j<=100;j++)
		{
			System.out.println(j);
		}

		//while循环，和C/C++一样
		int p=10;
		while (p-->=0)
		{
			System.out.println(p);//10到-1
		}

		//do while循环
		int ad=sc.nextInt();
		do {
			ad--;
			System.out.println(ad);
		}while(ad>ad);//不管这里是不是false，一定至少会运行一次

		//跳转控制语句（continue和break，一样的用法）
	}
}*/



//                           九：Random产生随机数
/*import java.util.Random;//导包
public class test1{
	public static void main(String[] args)
	{
		Random r =new Random();//r可以变，其他不行
		int number =r.nextInt(10);//number和10可以变.10代表0~10，包括0不包括10
	    int t=10;
	    while (t-->0)
		 System.out.println("number:"+number);//这样子就是同一个随机数一直输出
	    int k=10;
	    while (k-->0)
	    {
	    	int asshole =r.nextInt(100)+1;//1~100的随机数
	    	System .out.println(asshole);//这样就是输出10个不同的随机数
	    }
	}
}*/



//                         十：数组
/*import java.util.Scanner;
public class test1{
	public static void main(String[] args)
	{
		//数组定义（两种）
		int [] arr1;//定义了一个int类型的数组，数组名为arr1（一般用这种）
		int arr2[];//定义了一个int类型的变量，变量名为arr2数组
		//数组初始化
		int[] arr3=new int [3];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<=2;i++)
		{
			arr3[i]=sc.nextInt();
			System.out.println(arr3[i]);
		}
		System.out.println(arr3);
		System.out.println(arr3[0]);
		//整个数组赋值
		int[] arr4	=arr3;
		//数组的静态初始化
		int[] arr5=new int [] {1,2,3};//一种写法
		int[] arr6={1,2,3};           //另一种写法
		System.out.println(arr6[1]);
		//数组常见操作
		int length=arr6.length;//获取数组长度
		}
}*/



//                      十一：方法（其实就是函数）
/*import java.util.Scanner;
import java.util.Random;
public class test1{
	public static void wuwu()
	{
		Random rand=new Random();
		int rands=rand.nextInt(10);
		System.out.println(rands);
		Scanner sc=new Scanner(System .in);
		String str= sc.nextLine();
		System.out.println(str);
	}
	public static void ass(int numbers)
	{
		numbers=5>numbers?5:numbers;
		System.out.println(numbers);

	}
	public static void main(String [] args)
	{
		wuwu();
		Scanner sc=new Scanner(System.in);
		int numbers=sc.nextInt();
		ass(numbers);


		int[]arr= {10,20,30};
		int maxnx=maxn(arr);
		System.out.println(maxnx);

		System.out.println("调用change方法前："+arr[1]);
		change (arr);
		System.out.println("调用change方法后："+arr[1]);
		System.out.print("没有ln就是不换行");
		System.out.print(" 你看是吧");
	}
    //方法参数传递（引用类型）
	public static void change (int[] arr)
	{
		arr[1]=200;
	}
	public static int maxn(int [] arr)
	{
		int arrLength=arr.length;
		int tmp=arr[0];
		for(int i=1;i<=arrLength-1;i++)
		  tmp=arr[i]>tmp?arr[i]:tmp;
		 return tmp;
	}
}//重载就不说了*/


//                   十二：类和对象  ->用了student和phone两个类
//类是对象的数据类型，类是具有相同属性和行为的一组对象的集合
//类是对象的抽象，对象是类的实体
/*import java.util.Scanner;
import java.util.Random;
public class test1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		phone p=new phone();
		System.out.println(p.brand);
		System.out.println(p.price);
		p.brand="小米";
		p.price=2999;
		System.out.println(p.brand);
		System.out.println(p.price);
		p.call();
		p.sendMessage();

		//自己写一个student类
		student stu=new student();
		String schools="null";
		int ages=0;
//private的用法，在student类里面的name与studentID里面使用了
		//stu.name="daonan";不能改name，因为name已经是private
		stu.getName();
		int id=0;
		id=stu.getStudentID(id);
		System.out.println(id);
		stu.regist(schools,ages);

//this的用法，在phone类里面的phoneID处使用了
		int phone_id=sc.nextInt();
		p.setPhoneID(phone_id);
		int phoneid=p.getPhoneID();
		System.out.println("phoneID:"+phoneid);

		//构造方法（在phone类里面）
	}
}
*/



//                         十三：Api练习
//案例：用户登录
/*import java.util.Scanner;
public class test1{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String userName="daonan";
		String keyWord="2021210100";
		String tryUserName;
		String tryKeyWord;
		for(int i=0;i<=2;i++)
		{
		    tryUserName=sc.nextLine();
			tryKeyWord=sc.nextLine();
			if(tryKeyWord.equals(keyWord)&&tryUserName.equals(userName))
			//字符串的相同比较用.equals()
			{
				System.out.println("登陆成功！");
				break;
			}
			else System.out.println("密码或账号错误！还能尝试"+(2-i)+"次");
			if(i==2) System.out.println("三次错误，登陆失败！");
		}
	}
}*/


//                    十四：StringBuilder相关
/*import java.util.Scanner;
public class test1
{
	public static void main(String[] args)
	{
		//StringBuilder的创建
		StringBuilder Sb=new StringBuilder();
		System.out.println("sb:"+Sb);
		System.out.println("sb.lenght"+Sb.length());

		StringBuilder Sb2=new StringBuilder("Hello World");
		System.out.println("sb2:"+Sb2);
		System.out.println("sb2.lenght:"+Sb2.length());//空格也占一个

		//append的使用:添加数据，并返回对象本身
		Sb.append("hello");
		Sb.append("world");
		Sb.append("java");
		Sb.append(100);
		System.out.println("Sb:"+Sb);
		//append的链式编程
		Sb.append("wuwu").append("daonan").append(55);
		System.out.println("Sb:"+Sb);

		//reverse()的使用：返回相反的字符序列
		Sb2.reverse();
		System.out.println("Sb2:"+Sb2);

		//StringBuilder和String互相转换
		//public String toString()  :Sb->S
		//public StringBuilder(String s）  :S->Sb

		String s="hello";
		StringBuilder sb=new StringBuilder(s);//构造的做法
		System.out.println("sb:"+sb);

		//数组改字符串加中括号
		int[] arr= {1,2,3};
		String str=arrayToString(arr);
		System.out.println(str);

		//字符串反转升级版
		Scanner sc=new Scanner (System.in);
		String line =sc.nextLine();
		String ass=myReverse(line);
		System.out.println(ass);
	}

	private static String arrayToString(int[] arr)
	{//一个拼接的方法
		StringBuilder sb=new StringBuilder();
		sb.append("[");
		for(int i=0;i<arr.length;i++)
		{
			if(i==arr.length-1)
				sb.append(arr[i]);
			else
				sb.append(arr[i]).append(",");
		}
		sb.append("]");
		String s=sb.toString();
		return s;

	}

	public static String myReverse(String s)
	{
		return new StringBuilder(s).reverse().toString();

	}
}
*/


//                       十五：集合基础
/*import java.util.Scanner;
import java.util.ArrayList;
public class test1{
	public static void main(String[] args)
	{
		//public ArrayList();     //创建一个空的集合对象
		//public bollean add(E e);  //将指定的元素追加到此集合的末尾
		//public void add(int index,E element);//在此集合中指定位置插入指定的元素

		ArrayList<String> array =new ArrayList<String>();//创建集合

		System.out.println("array:"+array);
		//System.out.println(array.add("hello")); ->输出true
		array.add("hello");//在第0个位置上
		array.add("world");//在第一个位置上
		array.add("java");//在第二个位置上
		System.out.println("array:"+array);

		//指定位置加元素public array.add(index,element);
		array.add( 3 ,"javase");//（插入的位置（最多比当前已填写的位置多一），插入内容）
		System.out.println("array:"+array);

		//删除指定元素,返回删除是否成功
		//public boolean remover (object,o);
		System.out.println(array.remove("java"));
		System.out.println(array.remove("daonan"));

		//修改指定元素，public E.set(int index,E element);
		System.out.println(array.set(1,"wocao"));//输出被替换前的
		System.out.println("array："+array);

		//返回访问位置的元素 public E.get(int index);
		String ass=array.get(2);
		System.out.println(ass);
		System.out.println(array.get(2));

		//返回集合中的元素个数：public int size();
		int size =array.size();
		System.out.println(size);
	}
}*/



//                        十六：继承  ->用了ye、fu、zi三个类
/*public class test1 {
    //建立了fu、zi两个类
    public static void main(String[] args) {
        fu f = new fu();
        f.show();
        zi z = new zi();
        z.method();
        //接下来我们用extend关键字让zi继承fu的类（在zi类里面）
        z.show();

        //继承的好处1：提高了代码的复用性（多个类相同的成员可以放在同一个类中）
        //2：提高了代码的维护性（只要修改父类的就可以）
        //继承的弊端：类的耦合性增强了，父类子类同时变化，独立性降低


        //继承类调用顺序
        int age = z.age;//如果子类里有跟父类里一样的变量/方法，就只会调用子类的
        //顺序：子类局部范围->子类成员范围->父类成员范围->再没有就报错（不考虑父亲的父亲）
        System.out.println(age);

        //super
        //代表父类存储空间的标识（可以理解为父类对象引用），在zi类里面体现了
        //fu和zi可以有同名的方法，可以用super在zi中调用fu中同名的方法,这称为方法重写

        //另外：测试一下我们是什么编码,开始用idea的时候console会输出中文乱码qwq
        // System.out.println(System.getProperty("file.encoding"));
    }
}*/



//                        十七：导包(import)  ->用了xiushifu这个类
/*import java.util.Scanner;
import daonan.xiushifu;//导入daonan这个包里面的类xiushifu
public class test1
{
    public static void main(String[] args) {
        xiushifu xiu =new xiushifu();
       //xiu.show1();  private
       //xiu.show2();    默认
       //xiu.show3();    public
        这三个都报错
        xiu.show4();
    }
}
*/


//                      十八：权限修饰符   ->用了xiushifu、university两个类
/*import daonan.xiushifu;
import daonan.university;
public class test1
{
    public static void main(String[] args) {
        //final（最终态）->修饰成员方法，成员变量，类->不能被重写，不能再次被赋值（常量），类被final修饰就不能被子继承
        //static（静态）

        //                     1.final

        xiushifu xiu = new xiushifu();
       // xiu.xiushi=40;会报错，final修饰的值无法改变

        System.out.println("final修饰的ceshi2原:"+xiu.ceshi2);
        final xiushifu xiushi =new xiushifu();//用final修饰引用类型变量
        xiushi.ceshi2=40;
        System.out.println("final修饰的ceshi2改:"+xiushi.ceshi2);
        //为什么基本类型不能变，引用类型可以变？
        //基本类型final修饰的是值，值不能变
        //引用类型的xiushi指的是地址，final修饰的是地址，地址不能变，地址里面内容的值可以变

        //                     2.static
        //static用来表示共同的变量
        university stu1 =new university();
        stu1.name="55";
        stu1.age=20;
        stu1.university="BUPT";//这边改了，下面也会一起变，因为是static
        stu1.show();
        System.out.println("");

        university stu2=new university();
        stu2.name="daonan";
        stu2.age=19;
        stu2.show();
        System.out.println("");
        stu1.show();//这时候我们在测试一下没有static修饰的会不会因为stu2改变了导致stu1也变了，发现没有
        //静态成员方法只能访问静态成员
    }
}*/


//                         十九：多态  ->使用了animal，cat，dog三个类
//多态：同一个对象，在不同时刻表现出的不同形态
//前提和体现：1.有继承/实现关系 2.有方法重写 3.有父类引用指向子类对象
/*import duotai.animal;
import duotai.cat;
import duotai.dog;
public class test1 {
    public static void main(String[] args) {
//                     1.多态的使用

     //有父类引用指向子类对象
        animal a=new cat();
        System.out.println(a.age);//输出的是animal的成员变量
        a.eat();//执行的是cat的方法
        //System.out.println(a.weight);报错，看的是左边的(animal）里面有没有这个成员方法
        //a.playGame();同样报错

        //总结：1.成员变量编译看左边，执行看左边；2.成员方法编译看左边，执行看右边；
        //因为成员方法有重写，成员变量没有

        //多态的好处和弊端：
        //好处：提高了程序的拓展性。在定义方法的时候，使用父类型作为参数，将来在使用的时候，使用具体的子类型参与操作
        //弊端：不能使用子类的特有功能，需要使用多态中的转型

//                     2.多态的转型
        //向上转型：从子到父，父类引用指向子类对象
        //向下转型：从父到子，父类引用转为子类对象
        animal catt =new cat();//向上转型
        animal dogg =new dog();
        dogg.eat();

        cat c=(cat)catt;//向下转型，强制类型转换
        c.playGame();//这里就可以访问cat的特有方法了，和595行对比
    }
}
 */


//                     二十:抽象类
//一个没有方法体的方法应该定义为抽象方法，二类中如果有抽象方法，该类必须定义为抽象类
/*import duotai.creature;
import duotai.littleCreature;
public class test1
{
    public static void main(String[] args) {
        //我已经在creature类里定义了一个抽象方法，类和方法都要用abstract修饰
        //creature crea=new creature();抽象类没法创建对象，要用多态的方法创建对象（向上转型）
        creature crea =new littleCreature();//向上转型
        crea.sleep();//抽象类里面没有方法体，用的是littleCreature的方法
        crea.jile();//littleCreature里面没有重写jile，用的是父类（抽象类）里面的方法
    }
}*/


//                    二十一:接口
//接口
/*import jiekou.*;
import org.w3c.dom.ls.LSOutput;

//在jiekou包里的类cat继承接口jumpping时用的是implements
public class test1
{
    public static void main(String[] args) {
        //1.接口的写法

        //jumpping j = new jummping;接口不能通过普通方法实现实例化
        jumpping j = new cat();//可以使用多态的方法实现
        j.jump();

        inter i = new interImpl();
        //i.num=40;报错，接口中的变量全部视为final，不可改变

        System.out.println(i.num);
        System.out.println(i.num2);
        System.out.println(i.num3);
        System.out.println(inter.num);

        //在接口的实现类里面重写方法
        i.showshow();
        i.method();

        //2.接口和类的关系
        //类和类的关系：类和类之间，只能单继承，不能多继承
        //类和接口的关系：实现关系，可以单实现，也可以多实现，可以在继承一个类的时候同时实现多个接口
        //接口和接口的关系：继承关系，可以单继承，也可以多继承

        //这里我们用jicheng1，jicheng2.jicheng3三个接口和jichengImpl这个实现类来演示

        //接口名做形参
        jumppingOperator jo=new jumppingOperator();
        jumpping2 ju=new jumppingShiXian();
        jo.usejumpping(ju);
        //接口名做返回值
        jumpping2 j2 =jo.getJumpping2();
        j2.jump();
    }
}*/


//                       二十二:内部类
//定义：就是在一个类中定义一个类。举例：在类A的内部定义一个类B，B称为内部类
//访问特点：1.内部类可以直接访问外部类的成员，包括私有类
/*import neibulei.outer;
import neibulei.outer2;
public class test1
{
    public static void main(String[] args)
    {
       //创建内部类对象并调用方法
       //不能直接创建内部类的对象
       //格式：外部类名.内部类名 对象名 =new 外部类对象().new 内部类对象()
        //成员内部类
        outer.Inner outin=new outer().new Inner();
        outin.show();

        //局部内部类
        outer o =new outer();
        o.method3();

        //匿名内部类:存在一个类或者接口，这里的类可以是具体类也可以是抽象类
        //格式：
        //new 类名或接口名(){   比如：      new Inter(){
        //    重写方法;                     public void show() {   }
        //};                             }
        outer2 oo=new outer2();
        oo.method();
        oo.ass();
    }
}
 */


import Lambda.Eatable;
import Lambda.MyRunnable;


//                      二十三:常用API
//1.Math   文档地址：https://www.matools.com/api/java8
/*
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Calendar;
import java.util.SimpleTimeZone;

public  class test1 {
    public static void main(String[] args) throws ParseException {
        //public static int abs(int a);返回参数的绝对值
        System.out.println(Math.abs(88));
        System.out.println(Math.abs(-88));
        System.out.println(Math.abs(-7.21));
        System.out.println("abs----------");

        //public static double ceil (double a);返回大于等于参数的最大double值，等于一个整数
        System.out.println(Math.ceil(12.34));
        System.out.println(Math.ceil(12.56));
        System.out.println("ceil----------");

        //public static double floor (double a);返回小于等于参数的最大double值，等于一个整数
        System.out.println(Math.floor(12.34));
        System.out.println(Math.floor(12.56));
        System.out.println("floor---------");

        //public static int round(float a);四舍五入返回最接近参数的int
        System.out.println(Math.round(12.34));
        System.out.println(Math.round(12.56));
        System.out.println("round---------");

        //public static int max/min (int a ,int b);这个就不写了,其实也可以比较浮点型的
        System.out.println(Math.max(22.3,44.5));
        System.out.println(Math.min(33.6,25.1));
        System.out.println("max/min-------");

        //public static double pow (double a,double b);返回a的b次幂的值

        //public static double random();返回值为double的正值[0.0,1.0）
        System.out.println(Math.random());
        System.out.println(Math.random()*100);
        System.out.println(Math.round(Math.random()*100));
        System.out.println((int)(Math.random()*100)+1);
        System.out.println("random--------");

//2.System
        //public static void exit(int status) 终止当前运行的java虚拟机，非零表示异常终止
        //public static long currentTimeMillis() 返回当前时间（以毫秒为单位）

        // System.out.println("开始");
        //System.exit(0);
        //System.out.println("结束");


        System.out.println(System.currentTimeMillis()*1.0/1000/60/60/24/365+"年");
        long start =System.currentTimeMillis();
        int ass=0;
        for(long  i=0;i<100;i++)
        {
            System.out.println(i);
        }
        long end =System.currentTimeMillis();
        System.out.println("共耗时"+(end-start)+"毫秒");

//3.Object,调用了stu这个类，并且重写了equals和toString两个方法
        //Object是类层次结构的根，每个类都可以将Object作为超类。所有类都直接或间接的继承自该类
        //构造方法:public Object();

        //toString方法
        stu stu1=new stu();
        stu1.setName("daonan");
        stu1.setAge(30);
        System.out.println(stu1);           //start1.stu@5b6f7412,打印出哈希码
        System.out.println(stu1.toString());//start1.stu@5b6f7412
        //找到println的源码（Ctrl+B)
        //建议所有子类重写此方法（自动生成即可，fn+alt+insert）

        //equals()方法
        stu stu2=new stu();
        stu2.setName("daonan");
        stu2.setAge(30);

        System.out.println(stu1==stu2);//false,因为stu1和stu2所带的地址值不一样
        System.out.println(stu1.equals(stu2));//false,equals比的还是地址值,因此要重写。重写后为true

//Arrays
        //Arrays类包含用于操作数组的各种方法
        //public satic String toString(int[] a) 返回指定数组的内容的字符串表示形式
        int[] arr ={1,9,1,9,8,1,0};
        System.out.println("排序前:"+Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("排序后:"+Arrays.toString(arr));

//Integer（包装一个对象中的原始类型int的值）
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        Integer i1=new Integer(100);//已经过时的
        System.out.println(i1);//100

        Integer i2=new Integer("100");
        System.out.println(i2);//100

        //Integer i3 =new Integer("abd");
        //System.out.println(i3);不少abc


        //public static Integer valueOf(int i):返回指定的int值的Integer实例
       Integer i1=Integer.valueOf(100);
        System.out.println(i1);

        //public static Integer valueOf(String s):返回一个保存指定值的Integer对象String
        Integer i2=Integer.valueOf("100");
        System.out.println(i2);
        System.out.println("----------");

//int和String的互相转换
       //int ---String
       //第一种：简单的转换
        int number =100;
        String s1=""+number;
        System.out.println(s1);
        System.out.println("----------");

        //第二种：public static String valueOf(int i);
        String s2 =String.valueOf(number);
        System.out.println(s2);
        System.out.println("----------");

        //String ---int
        String s="100";
        //方式一:String -Integer-int
        Integer i =Integer.valueOf(s);
        System.out.println(i.intValue());//intValue方法:Integer->int
        System.out.println("----------");

        //方式二:public static int parseInt(String s)
        int yy=Integer.parseInt(s);
        System.out.println(yy);
        System.out.println("----------");

//案例:字符串种数据排序

        //用public String[] split (String regex),得到字符串中的每个数字数据
        //用public static int parseInt(String s)，把String[]种的每个元素存储到int数组众
        //把排序后的int数组中的元素进行拼接得到一个字符串，用StringBuilder来实现

        String s3="91 27 46 38 50";
       String[] strArray =  s3.split(" ");
//       for(int p=0;p<strArray.length;p++)
//       {
//           System.out.println(strArray[p]);
//       }
        int [] array =new int [strArray.length];
        for(int j=0;j<array.length;j++)
        {
            array[j]= Integer.parseInt(strArray[j]);
        }

        Arrays.sort(array);

//        for(int y=0;y<arr.length;y++)
//        {
//            System.out.println(arr[y]);
//        }

        StringBuilder sb =new StringBuilder();
        for(int w=0;w<array.length;w++)//把字符串拼接成一个
    {
        if(i==array.length-1)
            sb.append(array[w]);
        else
            sb.append(array[w]).append(" ");
    }

    String result =sb.toString();
        System.out.println("result:"+result);

//案例：自动装箱与拆箱
        //装箱：把基本数据类型转换成对应的包装类类型
        Integer ii=Integer.valueOf(100);//手动装箱
        Integer iii=100;
        //拆箱:把包装类类型转换为对应的基本数据类型
        ii=ii.intValue()+200;//自动装箱(ii.Intvalue()是手动拆箱）
        ii+=200;//自动拆箱
        System.out.println(ii);

        Integer iiii=null;
        if(iiii!=null)
        {
            iii+=300;
        }

//Data类:代表了一个特定的时间，以毫秒的精度
        //public Data();分配一个Da
        Date d1 = new Date();
        System.out.println(d1);

        //public Date(long date)：分配一个Date对象，并将其初始化为从标准基准时间起指定的毫秒数
        long date =1000*60*60;
        Date d2 =new Date(date);
        System.out.println(d2);//加了时区，差9h

        //public long getTime()获取的是日期对象从1970年1月1日00:00:00到现在的毫秒值
        Date d =new Date();
        System.out.println(d.getTime()*1.0/1000/60/60/24/365+"年");

        //public void setTime(long time)：设置时间，给的是毫秒值
        long time =1000*60*60;
        d.setTime(time);
        System.out.println(d);

        long time2=System.currentTimeMillis();
        d.setTime(time2);
        System.out.println(d);
//SimpleDateFormat类概述
        Date date1 = new Date();
        SimpleDateFormat sdf=new SimpleDateFormat();
        String sDate=sdf.format(d);
        System.out.println(sDate);

        //可以多改一个
        SimpleDateFormat sdf1 =new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String s4=sdf1.format(date1);
        System.out.println(s4);

        //从String 到 Date
        String ss="2022-07-15 20:00:14";
        SimpleDateFormat sdf2 =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//貌似不能用汉字？2022年07月15日这样
        Date dd=sdf2.parse(ss);
        System.out.println(dd);

//Calendar类
        //Calendar为某一时刻和一组日历字段之间的转换提供了一些方法，并为操作日历字段提供了一些方法
        //Calendat提供了一个类方法getInstance用于获取calendart对象，其日历字段已使用当前日期和时间初始值
        Calendar c =Calendar.getInstance();//多态的形式

        //public int get(int field)返回给定日历字段的值
        int year1 =c.get(Calendar.YEAR);
        int month1=c.get(Calendar.MONTH)+1;//注意要加一
        int dates1=c.get(Calendar.DATE);
        System.out.println(year1+"年"+month1+"月"+dates1+"日");

        //public abstract void add(int field,int amount)根据日历的规则，将指定的时间量添加或减去给定的日历字段
        c.add(Calendar.YEAR,-3);//三年前的今天
        int year2 =c.get(Calendar.YEAR);
        int month2=c.get(Calendar.MONTH)+1;//注意要加一
        int dates2=c.get(Calendar.DATE);
        System.out.println(year2+"年"+month2+"月"+dates2+"日");
        c.add(Calendar.YEAR,3);

        //public final void set(int year,int month,int date)：设置当前日历的年月日
        c.set(2077,13,11);
        int year3 =c.get(Calendar.YEAR);
        int month3=c.get(Calendar.MONTH)+1;//注意要加一
        int dates3=c.get(Calendar.DATE);
        System.out.println(year3+"年"+month3+"月"+dates3+"日");


    }
}
*/


//                        二十四：异常
/*import java.util.Date;
import java.text.ParseException;
import java.util.function.DoubleUnaryOperator;

public class test1 {
    public static void main(String[] args) {
//        Error:严重问题，不需要处理

//        Exception:异常类，表示程序本身可以处理的问题
//        RuntimeException:在编译期是不检查的。出现问题后，需要我们回来修改代码
//        非RuntimeException:编译期就必须处理的，否则程序不能通过编译，更不能正常运行
//
//          JVM（java虚拟机，Java Virtual Machine）的默认处理方案:如果程序出现了问题，我们没有做任何处理，最终JVM会做默认的处理
//          1.把异常的名称、异常原因及异常出现的位置等信息输出在了控制台
//          2.程序停止执行

//异常处理1：  try...catch...
//        try {
//            可能出现异常的代码
//        }catch(异常类名 变量名) {
//            异常的处理代码
//        }
        System.out.println("开始");
        method();
        System.out.println("结束");
        System.out.println("--------------");
        method2();
    }

    //运行时异常：

    public static void method()  {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);//new ArrayIndexOutOfBoundsException()，产生一个新的异常类对象
        }catch(ArrayIndexOutOfBoundsException e){
           System.out.println("你所访问的数组的索引不存在");

            //public void printStackTrace();在命令行打印异常信息在程序中出错的位置及原因
            e.printStackTrace();

            //public String getMessage();返回次throwable的详细消息字符串
            System.out.println(e.getMessage());

            //public String toString();返回此可抛出的简短描述
            System.out.println(e.toString());
        }

        //

        //编译时异常
    }public static void method2()
    {
        try {
            String s = "2077-*11-*11";
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date d = sdf.parse(s);
            System.out.println(d);
        }catch(ParseException e)
        {
            e.printStackTrace();
            System.out.println(e.toString());
            System.out.println(e.getMessage());
        }
    }

//throws异常类名，这个格式是跟在方法的括号后面的
    //如public static void method2() throws ParseException{}
    //这个只是延缓了异常的发生时间，并没有处理异常。处理异常需要用try catch

//自定义异常
//    public class 异常类名 extends Exception{
//        无参构造
//        带参构造
//    }
}
*/



//               二十五:集合进阶

/*import java.util.*;
import java.util .LinkedHashSet;
import java.util.TreeSet;
import java.util.Comparator;
import fanxing.Generic;
import fanxing.Generic2Impl;
import fanxing.Summarize;
import fanxing.Generic2;
import doudizhu.kanpai;
import doudizhu.kanpai2;

public class test1 {
    public static void main(String[] args) {

//collection：史丹利集合的顶层接口，他表示一组对象，这些对象也称为Collection的元素
        //JDK不提供此接口的任何直接实现，他提供更具体的子接口（如Set和List)实现

        //创建Collection集合的对象:1.多态的方式 2.具体的实现类ArrayList
        Collection<String> c = new ArrayList<String>();
        //添加元素:boolean add(E e)
        c.add("hello");
        c.add("world");
        c.add("java");
        System.out.println(c);//说明ArrayList中重写了toString方法
        //移除指定元素：boolean remove(Object o);
        c.remove("java");
        System.out.println(c);
        //判断集合中是否存在指定的元素；boolean contains(Object o)
        System.out.println(c.contains("hello"));
        System.out.println(c.contains("java"));
        //判断集合是否为空:boolean isEmpty()
        System.out.println(c.isEmpty());
        //获取集合长度：int size()
        System.out.println(c.size());
        //清空集合中的元素 void clear();
        c.clear();
        System.out.println(c.size());

        //Collection 集合的遍历- 迭代器Iterator

        Collection<String> c2 = new ArrayList<>();
        c2.add("daonan");
        c2.add("liyuan");
        c2.add("ILY");
        //Iterator<E>itorator();返回此集合中元素的迭代器，通过集合的iterator()方法得到
        Iterator<String> it = c2.iterator();
        //E.next()返回迭代中的洗一个元素
        System.out.println(it.next());
        System.out.println(it.next());
        //boolean hasNext()：如果迭代具有更多元素，则返回true；
        while (it.hasNext())
            System.out.println(it.next());
        System.out.println(it.hasNext());

//List集合
        //有序集合（也称为序列）用户可以精确控制列表中每个元素的插入位置。用户可以通过证书索引访问元素，并搜索列表中的元素
        //与Set集合不同，列表通常允许重复的元素
        //List集合特点 1.有序：存储和去除的元素顺序一致 2.可重复：存储的元素可以重复
        List<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("hello");
        System.out.println(list);

        Iterator<String> it1 = list.iterator();//遍历一下list
        while (it1.hasNext()) {
            System.out.println(it1.next());
        }
        System.out.println("----------");
        //List的add(int index,E element)、remove(int index)、set(int index,E element)、get(int index)跟其他是一样的
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("----------");

//并发修改异常：实际修改集合的次数和预期修改集合的次数不同，会抛出异常
        List<String> list2 = new ArrayList<String>();

        list2.add("福建");
        list2.add("泉州");
        list2.add("永春");
        for (int i = 0; i < list2.size(); i++) {
            String s = list2.get(i);
            if (s.equals("永春")) {
                list2.add("桃城");
            }
        }
        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));
        }
//ListInterator
        List<String> llist = new ArrayList<>();
        llist.add("helloo");
        llist.add("wworld");
        llist.add("jjava");

        //获取列表迭代器
        ListIterator<String> lit = llist.listIterator();
        while (lit.hasNext()) {
            String s = lit.next();
            if (s.equals("world")) {
                lit.add("jjavaee");
            }
        }
        System.out.println(list);

//增强for循环:简化数组和Collection集合的遍历
        //实现Iterable接口的类允许其对象称为增强型for语句的目标
        //他是JDK5之后出现的，其内部原理是一个Iterator迭代器

      //  for (元素数据类型 变量名 : 数组或Collection集合)
        //在此处使用变量即可，该变量就是元素
   // },来个简单的样例
        int[] arr ={1,2,3,4,5};
        for(int i:arr)
        {
            System.out.println(i);
        }

        List <String> list3=new ArrayList<String>();
        list3.add("kpz");//抠痞子
        list3.add("gmz");//挂马子
        list3.add("zfz");//追疯子
        list3.add("csz");//草傻子
        int k=0;
        for(String i:list3)
        {
            System.out.println("list3("+k+")="+i);
            k++;
        }
        System.out.println("---------");

//List集合子类
//        ArrayList:底层数据结构师叔祖，查询快，增删慢
//        LinkedList:地城数据结构是链表，查询慢，增删快
        LinkedList<String> linkedList=new LinkedList<String>();
        linkedList.add("hello");
        linkedList.add("world");
        linkedList.add("java");
        for(String s:linkedList)
        {
            System.out.println(s);
        }

//LinkedList集合的特有功能
        LinkedList<String> linkedList1=new LinkedList<String>();
        linkedList1.add("cxk");
        linkedList1.add("xz");
        linkedList1.add("yyqx");
        System.out.println(linkedList1);

        //public void addFirst(E e) :在该列表开头指定指定的元素
        linkedList1.addFirst("dz");

        //public void addLast(E e):将指定的元素追加到此列表的末尾
        linkedList1.addLast("gal");

        //public E getFirst():返回此列表的第一个元素
        System.out.println(linkedList1.getFirst());

        //public E getLast():返回此列表的最后一个元素
        System.out.println(linkedList1.getLast());

        //public E removeFirst():从此列表删除并返回第一个元素
        System.out.println(linkedList1.removeFirst());
        System.out.println(linkedList1.getFirst());

        //public E removeLast():从此列表中删除并返回最后一个元素
        System.out.println(linkedList1.removeLast());
        System.out.println(linkedList1.getLast());

        System.out.println("---------");
//Set集合
        //特点：1.不包含重复元素的集合 2.没有带索引的方法，所以不能用普通for循环遍历
        //HashSet对迭代顺序不做任何保证（可能乱序）
        Set<String> set=new HashSet<String>() ;
         set.add("hello");
         set.add("world");
         set.add("java");
         set.add("java");

         //遍历
        for(String s:set)
        {
            System.out.println(s);
        }

//哈希值：是JDK根据对象的地址或者字符串或者数字算出来的int类型的数值
        student s1=new student();
        s1.age=20;
        s1.school="BUPT";
        System.out.println(s1.hashCode());//同一个对象多次调用hashCode()方法返回的哈希值是相同的

        student s2=new student();
        s2.age=20;
        s2.school="BUPT";
        System.out.println(s2.hashCode());//默认情况下（没有重写哈希值，使用默认的Objec类里面的哈希值），不同对象的哈希值是不相同的
        HashSet<String> hs =new HashSet<String>();
        //添加元素
        hs.add("hello");
        hs.add("world");
        hs.add("java");
        hs.add("java");
        //遍历
        for(String s:hs)
        {
            System.out.println(s);//不保证顺序，不重复
        }

        HashSet<String> hase=new HashSet<>();
        hase.add("nima");
        System.out.println(hase);

//LinkedHashSet集合
        //哈希表和链表实现的Set接口，具有而可预测的迭代次序
        //有链表保证元素有序，也就是说元素的存储和取出顺序是一样的
        //由哈希表保证元素唯一，也就是说没有可重复的元素
        LinkedHashSet<String> lhs=new LinkedHashSet<String>();
        //添加元素
        lhs.add("hello");
        lhs.add("world");
        lhs.add("java");
        lhs.add("world");
        //遍历集合
        for(String s:lhs)
        {
            System.out.println(s);
        }
        System.out.println("---------");

//TreeSet
        //1.元素有序：不是按照存储和取出的顺序，而是按照一定的规则排序
//        TreeSet():按照其元素的自然排序进行排序
//        TreeSet(Comparator,Comparator):按照指定的比较器进行排序
        //2.没有带索引的方法，所以不能用普通for循环遍历
        //3.由于是Set集合，所以不包含重复元素的集合

        TreeSet<String> ts=new TreeSet<String>();
        ts.add("hello");
        ts.add("world");
        ts.add("java");
        ts.add("world");
        //遍历
        for(String s:ts)
        {
            System.out.println(s);
        }
        System.out.println("--------");

//自然排序Comparable
        //该接口对实现他的每个类的对象强加一个整体排序
        //假设Student类，就需要public class Student implements Comparable<Student(泛型）> ,然后在类里面重写compareTo方法：public int compareTo(Student s){return 1;}1会按照存储顺序输出，0只输出第一个，-1逆序输出。
        // 比较其它的在重写里用this来比较：比如int num=this.age-s.age（this代表上一个数）;（升序，this在后面则逆序）  return num;

//Comparator比较器排序
        TreeSet<student> ts3=new TreeSet<student>(new Comparator<student>()
        {@Override
            public int compare(student s1,student s2){
            int num=s1.getAge()-s2.getAge();
            int num2=num==0?s1.getName1().compareTo(s2.getName1()):num;
            return num2;
        }
        });
        //创建对象
        student stu1=new student();
        student stu2=new student();
        student stu3=new student();
        stu1.age=20;
        stu2.age=40;
        stu3.age=30;//P247
        stu1.name="sq";
        stu2.name="plg";
        stu3.name="pjy";
        //把对象添加到集合
        ts3.add(stu1);
        ts3.add(stu2);
        ts3.add(stu3);

        for(student s:ts3)
        {
            System.out.println(s.getName1()+"的年龄是"+s.getAge());
        }
        System.out.println("--------");

//泛型
        //参数化类型:简化类型由原来的具体的类型参数化，然后在使用/调用时窜入具体的数值
        //这种参数类型可以用在类、方法和接口中，分别被称为泛型类、泛型方法、泛型接口
//        泛型定义格式：<类型>指定一种类型的格式。这里的类型可以看成形参。
//        <类型1，类型2..>:指定多种类型的格式，多种类型之间用逗号隔开。这里的类型可以看成是形参
//        将来具体调用时候给定的类型可以看成是实参，并且实参的类型只能是引用数据类型。
          //案例:Collection 集合存储字符串并遍历
        //Collection co =new ArrayList();没用泛型的我就注释掉
        Collection<String>co=new ArrayList<String>();
        co.add("hello");
        co.add("world");
        co.add("java");
        //co.add(100);
        Iterator ite =co.iterator();
        while (ite.hasNext()) {
            //String ss=(String)ite.next();
            String ss = (String)ite.next();
            System.out.println(ss);
        }
        System.out.println("----------");
        //泛型类的定义格式：修饰符 class 类名 <类型>{}
//      范例:public class Generic<T>{}
        Generic<String> g1=new Generic<String>();
        g1.setT("道难");
        System.out.println(g1.getT());

        Generic<Integer> g2=new Generic<Integer>();
        g2.setT(55);
        System.out.println(g2.getT());
        System.out.println("---------");

//泛型类、泛型方法:用T来代替所有数据类型->fanxing.Generic
        Generic g=new Generic();
        g.show("daonan");
        g.show(55);
        g.show(true);
        g.show(114.514);
        System.out.println("--------");

//泛型接口->fanxing.Generic2
        Generic2 g3=new Generic2Impl();
        g3.showshowway("小仙女");
        g3.showshowway(1919810);
        g3.showshowway(false);
        System.out.println("--------");

//类型通配符<?> 为了表示各种泛型List的父类，可以使用类型通配符
//        List<?>:表示元素未知的List，他的元素可以匹配任何的类型
//        这种带通配符的List仅表示他是各种泛型List的父类，并不能把元素添加到其中
//        类型通配符上限：<?extends 类型> 比如List<?extends Number> ：他表示的类型是Number或其子类型
//        类型通配符下限：<?super 类型> 比如List<?super Number> ：他表示的类型是Number或其父类型
        List<?> li1=new ArrayList<Object>();
        List<?> li2=new ArrayList<Number>();
        List<?> li3=new ArrayList<Integer>();
        //类型通配符上限：<?extends 类型>
        List<?extends Number> li5=new ArrayList<Number>();
        List<?extends Number> li6=new ArrayList<Integer>();
        //List<?extends Number> li7=new ArrayList<Object>();后面的类型应该跟前面一样或者是他的子类型（比他小）,前面是上限
        //类型通配符下限：<?super 类型>
        List<?super Number> li8=new ArrayList<Object>();
        List<?super Number> li9=new ArrayList<Number>();//前面的是下限，应该小于等于后面的

//可变参数(参数个数不固定时） 格式：修饰符 返回值类型 方法名（数据类型... 变量名）{}：public static int sum(int...a){},写在Summarize类里面
       Summarize su =new Summarize();
       int tmpNum1=su.sum1(1,2,3,4,5,6);
       System.out.println(tmpNum1);
       int tmpNum2=su.sum2(1,2,3,4,5,6);//可变参数要放到最后面
        System.out.println(tmpNum2);
        //可变参数的使用

        //Arrays工具类中有一个静态方法：public static <T> List<T> aList(T...a):返回有指定数组支持的固定大小的列表
        List<String> lists1 = Arrays.asList("hello", "world", "java");
        //不能用add、remove（因为list集合长度固定不可变），可以用set（修改）
        System.out.println(lists1);

        //List接口中有一个静态方法:public static <E> List<E> of(E... elements):返回包含任意数量元素的不可变列表
        List<String> lists2 = List.of("hello", "world", "java");
        //不能用add、remove、set
        System.out.println(lists2);

        //Set接口中有一个静态方法:public static <E>Set<E> of(E...elements):返回一个包含任意数量元素的不可变集合
        Set<String> lists3 = Set.of("hello", "world", "java");
        //不能用add、remove，没有set
        System.out.println(lists3);
        System.out.println("---------");

//Map集合:Map<K,V>   K:键的类型。V：值的类型
        //将键映射到值的对象；不能包含重复的键；每个键可以映射到最多一个值
        //创建Map集合的对象：1.多态的方式 2.具体的实现类HashMap
        Map<String,String>map=new HashMap<String,String>();
        //V put(K key,V value)
        map.put("daonan","55");
        map.put("liyuan","55");
        System.out.println(map);//Map重写了toString方法
        map.put("liyuan","233");
        System.out.println(map);//键重复的时候，值会被后面的那个覆盖（修改），保证了Map的唯一性
        //v remove(Object key)根据键删除键值对应元素
        map.put("pjy","55");
        map.remove("233");
        System.out.println(map);
        System.out.println("---------");

        //boolean containsKey (Object Key) 判断集合是否包含指定的值
        System.out.println(map.containsKey("daonan"));
        System.out.println("---------");

        //boolean containsValue(Object value)判断集合是否包含指定的值
        System.out.println(map.containsValue("55"));
        System.out.println("---------");

        //int size()集合的长度，也就是集合中键值对的个数
        System.out.println(map.size());
        System.out.println("---------");

        //void clear（）移除所有的键值对元素
        map.clear();

        //boolean isEmpty()判断集合是否为空
        System.out.println(map.isEmpty());


        map.put("daonan","55");
        map.put("liyuan","55");
        map.put("pjy","233");
        //V get(Object key)根据键获取值
        System.out.println(map.get("daonan"));
        System.out.println("---------");

        //Set<K> keySet()获取所有键的集合
        Set<String> keySet =map.keySet();
        for(String s :keySet)
            System.out.println(s);
        System.out.println("---------");

        //Collection<V> values() 获取所有值的集合
        Collection<String> values =map.values();
        for(String s:values)
            System.out.println(s);
        System.out.println("---------");

        //Set<Map.Entry<K,V>>entrySet() 获取所有键值对对象的集合
        Set<Map.Entry<String,String>> entrySet=map.entrySet();
        for(Map.Entry<String,String> eS:entrySet)
        {
            String key = eS.getKey();
            String value = eS.getValue();
            System.out.println("key:"+key+" "+"value:"+value);
        }

//Collections 他的方法全是static修饰的
        List<Integer> listt = new ArrayList<Integer>();
        listt.add(30);
        listt.add(20);
        listt.add(10);
        listt.add(55);
//        public static <T extends Comparable<?super T>>void sort (List<T> list); 将指定的列表按升序排序
         Collections.sort(listt);
         System.out.println(listt);
         System.out.println("---------");
//        public static void reverse (List<?> list); 反转指定列表中元素的值
        Collections.reverse(listt);
        System.out.println(listt);
        System.out.println("----------");
//        public static void shuffle(List<?> list); 使用默认的随即元随机排列指定的列表
        Collections.shuffle(listt);//模拟洗牌
        System.out.println(listt);
        System.out.println("----------");

//案例：模拟斗地主
        //创建牌盒
        ArrayList <String> array =new ArrayList<String>();
        //装牌
        String[] colors ={"方片","梅花","红桃","黑桃"};
        String[] numbers={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        for(String color:colors)
           for(String number :numbers)
                array.add(color+number);
        array.add("小王");
        array.add("大王");
        //洗牌
        Collections.shuffle(array);
        ArrayList<String> daonan =new ArrayList<String>();
        ArrayList<String> liyuan =new ArrayList<String>();
        ArrayList<String> pjy=new ArrayList<String>();
        ArrayList<String> dipai =new ArrayList<String>();
        //发牌
        for(int i=0;i<array.size();i++)
        {
            String poker =array.get(i);
            if(i>=array.size()-3) //最后三张做底牌
                dipai.add(poker);
            else if(i%3==0)
                daonan.add(poker);
            else if(i%3==1)
                liyuan.add(poker);
            else if(i%3==2)
                pjy.add(poker);
        }

        //看牌->doudizhu包 kanpai类
        kanpai.lookPoker("道难",daonan);
        kanpai.lookPoker("离鸢",liyuan);
        kanpai.lookPoker("七姐",pjy);
        kanpai.lookPoker("底牌",dipai);

        //斗地主排序版（看起来更爽）
        //创建HashMap,键是编号，值是牌
        HashMap<Integer,String> hm=new HashMap<Integer,String >();
        //创建ArrayList，存储编号
        ArrayList<Integer> arrayy= new ArrayList<Integer>();
        //创建花色数组和点数数组
        String[] colors2 ={"方片","梅花","红桃","黑桃"};
        String[] numbers2={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        //从0开始往HashMap里面存储编号，并存储对应的牌。同时往ArrayList里面存储编号
        int index =0;
        for(String number :numbers2)
        {
            for(String color :colors2)
            {
                hm.put(index ,color+number);
                arrayy.add(index);
                index++;
            }
        }
        hm.put(index,"小王");
        arrayy.add(index++);
        hm.put(index,"大王");
        arrayy.add(index);
        //洗牌，洗的是编号，用Collections的shuffle()方法实现
        Collections.shuffle(arrayy);
        //发牌（发的也是编号，为了保证编号是排序的，创建TreeSet集合接收
        TreeSet<Integer> daonanSet =new TreeSet<Integer>();
        TreeSet<Integer> liyuanSet =new TreeSet<Integer>();
        TreeSet<Integer> pjySet =new TreeSet<Integer>();
        TreeSet<Integer> dipaiSet =new TreeSet<Integer>();

        for(int i=0;i<arrayy.size();i++)
        {
            int x=arrayy.get(i);//集合中的索引
            if(i>=arrayy.size()-3)
                dipaiSet.add(x);
            else if(i%3==0)
                daonanSet.add(x);
            else if(i%3==1)
                liyuanSet.add(x);
            else if(i%3==2)
                pjySet.add(x);
        }
        //看牌
        kanpai2.lookPokers("道难",daonanSet,hm);
        kanpai2.lookPokers("离鸢",liyuanSet,hm);
        kanpai2.lookPokers("七姐",pjySet,hm);
        kanpai2.lookPokers("底牌",dipaiSet,hm);
    }
}
*/



//                      二十六，IO流
/*
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) throws IOException {
//File:文件和目录路径名的抽象表示
        //文件和目录是可以通过File封装成对象的。
        //对于File而言，其封装的并不是一个真正存在的文件，仅仅是一个路径名而已。他可以是存在的，也可以是不存在的
        //将来是要通过具体的操作把这个路径的内容转换为具体存在的
        //三种构造方法
        //File(String pathname)通过将给定的路径名字符串转换为抽象路径来创建新的File实例
        File f1 = new File("E:\\javaCeshi\\java.txt");
        System.out.println(f1);//输出了路径，说明重写了toString方法

        //File(String parent,String child)从父路径名字符串和子路径名字符串创建新的File实例
        File f2 = new File("E:\\javaCeshi", "java.txt");
        System.out.println(f2);//也是输出路径，说明封装的就是这个文件

        //File（File parent，String child）从复仇想路径名和子路径名字符串创建新的File实例
        File f3 = new File("E:\\javaCeshi");
        File f4 = new File(f3, "java.txt");
        System.out.println(f4);

        //File类创建功能
        //public boolean createNewFile() 当具有该名称的文件不存在时，创建一个由该抽象路径名命名的新空文件
        File f11 = new File("E:\\javaCeshi\\java.txt");
        System.out.println(f11.createNewFile());//存在false，不存在就创建并true

        //public boolean mkdir() 创建由此抽象路径名命名的目录
        File f22 = new File("E:\\javaCeshi\\javaSE");
        System.out.println(f22.mkdir());//存在false，不存在就创建并true

        //public boolean mkdirs() 创建由此抽象路径名命名的目录，包括任何必须但不存在的父目录（创建多级目录）
        File f33 = new File("E:\\javaCeshi\\javaWeb\\狗都不学");
        System.out.println(f33.mkdirs());
        System.out.println("---------");

        //File类判断和获取功能
//        public boolean isDirectory() 测试此抽象路径表示的File是否为目录
        File f5 = new File("E:\\javaCeshi");
        System.out.println(f5.isDirectory());
//        public boolean isFile() 测试该抽象路径名表示的File是否为文件
        File f6 = new File("E:\\javaCeshi\\java.txt");
        System.out.println(f6.isFile());
//        public boolean exists() 测试该抽象路径名表示的File是否存在
        File f7 = new File("E:\\javaCeshi\\javaWeb");
        System.out.println(f7.exists());
//        public String getAboslutePath() 返回此抽象路径名的绝对路径名字符串
        File f8 = new File("E:\\javaCeshi\\javaSE");
        System.out.println(f8.getAbsoluteFile());
//        public String getPath() 将此抽象路径名转换为路径名字符串
        File f9 = new File("E:\\javaCeshi\\javaWeb");
        System.out.println(f9.getPath());
//        public String getName() 返回由此抽象路径名表示的文件或目录的名称
        File f10 = new File("E:\\javaCeshi\\java.txt");
        System.out.println(f10.getName());
//        public String[] list() 返回此抽象路径名表示的目录中的名称字符串数组
        File f12 = new File("E:\\javaCeshi");
        String[] strArray = f12.list();
        for (String s : strArray)
            System.out.println(s);
//        public File[] listFiles() 返回此抽象路径表示的目录中的文件的File对象数组
        File[] fileArray = f12.listFiles();
        for (File f : fileArray)
            System.out.println(f);
        //public boolean delete() 删除有此抽象路径名表示的文件或者目录
        File  f13 =new File("E:\\javaCeshi\\javaWeb\\狗都不学");//如果一个目录中有内容（目录，文件），不能直接删除，要把每个子内容、子目录全删了才可以删父目录
        System.out.println(f13.delete());

        //绝对路径：完整的路径名，不需要任何其他信息就可以定位他所表示的文件，例如E:\\javaCeshi\\java.txt;
        //相对路径：必须使用取自其他路径名的信息进行解释。例如myFile\\java.txt

//字节流
        //IO流：（输入/输出，Input Output），流是一种对数据传输的总称，流的本质是数据传输
        //1.按数据的流向（输入流（读），输出流（写）） 2.按照数据类型来分，字节流、字符流。一般说IO流是按数据类型来划分的
        //如果通过记事本打开，读的懂的叫字符流，读不懂的叫字节流。不知道用哪种就用字节流（万能的）

        //InputStream:这个抽象类是表示字节输入流的所有类的超类
        //OutputStream这个抽象类时表示字节输出流的所有类的超类
        //子类名特点：子类名称都是以其父类名作为子类名的后缀

//        FileOutputStream(String name):创建文件输出流以指定的名称写入文件
        FileOutputStream fos =new FileOutputStream("E:\\javaCeshi\\javaSE.txt");
        //1.创建文件2.创建字节输出流对象3.对象指向创建好的文件

        //字节流写数据的三种方式
        //1.void write(int b)将指定的字节写入此文件输出流
        fos.write(97);//->得到了一个a（转换成ascii码）
        //2.void write (byte[] b)将b.length字节从指定的自己数组写入此文件输出流。一次写一个字节数组数据
        byte[] b={97,98,99,100,101,102};
        byte[] bys ="abcde".getBytes();//返回字符串对应的int数组
        fos.write(b);
        fos.write(bys);
        //3.void write(byte[] b,in off int len)将len字节从指定的字节数组开始，从偏移量off开始写入此文件输出流，一次就写一个字节数组的部分数据
        fos.write(b,2,3);//b[2]开始，写三个

        //实现换行
        for(int i=0;i<10;i++)
        {
            fos.write("道难是55".getBytes());//也可以这么写
            fos.write("\r\n".getBytes());//win:\r\n ,linux:\r mac: \r
        }
        //实现追加写入,public FileOutputStream(String name,boolean append)y,如果第二个参数为true，字节将写入文件的末尾而非开头
        FileOutputStream fos2=new FileOutputStream("E:\\javaCeshi\\JvavHAHA.txt",true);
        for(int i=0;i<=5;i++)
        {
            fos2.write("道难是55".getBytes());
            fos2.write("\r\n".getBytes());
        }

        // 最后都要释放资源
        //void close()：关闭次文件输出流，并释放于此流相关联的任何系统资源
        fos.close();
        fos2.close();
        System.out.println("-----------");

//IO流异常处理
//        try{
//            可能出现异常的代码
//        }catch(异常类名 变量名){
//            异常的处理代码
//        }finally{             被finnaly控制的语句一定会执行，除非JVM退出
//            执行所有清除操作
//        }
        FileOutputStream fos3=null;
        try {
            fos3=new FileOutputStream("E:\\javaCeshi.java.txt");
            fos3.write("hello world".getBytes());
        }catch(IOException e)
        {
            e.printStackTrace();
        }finally {//一定会执行的
            fos3.close();
        }

//字节流读数据（一次读一个字节数据）
        FileInputStream fis=new FileInputStream("E:\\javaCeshi\\javaSE.txt");
        int by=fis.read();
        System.out.println(by);
        System.out.print((char)by);
        while((by=fis.read())!=-1)//如果读到空的就是-1
            System.out.print((char)by);
        fis.close();

        //案例：赋值文本文件
        FileInputStream fis1=new FileInputStream("E:\\javaCeshi\\javaSE.txt");
        FileOutputStream fos1=new FileOutputStream("E:\\javaCeshi\\java.txt");
        int by1=fis1.read();
        fos1.write(by1);
        while ((by1=fis1.read())!=-1)//读一个写一个
          fos1.write(by1);
        fis1.close();
        fos1.close();

//字节流读数据（一次读一个字节数组数据）
        FileInputStream fis2=new FileInputStream("E:\\javaCeshi\\java.txt");
        byte[] byts=new byte[6];
        //第一次读取数据
        int len=fis2.read(byts);
        System.out.println(len);
        System.out.println(new String(byts));
        //第二次读取数据
        len =fis2.read(byts);
        System.out.println(len);
        System.out.println(new String(byts,0,len));
        fis2.close();
        //复制粘贴一张图片
        FileInputStream fis3=new FileInputStream("E:\\javaCeshi\\ass.jpg");
        FileOutputStream fos4 =new FileOutputStream("E:\\javaCeshi\\ass副本.jpg");
        byte[] btt= new byte[1024];//这里记得改成1024
        int len1;
        while ((len =fis3.read(btt))!=-1) {//套路
            fos4.write(btt,0,len);
        }
        fos4.close();
        fis3.close();

//字节缓冲流:1.BufferedOutputStream(OutputStream out) 缓冲输出流。应用程序可以向底层输出流写入字节，而不必为写入的每个字节导致底层系统的调用
         //2.BufferedInputStream(InputStream in) 创建此将创建一个和内部缓冲区数组。当从六种读取或跳过字节时，内部缓冲区将根据需要从所包含的输入六种重新填充，一次很多字节
         //字节缓冲流仅仅提供缓冲区，而真正的读写数据还得依靠基本的字节流对象进行操作

        BufferedOutputStream bos1 =new BufferedOutputStream(new FileOutputStream("E:\\javaCeshi\\bos1.txt"));
        bos1.write("早八早八\r\n".getBytes("UTF-8"));
        bos1.write("   我日你妈".getBytes("UTF-8"));
        bos1.close();

        BufferedInputStream bis= new BufferedInputStream(new FileInputStream("E:\\javaCeshi\\bos1.txt"));
        int by2;
        while((by2=bis.read())!=-1){
            System.out.print((char)by2);
        }
        bis.close();
        System.out.println("");
        //复制视频的时候，用数据缓冲流一次读取一个字节数组的最快

//字符流： 字符流=字节流+编码表
        String s ="中国";
        byte[] byy1=s.getBytes("GBK");//一个汉字存储:GBK占2字节
        byte[] byy2=s.getBytes("UTF-8");//utf-8占3字节
        byte[] byy3=s.getBytes();
        System.out.println(Arrays.toString(byy1));
        System.out.println(Arrays.toString(byy2));//无论采用那种编码，第一个字节都是负数
        System.out.println(Arrays.toString(byy3));//说明默认GBK
        System.out.println();

        //编码表
        //1.将字符存储到计算机中称为编码，将存储在计算机中的二进制数按照某种规则解析出来称为解码。解码与编码得是同一种方式（字符集）
        //2.字符集有 ASCII字符集（美国信息交换标准代码），GBXXX字符集，Unicode字符集（统一码，为表达任意语言的任意字符，最常用的是UTF-8)

        //字符流写数据的方式
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("E:\\javaCeshi\\java.txt"));
        //void write(int c)写一个字符
        osw.write(97);
        //void flush() 刷新流,还可以继续写数据
        osw.flush();
        //void write(char[] cbuf,int off ,int len)
        osw.flush();
        char[] chs={'a','b','c','d','e'};
        osw.write(chs,0,chs.length);
        osw.close();//先刷新后关闭，后面就不能再写了

        //字符流读数据的两种方式
        InputStreamReader isr =new InputStreamReader(new FileInputStream("E:\\javaCeshi\\java.txt"));
        char[] chss=new char[1024];
        int lens;
        while ((len=isr.read(chss))!=-1)
        {
            System.out.println(new String(chss,0,len));
        }

        //案例：复制java文件
        InputStreamReader isrr=new InputStreamReader(new FileInputStream("E:\\javaCeshi\\ptsd.java"));
        OutputStreamWriter osww1 =new OutputStreamWriter(new FileOutputStream("E:\\javaCeshi\\ptsd副本1.java"));
        OutputStreamWriter osww2 =new OutputStreamWriter(new FileOutputStream("E:\\javaCeshi\\ptsd副本2.java"));
        //一次读写一个字符数据
        int ch;
        while((ch=isrr.read())!=-1) {
            osww1.write(ch);
        }
        //一次读写一个字符数组数据
        char[] chsss=new char[1024];
        int lent;
        while ((lent=isrr.read())!=-1) {
            osww2.write(chsss,0,lent);
        }

        //案例：复制java文件 升级版
        FileReader fr =new FileReader("E:\\javaCeshi\\ptsd.java");
        FileWriter fw =new FileWriter("E:\\javaCeshi\\ptsd副本3.java");
        char[] chs3=new char[1024];
        int lens2;
        while((lens2=fr.read(chs3))!=-1)
        {
            fw.write(chs,0,lens2);
        }
        fr.close();
        fw.close();

        //字符缓冲流
        //案例：复制单级文件夹

        File srcFolder =new File("E:\\javaCeshi\\javaSE");//创建数据源目录File对象，路径是E:\\javaCeshi\\javaSE
        String srcFolderName=srcFolder.getName();//获取数据源目录File对象的名称（javaSE）
        File destFolder =new File("E:\\javaCeshi",srcFolderName);//创建目的地目录File对象，路径名是模块名+javaSE组成（E:\\javaCeshi\\javSE)
        if(!destFolder.exists())
        {
            destFolder.mkdir();
        }
        File[] listFiles=srcFolder.listFiles();//获取数据源目录下所有文件的File数组
        for(File srcFile:listFiles)//遍历
        {
            String srcFileName =srcFile.getName();//数据源文件：E:\\javaCeshi\\javaSE\\dog.txt. 获取数据源文件的名称（dog.txt)
            File destFile =new File(destFolder,srcFileName);//创建目的地文件File对象，路径名是目的地目录+dog.txt组成
            copyFile(srcFile,destFile);
        }

//标准输入流 public static final InputStream in标准输入流。通常该留对应于键盘书入或有主机环境或用户指定的另一个输入源
        InputStream is =System.in;
        int byr;
        int oo=0;
        while((byr=is.read())!=-1&&oo<3)
        {
            System.out.print((char)byr);
            oo++;
        }

        //如何把字节流转换为字符流？用转换流
        InputStreamReader isr2 =new InputStreamReader(is);
        //使用字符流可不可以实现一次读取一行数据呢？可以
        //但是，一次读取一行数据的方法是字符缓冲输入流的特有方法
        //省略一大堆。。。最简洁就是这个
        Scanner sc=new Scanner(System.in);

//标准输出流:public static final PrintStream out;
        PrintStream ps =System.out;
        ps.println("Hello");
        ps.print(100);

    }

    private static void copyFile(File srcFile, File destFile) throws IOException {
        BufferedInputStream bis =new BufferedInputStream(new FileInputStream(srcFile));
        BufferedOutputStream bos =new BufferedOutputStream(new FileOutputStream(destFile));

        byte[] bys =new byte[1024];
        int len;
        while((len=bis.read(bys))!=-1)
        {
            bos.write(bys,0,len);
        }
        bos.close();
        bis.close();
    };
}*/



//                        二十七、网络编程
/*
import java.net.DatagramSocket;
import java.net.DatagramPacket;
//网络编程入门：在网络通信协议下，实现网络互联的不同计算机上运行的程序间可以进行数据交换



//IP地址：网络中计算机的设备标识
       //IPv4:32bit(4字节，8位2进制），把4个8位2进制换成十进制的4个📕，用 . 隔开，称为点分十进制表示法
       //IPv6：128bit，16个字节一组，分成8组十六进制数
       //常用命令：ipconfig， ping 。 特殊ip地址：127.0.0.1.是回送地址，可以代表本机地址，一般用来测试用

       //InetAddress:此类表示哦Inernet协议（IP）地址
public class test1{
    public static void main(String[] args) throws IOException {
        //static InetAddress getByName(String host):确定主机名称的IP地址。主机名称可以是主机名称，也可以是ip地址
        InetAddress address = InetAddress.getByName("DESKTOP-ITE3A5O");

        //public String getHostNmae(); 获取此IP地址的主机名
        String name = address.getHostName();

        //public String getHostAdress() 返回文本显示中的IP地址字符串
        String ip =address.getHostAddress();

        System.out.println("主机:"+address);
        System.out.println("主机名称:"+name);
        System.out.println("IP地址字符串:"+ip);

    //端口：端口是应用程序的标识
    // 两个字节表示的整数。取值范围为0~65535.期中0~1023之间的端口号用于一些知名的网络服务和应用，普通的需要使用1024以上的端口号。入宫端口号被另一个服务或应用占领，会导致当前程序启动失败

    //协议：计算机网络中，链接和通信的规则称为网络通信协议（UDP和TCP协议）
    //UDP（User DATagram Protocol）用户数据报协议，是无连接通信协议。消耗资源小，通信效率高，通常会用于音频，视频和普通数据的传输。但是由于UDP的面向无连接性，不能保证数据的完整性
    //TCP（Transmission Control Protocol)传输控制协议，是面向链接的通信协议，提供了两台计算机之间可靠无差错的数据传输。每次连接的创建都需要经过“三次握手”（在发送数据的准备阶段，客户端与服务器之间的三次交互，以保证连接的可靠），应用入上传/下载文件，浏览网页等

//UDP通信原理：他在通信的两端各建立一个Socket对象，但只是发送、接收数据的对象

        //UDP发送数据
        //DatagramSocket(int port) 构造数据包套接字并将其绑定到本地主机上的任何可用接口
        DatagramSocket ds= new DatagramSocket();
        //创建数据，并把数据打包：DatagramPacket(byte[] buf,int length,InetAddress address,int port)
        //构造一个数据包，发送长度为length的数据包发送到指定主机上的指定端口号
        byte[] bys ="BUPT_daonan55_UDP".getBytes();
//        int length=bys.length;
//        InetAddress address2 = InetAddress.getByName("192.168.2.11");
//        int port =10086;
//        DatagramPacket dp =new DatagramPacket(bys,length,address2,port);//太麻烦力
        DatagramPacket dp=new DatagramPacket(bys,bys.length,InetAddress.getByName("192.168.2.11"),10086);
        //调用DataGramSocket对象的方法发送数据:void send(DatagramSocket p)从此套接字发送数据包
        ds.send(dp);
        //void close() 关闭发送端


        //UDP接收数据
        //在UDPandTCP包下的UDP_send和UDP_receive两个类里面实现
        //以及一个类似聊天室的886案例

        //TCP接受数据
        //在UDPandTCP包下的TCP_send和TCP_receive两个类里面实现
        //以及一个传输文件的TCP案例（file）
    }
}*/



//                   二十八、Lambda表达式
//lambda表达式：其实就是java里的指针（指针可以作为一个参数传给一个方法）。Lambda表达式的核心就是函数式接口
//函数式接口内容主要写在func_interface软件包里面
/*
import Lambda.*;
import fangfaYY.Printable;
import fangfaYY.Student;
import fangfaYY.StudentBuilder;
import fangfaYY.*;
import fanxing.Summarize;

import java.util.*;

import javax.swing.plaf.TableHeaderUI;
import java.sql.SQLOutput;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class test1
{
    public static void main(String[] args) {
        //需求：启动一个线程，在控制台输出一句话：多线程程序启动力
        //实现类的方式实现需求
        MyRunnable my= new MyRunnable();
        Thread t =new Thread(my);
        t.start();

        //匿名内部类的方式改进
         new Thread(new Runnable() {
             @Override
             public void run() {
                 System.out.println("多线程程序启动力");
             }
         }).start();

        //lambda表达式的方式改进
        new Thread(()->
        {
            System.out.println("多线程程序启动力");
        }).start();
        //1.()里面没有内容，可以看成是方法形式参数为空
        //2.->.用箭头指向后面要做的事情（代表指向动作）
        //3.{}.包含一段代码，我们称之为代码块，可以看成还是方法体中的内容

        //在主方法中调用useEatable方法
        Eatable e =new EatableImpl();
        useEatable(e);

        //匿名内部类
        useEatable(new Eatable()
        {
            @Override
            public void eat()
            {
                System.out.println("好饿好饿好饿，我真的好饿2");
            }
        });

        //Lambda表达式
        useEatable(()->{
            System.out.println("好饿好饿好饿，我真的好饿3");
        });

        //Lambda表达式的省略形式
        useAddable((int x,int y)->{
            return x+y;
        });
        //参数的类型可以省略
        useAddable((x,y)->{
            return x+y;
        });
        useFlyable((s)->{
            System.out.println(s);
                });
        //如果代码块的语句只有一条，可以省略大括号和分号
        useFlyable(s-> System.out.println(s));

        //总结：Lambda 表达式和匿名内部类的区别
        //所需类型不同：匿名内部类可以是接口、抽象类、具体类。Lambda表达式只能是接口
        //使用限制不同：如果接口中有且只有一个抽象方法，可以使用Lambda

//接口组成更新(略）
//方法引用
//      usePrintable(s-> System.out.println(s));我们正常可以这么写
        //方法引用符 ::
        usePrintable(System.out::println);//直接把s参数传给了System.out.println方法
        //可推导的就是可省略的
        usePrintable(System.out::println);

//引用构造器：引用构造方法
        //格式：类名::new 。范例>Student::new
        //普通写法
        useStudentBuilder((String  name ,int age)->{
            return new Student(name,age);
        });
        //引用构造器写法
        useStudentBuilder(Student::new);

//函数式接口：有且仅有一个方法的抽象函数
        MyInterface myIF =()-> System.out.println("函数式接口");
        myIF.show();
        //函数式接口作为方法的参数
        startThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+" Thread start1!");
            }
        });
        startThread(()-> System.out.println(Thread.currentThread().getName()+"Thread start2!"));
//常用的函数式接口:在java.util.function包下面
        //Supplier接口（get方法）
        String ss=getString(()->{
            return "liyuan";
        });
        System.out.println(ss);

        //Consumer接口（accept方法）
        operatorString("daonan",s-> System.out.println(s));
        operatorString("daonan",s-> System.out.println(new StringBuilder(s).reverse().toString()));
        System.out.println("----------");
        operatorString("daonan",s-> System.out.println(s),s->System.out.println(new StringBuilder(s).reverse().toString()));//这个就相当于把上面两行和起来了

}
    private static void useEatable(Eatable e) {
       e.eat();
        System.out.println("woca");
   }
   private static void useFlyable(flyable f) {
       f.fly("hello bird");
   }
   private static void useAddable(Addable a) {
       int sum=a.add(10,20);
       System.out.println(sum);
   }
   private static void usePrintable(Printable p) {
       p.printString("I love Java");

   }
   private static void useStudentBuilder (StudentBuilder sb) {
       Student s = sb.build("daonan", 18);
       System.out.println(s.getName()+","+s.getAge());
   }
   private static void startThread(Runnable r) {
       new Thread(r).start();
   }
   //定义一个方法，返回一个字符串数据
    private static String getString (Supplier<String> sup){
        return sup.get();
    }
   //定义一个方法，消费一个字符串数据
    private static void operatorString(String name, Consumer<String> con) {
        con.accept(name);
    }
    //定义一个方法，用不同的方式消费同一个字符串数据两次
    private static void operatorString(String name,Consumer<String> con1,Consumer<String> con2) {
        con1.accept(name);
        con2.accept(name);
    }
*/
//stream流 （略）
import fangfaYY.Student;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
//                         二十九：反射
/*
//类加载：当程序要使用某个类时，如果该类还未被加载到内存中，则系统会通过类的加载，类的链接，类的初始化这三个步骤来对类进行初始化。这三个步骤称为类加载或者类初始化
//1.类的加载：指将class文件读入内存，并为之创建一个Java.lang.Class 对象
//2.类的连接：验证->准备->解析
//3.类的初始化：对类变量进行初始化。(jvm最先初始化的是java.lang包下的Object类)

//类加载器：1.负责将.class文件加载到内存中，并为之生成对应的java.lang.Class对象
// jvm的加载机制：全盘负责，父类委托，缓存机制
public class test1
{
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //static ClassLoader getSystemClassLoader()返回哦那个与委派的系统类加载器
        ClassLoader c1 = ClassLoader.getSystemClassLoader();
        System.out.println(c1);//AppClassLoader

        //ClassLoader getParent()返回父类加载器进行委派
        ClassLoader c2 = c1.getParent();
        System.out.println(c2);//PlatformClassLoader

        ClassLoader c3 = c2.getParent();
        System.out.println(c3);//null，因为PlatformClassLoader没有父null


//反射：在运行时获取一个类的变量和方法信息，然后通过获取到的信息来创建对象，调用方法的一种机制
        //由于这种动态性，可以极大地增强程序的灵活性，程序不用在编译期就完成确定，在运行期仍然可以拓展

        //获取Class对象
        //1.使用类的class属性来获取该类对应的Class对象
        Class<Student> c4 =Student.class;
        System.out.println(c4);//class fangfaYY.Student
        //2.调用class的getClass()方法
        Student s = new Student();
        Class<?extends Student> c5=s.getClass();
        System.out.println(c4==c5);
        //3.使用Class类中的方法forName（String className）
        Class<?> c6= Class.forName("fangfaYY.Student");
        System.out.println(c4==c6);
        System.out.println("------------");

//反射获取构造方法并使用
        //获取Class对象
        Class<?> c =Class.forName("fangfaYY.Student");
        //Constructor<?> getConstructors () 返回一个包含Constructor对象的数组，Constructor对象反映了由该Class对象表示的类的所有公共构造函数
        Constructor<?>[] cons = c.getDeclaredConstructors();
        for(Constructor  con:cons ) {
            System.out.println(con);
        }
        System.out.println("--------");

        //Constructor<T> getConstructor(Class<?>... parameterTypes)返回一个Constructor对象，该对象反映由该
        Constructor<?> con =c.getConstructor();
        Object obj =con.newInstance();
        System.out.println(obj);
    }
}*/


//                        三十:模块化



