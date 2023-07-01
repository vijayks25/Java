public class Special
{
    public static void main(int n)
    {
        int d,i, num=n, sum=0;
        while(n>0)
        {
            d=n%10;
            int f=1;
            for(i=1;i<=d;i=i+1)
            f=f*i;
            sum=sum+f;
            n=n/10;
        }
        if(num==sum)
        System.out.println("It's a special no.");
        else
        System.out.println("It's not a special no.");
    }
}
      