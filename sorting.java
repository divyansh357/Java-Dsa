import java.util.*;
import java.util.Arrays;
import java.util.Collections;
public class sorting
{
    //bubble sort
    public static void bubble_sort(int arr[])
    {
        int n = arr.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                //swap
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    
    // Optimised bubble sort for sorted array 
    public static int bubble_sort_optimised(int arr[])
    {
        int n = arr.length;
        int swap =0;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    swap++;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if(swap==0)
            {
                return 0;
            }
        }
        return 1;
    }

    // Selection sort
    public static void selection_sort(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            int minPos= i;
            for(int j =i+1;j<arr.length;j++)
            {
                if(arr[minPos]>arr[j])
                {
                    minPos = j;
                }
            }
            // swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    //Insertion Sort
    public static void insertion_sort(int arr[])
    {
        for(int i=1;i<arr.length;i++)
        {
            int curr = arr[i];
            int prev = i-1;
            // finding out the correct position to insert
            while(prev>=0 && arr[prev]>curr)
            {
                arr[prev+1] = arr[prev];
                prev--;
            } 
            // insertion
            arr[prev+1] = curr;
        }
    }

    //Counting Sort
    public static void counting_sort(int arr[])
    {
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            largest = Math.max(largest,arr[i]);
        }

        int count[] = new int[largest+1];
        for(int i=0;i<arr.length;i++)
        {
            count[arr[i]]++;
        }

        //Sorting
        int j=0;
        for(int i=0;i<count.length;i++)
        {
            while(count[i]>0)
            {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    // Print array 
    public static void printArr(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    //Question
    public static void bubble(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]<arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void selection(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            int minPos = i; 
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[minPos]<arr[j])
                {
                    minPos = j;
                }
            }
            // Swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }
    public static void insertion(int arr[])
    {
        for(int i=1;i<arr.length;i++)
        {
            int curr = arr[i];
            int prev = i-1;
            // finding the position to insert 
            while(prev>=0&&arr[prev]<curr)
            {
                arr[prev+1] = arr[prev];
                prev--;
            }
            //insertion 
            arr[prev+1] = curr;
        }
    }
    public static void counting(int arr[])
    {
        
    }
    public static void main(String args[])
    {
        // Bubble sort
        // int arr[]={5,4,1,3,2};
        // bubble_sort(arr);
        // printArr(arr);
        // int arr[] ={1,2,3,4};
        // int result = bubble_sort_optimised(arr);
        // if(result == 0)
        // {
        //     System.out.println("Array is already sorted.");
        // } 
        // else
        // {
        //     printArr(arr);
        // }

        // Selection sort
        // int arr[] = {5,4,1,3,2};
        // selection_sort(arr);
        // printArr(arr);

        // Insertion Sort
        // int arr[] = {5,4,1,3,2};
        // insertion_sort(arr);
        // printArr(arr);

        // Inbuilt Sort
        //int arr[] = {5,4,1,3,2};
        // Arrays.sort(arr);
        // printArr(arr);

        // Sort a part of array 
        // Arrays.sort(arr,0,3);
        // printArr(arr);

        // sort in descending order

        //Integer arr[] = {5,4,1,3,2};
        // Arrays.sort(arr,Collections.reverseOrder());
        // printArr(arr);

        // Arrays.sort(arr,0,3,Collections.reverseOrder());
        // printArr(arr);

        // Counting Sort
        // int arr[] = {1,4,1,3,2,4,3,7};
        // counting_sort(arr);
        // printArr(arr);

        // question

        int arr[] =  {3,6,2,1,8,7,4,5,3,1};
        //Bubble sort
        // bubble(arr);
        // printArr(arr);
        // selection(arr);
        // printArr(arr);
        // insertion(arr);
        // printArr(arr);
        counting(arr);
        printArr(arr);

    }
}
