import java.util.*;
public class Game_t
{
    Player_t p1,p2;
    Board_t b;

    public Game_t()
    {

    }

    void initialise()
    {
        int rows,cols;
        char def;
        Scanner sc;
        sc=new Scanner(System.in);
        System.out.println("Enter the name of Player1:");
        String n=sc.next();
        System.out.println("Enter the coin for Player1:");
        char c=sc.next().charAt(0);

        p1=new Player_t(n,c);

        System.out.println("Enter the name of Player2:");
        n=sc.next();
        System.out.println("Enter the coin for Player2:");
        c=sc.next().charAt(0);

        p2=new Player_t(n,c);

        System.out.println("Enter the rows:");
        rows=sc.nextInt();
        System.out.println("Enter the columns:");
        cols=sc.nextInt();
        System.out.println("Enter the default character:");
        def= sc.next().charAt(0);

        this.b= new Board_t(rows,cols,def);
        b.print_Grid();
    }

    public boolean check_Row(int row_no, char c)
    {        
        for(int i=0;i<b.grid.length;i=i+1)
        {
            if(b.grid[row_no][i]==c)
            {
                continue;
            }
            else
            {
                return false;
            }
        }
        return true;
    }

    public boolean check_Col(int col_no, char c)
    {
        for(int i=0;i<b.grid.length;i=i+1)
        {
            if(b.grid[i][col_no]==c)
            {
                continue;
            }
            else
            {
                return false;
            }
        }
        return true;
    }

    public boolean check_Diagonal(char c)
    {
        int temp=b.grid.length-1;
        int length=b.grid.length-1;
        for(int i=0;i<b.grid.length;i=i+1)//Top left to bottom right
        {
            if(i==length && b.grid[i][i]==c)
            {
                return true;
            }
            if(b.grid[i][i]==c)
            {
                continue;
            }
        }

        for(int i=0;i<b.grid.length;i=i+1)//Top right to bottom left
        {
            if(i==length && b.grid[i][temp]==c)
            {
                return true;
            }
            if(b.grid[i][temp]==c)
            {
                temp=temp-1;
                continue;
            }
        }
        return false;
    }

    public boolean check_Won(int row_no, int col_no, char c)
    {
        boolean row,col,diagonal;
        row=check_Row(row_no,c);
        col=check_Col(col_no,c);
        diagonal=check_Diagonal(c);
        if(row==true)
        {
            return true;
        }

        if(col==true)
        {
            return true;
        }

        if(diagonal==true)
        {
            return true;
        }
        return false;
    }

    public void play()
    {
        int row=0;
        int col=0;
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.print("Please enter the row number for Player 1:");
            row=sc.nextInt();
            System.out.print("Please enter the column number for Player 1:");
            col=sc.nextInt();
            b.input_Coin(row,col,p1.coin);
            b.print_Grid();
            if(check_Won(row,col,p1.coin)==true)
            {
                System.out.print("Player 1 has won");
                break;
            }
            System.out.print("Please enter the row number for Player 2:");
            row=sc.nextInt();
            System.out.print("Please enter the column number for Player 2:");
            col=sc.nextInt();
            b.input_Coin(row,col,p2.coin);
            b.print_Grid();
            if(check_Won(row,col,p2.coin)==true)
            {
                System.out.print("Player 2 has won");
                break;
            }
        }
    }
}