public class Sentence
{
    public static void main(String s)
    {
        int i,len,b=0;
        char ch;
        len=s.length();
        for(i=0;i<len;i=i+1)
        {
            ch=s.charAt(i);
            if(ch==' ')
                b=b+1;
        }
        int nw=b+1;
        System.out.println("Number of blank spaces:"+b);
        System.out.println("Number of words:"+nw);
    }

}