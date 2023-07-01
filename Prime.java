public class Prime
{
    public static void main(int n)
    {
        int i,c=0;
        for(i=1;i<=n;i=i+1)
        {
            if(n%i==0)

                c=c+1;
        }
        if(c==2)
            System.out.println("It's a prime number");
        else
            System.out.println("It's not a prime number");
    }
}

