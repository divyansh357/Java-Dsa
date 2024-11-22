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

    //Linear Search
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

    //Largest and smallest finder
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

    //Binary Search
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

    //Reverse an array
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

    //Print pairs
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

    //Print Subarrays
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

    //Max Sum Sub array brute force solution
    public static void sum_sub_arrays(int numbers[])
    {
        int max_sum = Integer.MIN_VALUE;
        int curr_sum =0;
        for(int i=0;i<numbers.length;i++)
        {
            int start =i;
            for(int j=i;j<numbers.length;j++)
            {
                int stop = j;
                curr_sum=0;
                for(int k=start;k<=stop;k++)
                {
                    curr_sum+=numbers[k]; 
                }  
                System.out.println(curr_sum);
                if(curr_sum>max_sum)
                {
                    max_sum=curr_sum;
                }
            }
        }
        System.out.println("Maximum Sum="+max_sum);
    }

    // Prefix Sum 
    
    public static void prefix_sum(int numbers[])
    {
        int prefix[] = new int[numbers.length];
        int max_sum = Integer.MIN_VALUE;
        int curr_sum = 0;
        prefix[0]=numbers[0];
        for(int i=1;i<numbers.length;i++)
        {
            prefix[i]=prefix[i-1]+numbers[i];
        }
        for(int i=0;i<numbers.length;i++)
        {
            int start = i;
            for(int j=0;j<numbers.length;j++)
            {
                int end = j;
                curr_sum = start==0? prefix[end] : prefix[end]-prefix[start-1];
            }
            if(max_sum < curr_sum)
            {
                max_sum = curr_sum;
            }
        }
        System.out.println("Max Sum="+max_sum);
    }

    //Kadane's Algo
    public static void Kadane_algo(int numbers[])
    {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for(int i=0;i<numbers.length;i++)
        {
            cs = cs + numbers[i];
            if(cs<0)
            {
                cs =0;
            }
            ms = Math.max(cs,ms);
        }
        System.out.println("Our maximum subarray sum is:"+ms);
    }

    // Kadane's Algo for all negative numbers
    public static void Kadane_2(int numbers2[])
    {
        boolean negative = true;
        for(int i=0;i<numbers2.length;i++)
        {
            if(numbers2[i]>0)
            {
                negative= false;
            }
        }
        if(negative == true){
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for(int i=0;i<numbers2.length;i++)
        {
            cs = cs + numbers2[i];
            if(cs>ms)
            {
                ms = cs;
            }
        }
        System.out.println("Our maximum subarray sum is:"+ms);
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

        //int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
        // Brute force
        //sum_sub_arrays(numbers); 

        //Prefix Sum
        //prefix_sum(numbers);

        // Kadane's Algorithm
        //Kadane_algo(numbers);

        // Kadane's Algo for all -ve numbers
        //int numbers2[]= {-1,-2,-3,-4};
        //Kadane_2(numbers2);

        // Trapping Rainwater
        
    }
}
