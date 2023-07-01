public class Array3
{
    public static void main(int a[])
    {
        int i,l,max=a[0],min=a[0];
        l=a.length;
        for (i=1;i<l;i=i+1)
        {
            if (a[i]>max)
            max=a[i];
            else if(a[i]<min)
            min=a[i];
        }
        System.out.println("Max="+max);
        System.out.println("Min="+min);
    }
}