public class Series2
{
    public static void main(int n)
    {
        int i,a=4,b=2;
        double k, sum=0.0;
        for(i=1;i<=n;i=i+1)
        {
            k=(a/b);
            System.out.println(k);
            sum=sum+k;
            a=a+4;
            b=b+2;
        }
        System.out.println("Sum="+sum);
    }
}