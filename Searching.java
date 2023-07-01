public class Searching
{
    public static void main(int a[], int num)
    {
        int i,p=-1,len;
        len=a.length;
        for(i=0;i<len;i=i+1)
        {
            if(num==a[i])
            {
                p=i;
                break;
            }
        }
        if(p>-1)
        System.out.println("Number found at:"+p);
        else
        System.out.println("Number not found");
    }
}