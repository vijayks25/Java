public class Pracs
{
    void Word_com(String str)
    {
        String s1="", s2="", word="", word1="";
        int i,j,l,d;
        char ch,ch1,ch2,ch3;
        l=str.length();
        str=str.toUpperCase();
        ch=str.charAt(l-1);
        if(ch=='.' || ch=='?' || ch=='!')
        {
            for(i=0;i<l;i=i+1)
            {
                ch1=str.charAt(i);
                if(ch1=='.' || ch1=='?' || ch1=='!')
                {
                    s2=str.substring(i+1);
                    s1=str.substring(0,i+1);
                    break;
                }
            }
            System.out.println(s1);
            System.out.println(s2);
            s1=s1+" ";
            s2=s2+" ";
            System.out.println();
            System.out.println("Common Word \t Frequency");
            for(i=0;i<s1.length();i=i+1)
            {
                ch2=s1.charAt(i);
                if(ch2!=' ')
                    word=word+ch2;
                else
                {
                    d=1;
                    for(j=0;j<s2.length();j=j+1)
                    {
                        ch3=s2.charAt(j);
                        if(ch3!=' ')
                            word1=word1+ch3;
                        else
                        {
                            if(word.equalsIgnoreCase(word1))
                                d=d+1;
                            word1="";
                        }
                    }
                    if(d>1)
                    {
                        System.out.println(word+"\t\t\t"+d);
                        word="";
                    }
                }
            }
        }
        else
            System.out.println("Invalid Input");
    }
}