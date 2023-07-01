public class Armstrong
{
    public static void main(int n)
    {
        int d, sum=0, num=n;

        while(n>0)
        {
            d=n%10;
            sum=sum+(d*d*d);
            n=n/10;
        }
        if(num==sum)
            System.out.println("No. is Armstrong");
        else
            System.out.println("No. is  not Armstrong");

    }
}

