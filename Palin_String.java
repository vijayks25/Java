public class Palin_String
{
    public static void main(String s)
    {
        int i,len;
        char ch;
        String r="";
        len=s.length();
        for(i=(len-1);i>=0;i=i-1)
        {
            ch=s.charAt(i);
            r=r+ch;
        }
        if(s.equals(r))
            System.out.println("Palindrome String");
        else 
            System.out.println("Not a Palindrome String");
    } //Input a word and check for palindrome. For e.g. madam,nitin,etc.
}