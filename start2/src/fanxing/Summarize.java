package fanxing;

public class Summarize {
    public static int sum1(int ...a)//这里的a其实是个数组
    {
       int sum=0;
//        for(int i=0;i<a.length;i++)
//            sum+=a[i];
        for(int i:a)
          sum+=i;
        return sum;
    }

    public static int sum2(int b,int...a)
    {
        int sum=b;
        for(int i:a)
            sum+=i;
        return sum;
    }
}
