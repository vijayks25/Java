public class Rectangle
{
    int l,b,p;
    void input(int x, int y)
    {
        l=x;
        b=y;
    }

    void result()
    {
        p=2*(l+b);
    }

    void print()
    {
        System.out.println("Perimeter is:"+p);
    }

    public static void main()
    {   Rectangle obj= new Rectangle();
        obj.input(40,65);
        obj.result();
        obj.print();
    }
}
 