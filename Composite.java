public class Composite
{
    public static void main(int n)
    {
        int i,c=0;
        for(i=2;i<n;i=i+1)
        {
            if(n%i==0)

                c=c+1;
        }
        if(c>=1)
            System.out.println("It's a composite number");
        else
            System.out.println("It's not a composite number");
    }
}

