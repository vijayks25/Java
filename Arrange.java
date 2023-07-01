public class Arrange
{
    public static void main(int n)
    {
        int d,D;
        for (d=9;d>=0;d=d-1)
        {
            int N=n;
            while(N>0)
            {
                D=N%10;
                if(d==D)
                System.out.print(d);
                N=N/10;
            }
        } //Arrange the digits in descending order.
    }
}
    
