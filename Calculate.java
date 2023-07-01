public class Calculate
{
    double Ar;
    void area(int s)
    {
        Ar=s*s;
        System.out.println("Area of square:"+Ar);
    }

    void area(int l, int b)
    {
        Ar=l*b;
        System.out.println("Area of Rectangle:"+Ar);
    }

    void area(double b, double h)
    {
        Ar=(b*h)/2;
        System.out.println("Area of Triangle:"+Ar);
    }

    public static void main()
    {
        Calculate obj= new Calculate();
        obj.area(9);
        obj.area(5,10);
        obj.area(6.0,10.0);
    }
}