public class Sum
{
    public static void main(int n)
    {
        int d, sum=0, rev=0, count=0;
        while (n>0)
        {
            d=n%10;
            sum=sum+d;
            rev=rev*10+d;
            count=count+1;
            n=n/10;
        }
        System.out.println("Sum is:"+sum);
        System.out.println("Reverse number is:"+rev);
        System.out.println("No. of digits are:"+count);
    }
}