public class Magic
{
    public static void main(int n)
    {
        int d;
        while(n>9)
        {
            int sum=0;

            while(n>0)
            {
                d=n%10;
                sum=sum+d;
                n=n/10;
            }
            n=sum;
        }
        if(n==1)
            System.out.println("It's a magic no.");
        else
            System.out.println("It's not a magic no.");
    }
}