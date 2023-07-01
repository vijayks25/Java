public class Report
{
    int rn,h,e,total;

    Report(int a, int b, int c)
    {
        rn=a;
        h=b;
        e=c;
        total=0;
    }

    void calculate()
    {
        total=h+e;
    }

    void print()
    {
        System.out.println("total="+total);
    }

    public static void main()
    {
        Report obj=new Report(2,70,80);
        obj.calculate();
        obj.print();
    }
}