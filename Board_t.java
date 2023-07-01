import java.util.*;
public class Board_t
{
    char[][]grid;
    char def;
    public Board_t(int rows, int cols,char def)
    {
        grid=new char[rows][cols];
        this.def=def;
        for(int i=0;i<rows;i=i+1)
        {
            for(int j=0;j<cols;j=j+1)
            {
                grid[i][j]=def;
            }
        }
    }

    void print_Grid()
    {
        System.out.print("\f");
        for(int i=0;i<grid.length;i=i+1)
        {
            for(int j=0;j<grid[0].length;j=j+1)
            {
                if(grid[i][j]== def)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print(grid[i][j]);
                }
                System.out.print("|");
            }
            System.out.println();
            for(int j=0;j<grid.length;j=j+1)
            {
                System.out.print("--");
            }
            System.out.println();
        }
    }

    public int input_Coin(int row_no, int col_no, char c)
    {
        if(grid[row_no][col_no]==def)
        {
            grid[row_no][col_no]=c;
            return 0;
        }
        System.out.println("Wrong Input");
        return -1;
    }
}