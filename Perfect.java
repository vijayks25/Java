public class Perfect
{
    public static void main(int n)
    {
        int i,sum=0;
        for(i=1;i<n;i=i+1)
        {
            if(n%i==0)

                sum=sum+i;
        }
        if(sum==n)
            System.out.println("It's a perfect number");
        else
            System.out.println("It's not a perfect number");
    }
}

