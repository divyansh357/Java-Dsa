import java.util.*;
public class Array 
{
    public static void update(int marks[],int nonChangable)
    {
        nonChangable = 10;
        for(int i=0;i<marks.length;i++)
        {
            marks[i]+=1;
        }
    }
    public static int linear_search(int numbers[],int key)
    {
        for(int i=0;i<numbers.length;i++)
        {
            if(numbers[i]==key)
            {
                return i;
            }
        }
        return -1;
    }
    public static int ls(String menu[],String key)
    {
        for(int i=0;i<menu.length;i++)
        {
            if(menu[i]==key)
            {
                return i;
            }
        }
        return -1;
    } 
    public static int getLargest(int numbers[])
    {
        int largest = Integer.MIN_VALUE; //-infinity
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++)
        {
            if(numbers[i]>largest)
            {
                largest = numbers[i];
            }
            if(numbers[i]<smallest)
            {
                smallest=numbers[i];
            }
        }
        System.out.println("Samllest value is:"+smallest);
        return largest;
    }
    public static int binary_search(int numbers[],int key)
    {
        int end = numbers.length-1;
        int start = 0;
        while (start<=end)
        {
            int mid = (start+end)/2;
            // Comaprisons
            if(numbers[mid]==key)
            {
                return mid;
            }
            else if(numbers[mid]<key)
            {
                start = mid+1;

            }
            else
            {
                end = mid-1;
            }
        }  
        return -1;
    }
    public static void reverse_array(int numbers[])
    {
        int first = 0;
        int last = (numbers.length)-1;
        while(first<last)
        {
            int temp = numbers[last];
            numbers[last]=numbers[first];
            numbers[first]=temp;
            first++;
            last--;
        }
    }
    public static void print_pairs(int numbers[])
    {
        int tp=0;
        for(int i=0;i<numbers.length;i++)
        {
            int curr = numbers[i];
            for(int j=i+1;j<numbers.length;j++)
            {
                System.out.print("("+curr+","+numbers[j]+") ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total pairs= "+tp);
    }
    public static void print_subarray(int numbers[])
    {
        int ts=0;
        for(int i=0;i<numbers.length;i++)
        {
            int start =i;
            for(int j=i;j<numbers.length;j++)
            {
                int end = j; 
                for(int k=start;k<=end;k++)
                {
                    System.out.print(numbers[k]+" ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subarrays:"+ts);
    }
    public static void sum_sub_arrays(int numbers[],int sum[])
    {
        int x=0;
        for(int i=0;i<numbers.length;i++)
        {
            int start =i;
            for(int j=i;j<numbers.length;j++)
            {
                int stop = j;
                for(int k=start;k<=stop;k++)
                {
                    System.out.print(numbers[k]+" ");
                    sum[x]+=numbers[k];
                }
                System.out.println("Sum="+sum[x]);
                x++;
            }
            System.out.println();
        }
    }
    public  static void main(String args[])
    {
        // CReating an array
        // int marks[] = new int[100];
        // int numbers[]={1,2,3};
        // int moreNumbers[]={4,5,6};
        // String fruits[] = {"apple","mango","orange"};
        
        //input in an array

        // Scanner sc = new Scanner(System.in);
        // marks[0]=sc.nextInt();
        // marks[1]=sc.nextInt();
        // marks[2]=sc.nextInt();

        //Output

        // System.out.println("Physics:"+marks[0]);
        // System.out.println("Chemistry:"+marks[1]);
        // System.out.println("Maths:"+marks[2]);
        // sc.close();

        //Update
        // marks[2]=100;
        // System.out.println("Maths:"+marks[2]);
        // marks[2]=marks[2]-1;
        // System.out.println("Maths:"+marks[2]);

        // int percentage = (marks[0]+marks[1]+marks[2])/3;
        // System.out.println("Percentage:"+percentage);

        //Length of an array

        //System.out.println("Length of array:"+marks.length);

        // Passing array as argument

        // int marks[]={97,98,99}; // Use call by refernce 
        // int nonChangable = 5; // Use call by value
        // update(marks,nonChangable);
        // System.out.println(nonChangable);
        // for(int i=0;i<marks.length;i++)
        // {
        //     System.out.print(marks[i]+" ");
        // }
        // System.out.println();

        //Linear Search

        // int numbers[] = {2,4,6,8,10,12,14,16};
        // int key  = 20;
        // int index = linear_search(numbers, key);
        // if(index==-1)
        // {
        //     System.out.println("Not found");
        // }
        // else
        // {
        //     System.out.println("Key is at index: "+index);
        // }

        //Example
        // String menu[] = {"Dosa","Pizza","Coke","Samosa","Kachori"};
        // String key = "Kachori";
        // int index = ls(menu, key);
        // if(index==-1)
        // {
        //     System.out.println("Not found.");
        // }
        // else
        // {
        //     System.out.println("Key is at index: "+index);
        // }

        //Largest Number

        // int numbers[] = {1,2,6,3,5};
        // int largest = getLargest(numbers);
        // System.out.println("Largest value is: "+largest);

        // Binary Search
        // int numbers[] ={2,4,6,8,10,12,14};
        // int key = 10;
        // int index = binary_search(numbers,key);
        // System.out.println("Key is found at index: "+index);

        // Reverse an array
        // int numbers[]= {2,4,6,8,10};
        // reverse_array(numbers);
        // for(int i=0;i<numbers.length;i++)
        // {
        //     System.out.print(numbers[i]+" ");
        // }

        //Pairs in an array
        // int numbers[]={2,4,6,8,10};
        // print_pairs(numbers);

        // Print Subarrays
        // int numbers[]={2,4,6,8,10};
        // print_subarray(numbers);

        // Sum of all Sub - arrays and find min and max sum

        int numbers[] = {2,4,6,8,10};
        
        int n = numbers.length;
        int sum[] = new int[n*(n+1)/2];
        sum_sub_arrays(numbers,sum);
        int largest = getLargest(sum);
        System.out.println("The sub array with largest sum is: "+largest);


    }
}
