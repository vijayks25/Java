import java.util.*;
public class Queue
{
    int array[];
    int front, back, track;

    public Queue(int arr)
    {
        array=new int[arr];
        front=0;
        back=-1;
        track=0;
    }

    boolean is_Empty()
    {
        if(track==0)
        {
            return true;
        }
        return false;
    }

    boolean is_Full()
    {
        if(track==array.length-1)
        {
            return true;
        }
        return false;
    }

    void enqueue(int ele)
    {
        if(is_Full()==true) 
        {
            System.out.println("Queue is full. Cannot add element.");
            return;
        }
        back=back+1;
        ele=array[back];
        track=track+1;
    }

    int dequeue()
    {
        int temp;
        if(is_Empty()==true)
        {
            System.out.println("Queue is empty. Cannot delete an element.");
        }
        temp=array[front];
        array[front]=0;
        front=front+1;
        track=track-1;
        return temp;
    }

    void print()
    {
        for(int i=front;i<=back;i=i+1)
        {
            System.out.print(array[i]);
        }
    }
    
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter the size:");
        int si=sc.nextInt();
        Queue q=new Queue(si);
        int a;
        int x=-1;
        int option;
        while(x!=0)
        {
            System.out.println();
            System.out.println("Press 1 to display:");
            System.out.println("Press 2 to enqueue:");
            System.out.println("Press 3 to dequeue:");
            System.out.println("Press 4 to check if the queue is empty:");
            System.out.println("Press 5 to check if the queue is full:");
            System.out.println("Press 0 to exit:");
            System.out.println();
            option=sc.nextInt();
            switch(option)
            {
                case 1: 
                q.print();
                System.out.println();
                break;

                case 2:
                System.out.print("Enter an element:");
                a=sc.nextInt();
                q.enqueue(a);
                break;

                case 3:
                q.dequeue();
                break;

                case 4:
                System.out.print(q.is_Empty());
                break;

                case 5:
                System.out.print(q.is_Full());
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