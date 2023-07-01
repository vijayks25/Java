import java.util.*;
public class Truth_table
{
    public Truth_table()
    {

    }

    public char[][] t_Table(int x)
    {
        int row=(int)Math.pow(2,x);
        char[][]c=new char[row][x];
        for(int i=0;i<row;i=i+1)
        {
            for(int j=x-1;j>=0;j=j-1)
            {
                int num=(i/(int)Math.pow(2,j))%2;
                if(num==0)
                {
                    c[i][j]='f';                    
                }
                else
                {
                    c[i][j]='t';
                }
            }
        }
        return c;
    }

    public void print_Table(int x)
    {
        char [][]temp = t_Table(x);
        for(int i=0;i<temp.length;i=i+1)
        {
            for(int j=0;j<temp[0].length;j=j+1)
            {
                System.out.print(temp[i][j]+ "  ");
            }
            System.out.print("\n");
        }
        System.out.println();
    }

    public char [][] augment(char [][]c1, char [][]c2)
    {
        int x=c1.length;
        int y=c1[0].length+c2[0].length;
        char[][] f=new char[x][y];
        int temp=0;//This represents the column no. for c2
        for(int i=0;i<x;i=i+1)
        {
            for(int j=0;j<y;j=j+1)
            {
                if(j>=x)
                {
                    f[i][j]=c2[i][temp];
                    temp=temp+1;
                }
                else
                {
                    f[i][j]=c1[i][j];
                }
            }
            temp=0;
        }
        return f;
    }

    public int binTodec(int x)
    {
        int val=0;
        int p=0;
        while(true)
        {
            if(x==0)
            {
                break;
            }
            else
            {
                int temp=x%10;
                val=val+temp*(int)Math.pow(2,p);
                p=p+1;
                x=x/10;
            }
        }   
        return val;
    } 

    public void canoicalForm_SOP(String s, int n)//int n is for how many bits. 
    {
        String[]str = s.split(",");//This splits your string with reference to ','
        int temp;
        char[][]x=t_Table(n);// This char stores the gen ttable. 
        for(int i=0;i<s.length();i=i+1)
        {
            if (i>str.length-1)
            {
                return;
            }
            temp=Integer.parseInt(str[i]); //It takes a string and converts it into int form
            System.out.print("(");
            for(int j=0;j<x[0].length;j=j+1)// Going across rows
            {
                char alpha = (char)(65+j); //This generates the variable correspondant to the col.
                if (x[temp][j]=='t')
                {
                    System.out.print(alpha);
                }
                else if (x[temp][j]=='f')
                {
                    System.out.print(alpha+"'");
                }
            }
            System.out.print(")");
            if(i<str.length-1)
            {
                System.out.print("+");
            }
        }
        System.out.println();
    }

    public void canoicalForm_POS(String s, int n)//int n is for how many bits. 
    {
        String[]str = s.split(",");//This splits your string with reference to ','
        int temp;
        char[][]x=t_Table(n);// This char stores the gen ttable. 
        for(int i=0;i<s.length();i=i+1)
        {
            if (i>str.length-1)
            {
                return;
            }
            temp=Integer.parseInt(str[i]); //It takes a string and converts it into int form
            System.out.print("(");
            for(int j=0;j<x[0].length;j=j+1)// Going across rows
            {
                char alpha = (char)(65+j); //This generates the variable correspondant to the col.
                if (x[temp][j]=='t')
                {
                    System.out.print(alpha);
                }
                else if (x[temp][j]=='f')
                {
                    System.out.print(alpha+"'");
                }
                if(j<x[0].length-1)
                {
                    System.out.print("+");
                }
            }
            System.out.print(")");
            if(i<str.length-1)
            {
                System.out.print("*");
            }
        }
        System.out.println();
    }

    public void cardinalForm_SOP(String s)
    {
        String[]str=s.split("[+]");
        String temp;
        int l1=str.length;
        int l2=0;
        String ans="";
        int x;
        for(int i=0;i<l1;i=i+1)//It checks the number of sets as in 'ABC'
        {
            str[i] = str[i].trim();
            l2=str[i].length();//This is the length of each sub part. Splitted string's length.
            for(int j=0;j<l2;j=j+1)//It checks the number of arguments 
            {
                if((int)str[i].charAt(j)==39)
                {
                    continue;
                }
                else if (j == l2-1)
                {
                    temp="1";
                    ans=ans+temp;
                }
                else if((int)str[i].charAt(j+1)==39)
                {
                    temp="0";
                    ans=ans+temp;
                }
                else
                {
                    temp="1";
                    ans=ans+temp;
                }
            }
            x=Integer.parseInt(ans);
            x=binTodec(x);
            System.out.print(x+" ");
            ans = "";
        }
    }

