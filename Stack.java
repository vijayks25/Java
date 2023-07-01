import java.util.*;
public class Stack
{
    int array[];
    int sp;  

    Stack(int arr)
    {
        array=new int[arr];
        sp=-1;
    }

    boolean is_Empty()
    {
        if(sp==-1)
        {
            return true;
        }
        return false;
    }

    boolean is_Full()
    {
        if(sp==array.length-1)
        {
            return true;
        }
        return false;
    }

    void push(int ele)
    {
        if(is_Full()==true)
        {
            System.out.println("Stack is full. Cannot add an element.");
            return;
        }
        sp=sp+1;
        array[sp]=ele;
    }

    int pop()
    {
        int temp;
        if(is_Empty()==true)
        {
            System.out.println("Stack is empty. Cannot delete an element.");
        }
        temp=array[sp];
        array[sp]=0;
        sp=sp-1;
        return temp;
    }

    void print()
    {
        for(int i=0;i<=sp;i=i+1)
        {
            System.out.print(array[i]+" ");
        }
    }

    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter the size:");
        int si=sc.nextInt();
        Stack s=new Stack(si);
        int a;
        int x=-1;
        int option;
        while(x!=0)
        {
            System.out.println();
            System.out.println("Press 1 to display:");
            System.out.println("Press 2 to push:");
            System.out.println("Press 3 to pop:");
            System.out.println("Press 4 to check if the stack is empty:");
            System.out.println("Press 5 to check if the stack is full:");
            System.out.println("Press 0 to exit:");
            System.out.println();
            option=sc.nextInt();
            switch(option)
            {
                case 1: 
                s.print();
                System.out.println();
                break;

                case 2:
                System.out.print("Enter an element:");
                a=sc.nextInt();
                s.push(a);
                break;

                case 3:
                s.pop();
                break;

                case 4:
                System.out.print(s.is_Empty());
                break;

                case 5:
                System.out.print(s.is_Full());
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