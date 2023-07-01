public class Neon
{
    public static void main(int n)
    {
        int d, N=(n*n),num=n,sum=0;
        while(N>0)
        {
            d=N%10;
            sum=sum+d;
            N=N/10;
        }
        if(num==sum)
        System.out.println("It's a neon number");
        else
        System.out.println("It's not a neon number");
    }
}
            
      