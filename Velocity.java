public class Velocity
{
    int v,u,a,t;
    void input(int x, int y, int z)
    {
        u=x;
        a=y;
        t=z;
    }

    void result()
    {
        v=u+(a*t);
    }

    void print()
    {
        System.out.println("Velocity="+v);
    }

    public static void main()
    {
        Velocity obj= new Velocity();
        obj.input(8,11,15);
        obj.result();
        obj.print();
    }
}
 