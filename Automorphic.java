public class Automorphic
{
    public static void main(int n)
    {
        int d, r=1, num=n, sq=(n*n);
        while(n>0)
        {
            d=n%10;
            r=r*10;
            n=n/10;
        }
        int s=sq%r;
        if(num==s)
            System.out.println("It's an automorphic no.");
        else
            System.out.println("It's not an automorphic no.");
    }
}
 