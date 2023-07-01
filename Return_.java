public class Return_
{
    void series()
    {
        int i,a=4;
        for(i=1; i<=40;i=i+1)
        {
            System.out.println(a);
            a=a+4;
        }
    }   

    void fact()
    {
        int i,f=1;
        for(i=1;i<=5;i=i+1)
        {
            f=f*i;
        }
        System.out.println("Factorial="+f);
    }

    void palindrome(int n)
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

    void special(int n)
    {
        int d,i, num=n, sum=0;
        while(n>0)
        {
            d=n%10;
            int f=1;
            for(i=1;i<=d;i=i+1)
                f=f*i;
            sum=sum+f;
            n=n/10;
        }
        if(num==sum)
            System.out.println("It's a special no.");
        else
            System.out.println("It's not a special no.");
    }

    void magic(int n)
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

    void arrange(int n)
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
        }
    }

    void prime(int n)
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

    void composite(int n)
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

    void series2(int n)
    {
        int i,a=4,b=2;
        double k, sum=0.0;
        for(i=1;i<=n;i=i+1)
        {
            k=(a/b);
            System.out.println(k);
            sum=sum+k;
            a=a+4;
            b=b+2;
        }
        System.out.println("Sum="+sum);
    }

    void sum(int n)
    {
        int d, sum=0, rev=0, count=0;
        while (n>0)
        {
            d=n%10;
            sum=sum+d;
            rev=rev*10+d;
            count=count+1;
            n=n/10;
        }
        System.out.println("Sum is:"+sum);
        System.out.println("Reverse number is:"+rev);
        System.out.println("No. of digits are:"+count);
    }

    void armstrong(int n)
    {
        int d, sum=0, num=n;

        while(n>0)
        {
            d=n%10;
            sum=sum+(d*d*d);
            n=n/10;
        }
        if(num==sum)
            System.out.println("No. is Armstrong");
        else
            System.out.println("No. is  not Armstrong");

    }

    void neon(int n)
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

    void automorphic(int n)
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

    void frequency(int n)
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
        }
    }

    void perfect(int n)
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

    void factors(int n)
    {
        int i;
        for(i=1;i<n;i=i+1)
        {
            if(n%i==0)

                System.out.println("Factors are:"+i);
        }
    }
}
 