//Print the longest word and shortest word.
public class Word_Form2
{
    public static void main(String str)
    {
        int i,len,lenw=0;
        char ch;
        String w="",s,lw="",sw="";
        s=str+" ";
        len=s.length();
        int max=0,min=len;
        for(i=0;i<len;i=i+1)
        {
            ch=s.charAt(i);
            if(ch!=' ')
                w=w+ch;
            else
            {
                lenw=0;
                lenw=w.length();
                if(lenw>max)
                {
                    max=len;
                    lw=w;
                }
                if(lenw<min)
                {
                    min=len;
                    sw=w;
                }
                w="";
            }
        }
        System.out.println(lw+"    " +max);
        System.out.println(sw+"    " +min);
    }
}