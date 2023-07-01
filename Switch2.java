public class Switch2
{
    public static void main(char ch, int l, int b, int h, int r )
    {
        double v;
        System.out.println("A.Volume of cuboid");
        System.out.println("B.Volume of cylinder");
        System.out.println("C.Volume of sphere");
        
        switch(ch)
        {
            case 'A':v=l*b*h;
            System.out.println("Volume of cuboid:"+v);
            break;
            case 'B':v=3.14*r*r*h;
            System.out.println("Volume of cylinder:"+v);
            break;
            case 'C':v=(4/3)*3.14*r*r*r;
            System.out.println("Volume of sphere:"+v);
            break;
            
            default:System.out.println("Wrong choice.. Very BAD");
        }
    }
}
        