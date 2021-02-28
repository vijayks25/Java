public class Matrix
{
    public static void main(int m, int n, int a[][])
    {int i,j;
        //Printing of the matrix
        for (i=0;i<m;i=i+1)
        {
            for (j=0;j<n;j=j+1)
            {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }

        //Transpose of the matrix
        for (i=0;i<m;i=i+1)
        {
            for (j=0;j<n;j=j+1)
            {
                System.out.print(a[j][i]);
            }
            System.out.println();
        }

        //Sum of each row
        for (i=0;i<m;i=i+1)
        {
            int sum=0;
            for (j=0;j<n;j=j+1)
            {
                sum=sum+a[i][j];
            }
            System.out.println("Sum="+sum);
        }

        //Sum of each column
        for (i=0;i<m;i=i+1)
        {
            int sum=0;
            for (j=0;j<n;j=j+1)
            {
                sum=sum+a[j][i];
            }
            System.out.println("Sum="+sum);
        }

        //Sum of diagonal elements
        int suml=0, sumr=0, sumn=0;
        for(i=0;i<m;i=i+1)
        {
            for(j=0;j<m;j=j+1)
            {
                if(i==j)
                    suml=suml+a[i][j];
                else if(i+j==3)
                    sumr=sumr+a[i][j];
                else
                    sumn=sumn+a[i][j];
            }
        }
        System.out.println("Sum of left diagonal="+suml); 
        System.out.println("Sum of right diagonal="+sumr);
        System.out.println("Sum of non diagonal="+sumn);

    }
}
