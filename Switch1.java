public class Switch1
{
    public static void main(int ch, int a, int b)
    {
        int r;
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        
        switch(ch)
        {
            case 1:r=a+b;
            System.out.println("Addition:"+r);
            break;
            case 2:r=a-b;
            System.out.println("Subtraction:"+r);
            break;
            case 3: r=a*b;
            System.out.println("Multiplication:"+r);
            break;
            
            default:System.out.println("Wrong choice.. Very BAD");
        }
    }
}
        