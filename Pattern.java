public class Pattern
{
    public static void main(String s)
    {
        int i,len;
        len=s.length();
        for(i=0;i<len;i=i+1)
        {
            System.out.println(s.substring(0,i+1));
        }
        for(i=(len-1);i>=0;i=i-1)
        {
            System.out.println(s.substring(0,i+1));
        }
    }
}