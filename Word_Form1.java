//Calculate the length of each word and count words starting with vowels.
public class Word_Form1
{
    public static void main(String str)
    {
        int i,len,lenw=0,c=0;
        char ch,chr;
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
                chr=w.charAt(0);
                if((chr=='A') ||(chr=='E') || (chr=='I') || (chr=='O') || (chr=='U'))
                {
                    System.out.println(w);
                    c=c+1;
                }
                w="";
            }
        }
        System.out.println("Number of words starting with vowels: "+c);
    }
}