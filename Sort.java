public class Sort
{
    public int [] insert(int n,int [] l)
    {
        if(l.length==0)
        {
            return cons(n,l);
        }
        else if(n<head(l))
        {
            return cons(n,l);
        }
        else
        {
            return cons(head(l),insert(n,tail(l)));
        }
    }

    public int [] cons(int x,int [] l)
    {
        int [] nlist={};
        nlist = new int[l.length+1];
        for (int i=1;(i<l.length+1);i=i+1)
        {
            nlist[i] = l[i-1];
        }
        nlist[0] = x;
        return nlist;
    }

    public int head (int [] l)
    {
        return l[0];
    }

    public int [] tail(int [] alist)
    {
        int [] nlist;
        nlist=new int[alist.length-1];
        for(int i=0;i<(alist.length-1);i=i+1)
        {
            nlist[i]=alist[i+1];
        }
        return nlist;
    }

    public int [] insert_Sort(int [] l)
    {
        if(l.length<=1)
        {
            return l;
        }
        else
        {
            return insert(head(l),insert_Sort(tail(l)));
        }
    }
}