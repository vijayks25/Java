import java.util.*;
public class Encryption
{
    public Encryption()
    {

    }

    String encrypt(String input, int key)
    {
        String res="";
        int alpha;// It stores the ascii value of the current element. 
        int replaceascii;// It stores the ascii value of the encrypted element. 
        char replace;// It stores the encrypted element.
        if (key>26)
        {
            key=key%26;
        }
        if (key==0)
        {
            return input;
        }
        for(int i=0;i<input.length();i=i+1)
        {
            alpha=(int)input.charAt(i);
            if(alpha>='A' && alpha<='Z')
            {
                replaceascii=alpha+key;
                if (replaceascii>'Z')
                {
                    replaceascii=replaceascii-'Z'+'A'-1;
                }
            }
            else if(alpha>='a' && alpha<='z')
            {
                replaceascii=alpha+key;
                if (replaceascii>'z')
                {
                    replaceascii=replaceascii-'z'+'a'-1;
                }
            }
            else
            {
                res=res+input.charAt(i);
                continue;
            }
            replace=(char)replaceascii;
            res=res+replace;
        }
        return res;
    }

    String ascii_Encrypt(String s)
    {
        String fin="";
        int replace;
        for(int i=0;i<s.length();i=i+1)
        {
            replace=s.charAt(i); 
            fin=fin+replace;
        }
        return fin;
    }

    String decrypt(String input, int key)
    {
        String res="";
        int alpha;// It stores the ascii value of the current element. 
        int replaceascii;// It stores the ascii value of the encrypted element. 
        char replace;// It stores the encrypted element.
        if (key>26)
        {
            key=key%26;
        }
        if (key==0)
        {
            return input;
        }
        for(int i=0;i<input.length();i=i+1)
        {
            alpha=(int)input.charAt(i);
            if(alpha>='A' && alpha<='Z')
            {
                replaceascii=alpha-key;
                if (replaceascii<'A')
                {
                    replaceascii='Z'-('A'-replaceascii)+1;
                }
            }
            else if(alpha>='a' && alpha<='z')
            {
                replaceascii=alpha-key;
                if (replaceascii<'a')
                {
                    replaceascii='z'-('a'-replaceascii)+1;
                }
            }
            else
            {
                res=res+input.charAt(i);
                continue;
            }
            replace=(char)replaceascii;
            res=res+replace;
        }
        return res;
    }

    char opp_val(int x)
    {
        char c=' ';
        c= (char)(x);
        return c;
    }

    String ascii_Decrypt(String s)
    {
        String fin="";
        char c=' ';
        int x=3;
        int temp=0;
        for(int i=0;i<s.length();i=i+3)
        {
            temp=Integer.parseInt(s.substring(i,x));
            c=opp_val(temp);
            fin=fin+c;
            x=x+3;
        }
        return fin;
    }

    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        Encryption e= new Encryption();
        int a;
        int x=-1;
        int option;
        while(x!=0)
        {
            System.out.println("Press 1 to encrypt");
            System.out.println("Press 2 to decrypt");
            System.out.println("Press 3 to ascii encrypt");
            System.out.println("Press 4 to ascii decrypt");
            System.out.println("Press 0 to exit");
            option = sc.nextInt();
            switch(option)
            {
                case 1:
                System.out.print("Please enter the String:");
                String s1=sc.next();
                System.out.print("Please enter the key:");
                a=sc.nextInt();
                String r1=e.encrypt(s1,a);
                System.out.println(r1);
                System.out.println();
                break;

                case 2:
                System.out.print("Please enter the String:");
                String s2=sc.nextLine();
                System.out.print("Please enter the key:");
                a=sc.nextInt();
                String r2=e.decrypt(s2,a);
                System.out.println(r2);
                System.out.println();
                break;

                case 3:
                System.out.print("Please enter the String:");
                String s3=sc.nextLine();
                String r3=e.ascii_Encrypt(s3);
                System.out.println(r3);
                System.out.println();
                break;

                case 4:
                System.out.print("Please enter the String:");
                String s4=sc.nextLine();
                String r4=e.ascii_Decrypt(s4);
                System.out.println(r4);
                System.out.println();
                break;

                case 0:
                x=0;
                break;

                default:
                System.out.println("Wrong input");
            }
        }
    }
}