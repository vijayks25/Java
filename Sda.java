import java.util.*;
public class Sda
{
    int a[];
    int n;
    Sda(int x)
    {
        n=x;
        a=new int[n];
    }

    void store()
    {
        Scanner obj= new Scanner (System.in);
        int i;
        System.out.println("Enter the list of array:");
        for (i=0;i<n;i=i+1)
            a[i]=obj.nextInt();
    }

    void display()
    {
        int i;
        for (i=0;i<n;i=i+1)
            System.out.println();
    }

    public static void main()
    {
        Scanner t=new Scanner(System.in);
        System.out.println("Enter the size:");
        int r=t.nextInt();
        {
            Sda OBJ=new Sda(r);
            OBJ.store();
            OBJ.display();
        }

    }
}
