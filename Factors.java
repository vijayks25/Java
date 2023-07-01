public class Factors
{
    public static void main(int n)
    {
        int i;
        for(i=1;i<n;i=i+1)
        {
            if(n%i==0)

                System.out.println("Factors are:"+i);
        }
    }
}