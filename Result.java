public class Result
{
    int x,y,R;
    void input(int a, int b)
    {
        x=a;
        y=b;
    }

    void sum()
    {
        R=x+y;
    }

    void print()
    {
        System.out.println("Sum:"+R);
    }
    
    public static void main()
    {
        Result obj= new Result();
        obj.input(8,11);
        obj.sum();
        obj.print();
    }
}
 