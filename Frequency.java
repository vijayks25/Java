public class Frequency
{
    public static void main(int n)
    {
        int d,D;
        System.out.println("Digit:"+"   "+"Frequency:");
        for (d=9;d>=0;d=d-1)
        {
            int N=n, f=0;
            while(N>0)
            {
                D=N%10;
                if(d==D)
                f=f+1;
                N=N/10;
            }
            if(f>0)

                System.out.println(d+"   "+f);
        } // Print the frequency of each digit.
    }
}