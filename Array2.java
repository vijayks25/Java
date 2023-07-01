public class Array2
{
    public static void main(int a[], int b[])
    {
        int c[]=new int [5];
        int i,l;
        l=a.length;
        for(i=0;i<l;i=i+1)
        {
            c[i]=a[i]+b[i];
        }
        
        for(i=0;i<l;i=i+1)
        {
            System.out.println(a[i]+"        "+b[i]+"        "+c[i]);
        }
    }
}