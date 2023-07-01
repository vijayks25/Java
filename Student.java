public class Student
{
    int Rn, h, e, m;
    String Sn;
    float avg;
    
    void enter(int a, int b, int c, int d, String f)
    {
        Rn=a;
        h=b;
        e=c;
        m=d;
        Sn=f;
    }
    void calavg()
    {
        avg=(h+e+m)/3;
    }
    void print()
    {
        System.out.println("Name:"+Sn);
        System.out.println("Average:"+avg);
    }
    
    public static void main()
    {
        Student obj= new Student();
        obj.enter(1,67,55,90, "Vijay");
        obj.calavg();
        obj.print();
    }
}
    
    
    