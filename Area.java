public class Area
{
    int b,h,a;
    void input(int x, int y)
    {
        b=x;
        h=y;
    }

    void result()   
    {
        a=(b*h)/2;
    }

    void print()
    {
        System.out.println("Area:"+a);
    }

    public static void main()
    {
        Area obj= new Area();
        obj.input(8,10);
        obj.result();
        obj.print();
    }
}

    
