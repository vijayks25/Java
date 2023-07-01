public class Bin_Search
{
    public static void main(int a[], int num)
    {
        int len=a.length;
        int beg=0,last=(len-1),mid,p=-1;
        while(beg<=last)
        {
            mid=(beg+last)/2;
            if(num==a[mid])
            {
                p=mid;
                break;
            }
            else if(num>a[mid])
            beg=mid+1;
            else
            last=mid-1;
        }
        if(p>-1)
        System.out.println("Number found at:"+p);
        else
        System.out.println("Number not found");
    }
}