    public void cardinalForm_POS(String s)
    {
        String[]str=s.split("[*]");
        String temp;
        int l1=str.length;
        int l2=0;
        String ans="";
        int x;
        for(int i=0;i<l1;i=i+1)//It checks the number of sets as in 'ABC'
        {
            str[i]=str[i].trim();//It removes the spaces.
            String[]strsplit=str[i].split("[+]");
            for(int j=0;j<strsplit.length;j=j+1)//It checks the number of arguments 
            {
                if (strsplit[j].length()==1)
                {
                    temp="0";
                    ans=ans+temp;
                }
                else if (strsplit[j].length()==2)
                {
                    temp="1";
                    ans=ans+temp;
                }
            }
            x=Integer.parseInt(ans);
            x=binTodec(x);
            System.out.print(x+" ");
            ans = "";
        }
    }

    public void t_TableSOP(int x[][])
    {
        int len=x[0].length;//No. of variables
        for(int i=0;i<x.length;i=i+1)
        {
            if(x[i][len-1]==1)
            {
                for(int j=0;j<len-2;j=j+1)
                {
                    if (x[i][j]==1)
                    {
                        System.out.print((char)(65+j));
                    }
                    else
                    {
                        System.out.print((char)(65+j)+"'");
                    }
                }
                if(i<x.length-1)
                {
                    System.out.print("+");
                }
            }
            else
            {
                continue;
            }
        }
    }

    public void t_TablePOS(int x[][])
    {
        int len=x[0].length;//No. of variables
        for(int i=0;i<x.length;i=i+1)
        {
            if(x[i][len-1]==0)
            {
                for(int j=0;j<len-2;j=j+1)
                {
                    if (x[i][j]==0)
                    {
                        System.out.print((char)(65+j));
                    }
                    else 
                    {
                        System.out.print((char)(65+j)+"'");
                    }
                    if(j<len-3)
                    {
                        System.out.print("+");
                    }
                }
                if(i<x.length-1)
                {
                    System.out.print("*");
                }
            }
            else
            {
                continue;
            }
        }
    }

    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        Truth_table t1= new Truth_table();
        int x=-1;
        int option;
        int a;
        while(x!=0)
        {
            System.out.println("Do you want to convert cardinal  to canonical or canonical to cardinal?");
            System.out.println("Press 1 to convert from cardinal  to canonical");
            System.out.println("Press 2 to convert from canonical to cardinal");
            option = sc.nextInt();
            switch(option)
            {
                case 1:
                System.out.println("Do you want the output to be as SOP or POS?");
                System.out.println("Press 1 for SOP");
                System.out.println("Press 2 for POS");
                a = sc.nextInt();
                if(a==1)
                {
                    System.out.print("Please input the string:");
                    String inp= sc.next();
                    System.out.print("Please enter the number of bits:");
                    int x1= sc.nextInt();
                    t1.canoicalForm_SOP(inp,x1);
                    System.out.println();
                }
                else if(a==2)
                {
                    System.out.print("Please input the string:");
                    String inp= sc.next();
                    System.out.print("Please enter the number of bits:");
                    int x1= sc.nextInt();
                    t1.canoicalForm_POS(inp,x1);
                    System.out.println();
                }
                break;
                case 2:
                System.out.println("Do you want the output to be as SOP or POS?");
                System.out.println("Press 1 for SOP");
                System.out.println("Press 2 for POS");
                a = sc.nextInt();
                if(a==1)
                {
                    System.out.print("Please input the string:");
                    String inp= sc.next();
                    t1.cardinalForm_SOP(inp);
                    System.out.println();
                }
                if(a==2)
                {
                    System.out.print("Please input the string:");
                    String inp= sc.next();
                    t1.cardinalForm_POS(inp);
                    System.out.println();
                }
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