public class Array1
{
    public static void main(int a[])
    {
        int i,l;
        l=a.length;
        for(i=0;i<l;i=i+1)
        {
            System.out.println(a[i]);
        }
        int sum=0, pdt=1;
        for(i=0;i<l;i=i+1)
        {
            sum=sum+a[i]; 
            pdt=pdt*a[i];
        }
        System.out.println("Sum="+sum);
        System.out.println("Product="+pdt);

    }
}