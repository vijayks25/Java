//Calculate the length of each word and count words starting with vowels.
public class Word_Form
{
    public static void main(String str)
    {
        int i,len,lenw=0;
        char ch;
        String w="",s;
        s=str+" ";
        len=s.length();
        for(i=0;i<len;i=i+1)
        {
            ch=s.charAt(i);
            if(ch!=' ')
                w=w+ch;
            else
            {
                lenw=w.length();
                System.out.println(w+"      "+lenw);
                w="";
            }
        }
    }
}