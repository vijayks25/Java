public class Alphabetical
{
    public static void main(String s)
    {
        int i,len,j;
        char ch,chr;
        len=s.length();
        for(j=65;j<=90;j=j+1)
        {
            chr=(char)j;
            for(i=0;i<len;i=i+1)
            {
                ch=s.charAt(i);
                if(chr==ch)
                System.out.print(chr);
            }
        }
    } //Input a string in captial letters and arrange the string in alphabetical order
}