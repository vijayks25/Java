public class Merging
{
    public static void main(int m,int n, int a[], int b[])
    {
        int c[]=new int [m+n];
        int i;
        for(i=0;i<m;i=i+1)
        {
            c[i]=a[i];
        }
        for(i=0;i<n;i=i+1)
        {
            c[i+m]=b[i];
        }
        for(i=0;i<(m+n);i=i+1)
        {
            System.out.println(c[i]);
        }
    }
}