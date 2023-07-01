import java.util.*;  //Importing the package
class Prg2 //Decalaration of class

{   Scanner in=new Scanner(System.in); //Creating the object for scanner class
    String s,s1,s2,S,words[]; //Decalaration of variables
    int index,freq[];
    Prg2() //Constructor
    {
        s=s1=s2=" ";
        index=0;
    }

    void accept() //Inputing function
    { int c=0;
        System.out.println("Enter a sentence");
        s=in.nextLine();        //Input the statement
        for(int i=0;i<s.length();i++){               //Looping statement to generate the position
            if(s.charAt(i)=='.'||s.charAt(i)=='!'||s.charAt(i)=='?')        //Check for termination
            {c++;}
        }

        if(c==2)
        {
            s=s.toUpperCase();      //Convert the statement to upper case
            perform();              //Function calling
        }

        else
        {
            System.out.println("INVALID INPUT");    //Message for invalid statement
            accept();               //Function calling
        }
    }

    void perform() //Function to perform
    {int ct=0,l=0; //Counters
        String temp=" "; //Initialisation of a new string

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='.'||s.charAt(i)=='!'||s.charAt(i)=='?')
            {index=i;break;}
        }

        s1=s.substring(0,index).trim();     //Store the first statement
        s2=s.substring(index+1,s.length()-1).trim();    //Store the second statement
        System.out.println(s1);  
        System.out.println(s2);  
        S=s1.concat(" ").concat(s2);        //Join the string with space

        for(int i=0;i<S.length();i++){    //Read the statement and count the words
            if(S.charAt(i)==' ')
                ct++;
        }
        words=new String[ct+1];

        for(int i=0;i<S.length();i++){     //Forming the word and count them
            if(S.charAt(i)!=' ')
            {   temp+=S.charAt(i);
                words[l]=temp;
            }

            else
            {l++;temp=" ";
            }
        }

        int freq[]=new int[ct+1];
        int t=0;

        for(int i=0;i<words.length;i++)         //Calculate frequency of word
        {
            int count=1;
            for(int j=i+1;j<words.length;j++)
            {if(words[i].equals(words[j]))
                {count++; words[j]="0";
                }
            }
            if(count>1&&words[i]!="0")
            {freq[i]=count;
                t++;
            }
        }

        if(t!=0)
        {System.out.println("COMMON WORDS"+'\t'+"FREQUENCY");       //Print the frequency of counted words

            for(int i=0;i<words.length;i++)
            {if(words[i]!="0"&&freq[i]!=0)
                    System.out.println(words[i]+'\t'+'\t'+freq[i]);
            }
        }
        else
            System.out.println("NO COMMON WORDS");      //Error message 
    }

    void main()         //Main function to execute the program
    {
        Prg2 obj=new Prg2();    //Create an object for class Prg2
        obj.accept();           //Function calling to input the statement
    }
}