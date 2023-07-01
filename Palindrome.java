public class Palindrome
{
    public static void main(int n)
    {
        int d, r=0, num=n;
        while(n>0)
        {
            d=n%10;
            r=r*10+d;
            n=n/10;
        }
        if(num==r)
        System.out.println("It's a Palindrome no.");
        else
        System.out.println("It's not a Palindrome no.");
    }
}