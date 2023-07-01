//In ascending > sign. Otherwise,<

public class Bubble_Sort
{
    public static void main(int a[])
    {
        int i,j,l,t;
        l=a.length;
        for (i=0;i<l;i=i+1)
        {
            for(j=0;j<(l-1)-i;j=j+1)
            {
                if(a[j]>a[j+1])
                {
                    t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        for(i=0;i<l;i=i+1)
        System.out.println(a[i]);
    }
}