public class Search implements Search_inter
{
    Search()
    {

    }

    public float linear_Search(float[] x, float key)
    {
        float f= x.length;
        for(int i=0;i<f;i=i+1)
        {
            if(x[i]==key)
            {
                return i;
            }
        }
        return -1;
    }

    public float binary_Search(float[]x, float key)
    {
        int start=0;                          
        int end=(x.length)-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(x[mid]==key)
            {
                return mid;
            }
            else if(key>x[mid])
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return -1;
    }
}