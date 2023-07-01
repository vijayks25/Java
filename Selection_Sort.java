//In ascending > sign. Otherwise,<

public class Selection_Sort
{
    public static void main(int a[])
    {
        int i,j,l,t;
        l=a.length;
        for (i=0;i<l-1;i=i+1)
        {
            for(j=i+1;j<l;j=j+1)
            {
                if(a[i]>a[j])
                {
                    t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        }
        for(i=0;i<l;i=i+1)
        System.out.println(a[i]);
    }
}