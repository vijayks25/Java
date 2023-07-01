//Function overloading with returning method.
public class Return
{
    double Ar;
    double area(int s)
    {
        Ar=s*s;
        return (Ar);
    }

    double area(double l, float b)
    {
        Ar=l*b;
        return (Ar);
    }

    double area(double b, double h)
    {
        Ar=(b*h)/2;
        return (Ar);
    }
}

    