import java.net.SocketTimeoutException;
import java.util.*;
public class two_d_array
{
    public static boolean search(int matrix[][],int key)
    {
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==key)
                {
                    System.out.println("Found at cell("+i+","+j+")");
                    return true;
                }
            }
        }
        return false;
    }
    //Print Spiral
    public static void printSpiral(int matrix[][])
    {
        int startRow = 0;
        int startCol =0;
        int endRow = matrix.length -1;
        int endCol = matrix[0].length-1;
        while(startRow<=endRow && startCol<=endCol)
        {
            //top
            for(int j=startCol;j<=endCol;j++)
            {
                System.out.print(matrix[startRow][j]+" ");
            }
            //right
            for(int i=startRow+1;i<=endRow;i++)
            {
                System.out.print(matrix[i][endCol]+" ");
            }
            //bottom
            for(int j=endCol-1;j>=startCol;j--)
            {
                if(startRow==endRow)
                {
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");
            }
            //left
            for(int i=endRow-1;i>=startRow+1;i--)
            {
                if(startCol==endCol)
                {
                    break;
                }
                System.out.print(matrix[i][startCol]+" ");
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
    } 
    //Diagonal Sum
    public static int diagonalSum(int matrix[][])
    {
        int sum =0;

        //Time Complexity of O(n^2)
        // for(int i=0;i<matrix.length;i++)
        // {
        //     for(int j=0;j<matrix[0].length;j++)
        //     {
        //         if(i==j)
        //         {
        //             sum+= matrix[i][j];
        //         }
        //         else if(i+j ==matrix.length-1)
        //         {
        //             sum+= matrix[i][j];
        //         }
        //     }
        // }

        for(int i=0;i<matrix.length;i++) // Time:O(n)
        {
            //pd
            sum+= matrix[i][i];

            //sd
            if(i!=matrix.length-1-i)
            {
                sum+= matrix[i][matrix.length-i-1];
            }
        }
        return sum;
    }           
    
    public static boolean stairCaseSearch(int matrix[][],int key)
    {
        // int row = 0,col = matrix[0].length-1;// Considering  top right as staring point 
        // while(row<matrix.length && col>=0)
        // {
        //     if(matrix[row][col]==key)
        //     {
        //         System.out.println("Found key at ("+row+","+col+")");
        //         return true;
        //     }
        //     else if(key<matrix[row][col])
        //     {
        //         col--;
        //     }
        //     else
        //     {
        //         row++;
        //     }
        // }

        int row = matrix.length-1, col = 0; // Considering bottom left as staring point
        while(row>=0 && col<matrix[0].length)
        {
            if(matrix[row][col]==key)
            {
                System.out.println("Found key at ("+row+","+col+")");
                return true;
            }
            else if(key<matrix[row][col])
            {
                row--;
            }
            else
            {
                col++;
            }
        }
        System.out.println("Key not found!");
        return false;
    }
    //q1
    public static int count(int array[][])
    {
        int countof7 = 0;
        for(int i=0;i<array.length;i++)
        {
            for(int j=0;j<array[0].length;j++)
            {
                if(array[i][j]==7)
                {
                    countof7++;
                }
            }
        }
        return countof7;
    }
    //q2
    public static int sum(int nums[][])
    {
        int sum =0;
        int col=0;
        while(col<3)
        {
            sum+=nums[1][col];
            col++;
        }
        return sum;
    }
    //q3
    public static void transpose(int matrix[][])
    {
        int transpose[][] = new int[3][2];
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                transpose[j][i]=matrix[i][j];
            }
        }
        for(int i=0;i<transpose.length;i++)
        {
            for(int j=0;j<transpose[0].length;j++)
            {
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
    //creation
    // int matrix[][] = new int[3][3];
    // //input
    // Scanner sc = new Scanner(System.in);
    // int n=matrix.length,m=matrix[0].length;
    // for(int i=0;i<n;i++)
    // {
    //     for(int j=0;j<m;j++)
    //     {
    //         matrix[i][j] = sc.nextInt();
    //     }
    // }
    // //output
    // for(int i=0;i<n;i++)
    // {
    //     for(int j=0;j<m;j++)
    //     {
    //         System.out.print(matrix[i][j]+" ");
    //     }
    //     System.out.println();
    // }
    // //searching
    // int key=3;
    // //search(matrix,key);
    // int largest = Integer.MIN_VALUE;
    // int smallest = Integer.MAX_VALUE;
    // for(int i=0;i<n;i++)
    // {
    //     for(int j=0;j<m;j++)
    //     {
    //         largest = Math.max(largest,matrix[i][j]);
    //         smallest = Math.min(smallest,matrix[i][j]);
    //     }
    // }
    // System.out.println("Smallest Value: "+smallest);
    // System.out.println("Largest value:"+largest);

    //Spiral Matrix
    
    // int matrix[][] = {{1,2,3,4},
    //                   {5,6,7,8},
    //                   {9,10,11,12},
    //                   {13,14,15,16}};
    // printSpiral(matrix);  

    //Diagonal Sum
    // int matrix[][] = {{1,2,3,4},
    //                   {5,6,7,8},
    //                   {9,10,11,12},
    //                   {13,14,15,16}};
    // System.out.println(diagonalSum(matrix));           

    // Search in Sorted Matrix 

    // int matrix[][] = {{10,20,30,40},
    //                   {15,25,35,45},
    //                   {27,29,37,48},
    //                   {32,33,39,50}};
    // int key = 33;
    // stairCaseSearch(matrix, key);     

    //Questions

    //q1
    // int array[][] = {{4,7,8},
    //                  {8,8,7}};
    // System.out.println(count(array));   
    
    //q2

    // int nums[][] = {{1,4,9},{11,4,3},{2,2,3}};
    // System.out.println(sum(nums));

    //q3

    int matrix[][] = {{1,2,3},{4,5,6}};
    transpose(matrix);

    }
}
