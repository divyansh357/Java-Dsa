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

    // Trapping Rainwater
    public static int trappedRainwater(int height[])
    {
        int n = height.length;
        //calculate left max boundary -array
        int leftMax []= new int[n];
        leftMax[0]=height[0];
        for(int i=1;i<n;i++)
        {
            leftMax[i]= Math.max(height[i],leftMax[i-1]);
        }
        //calculate right max bounady - array
        int rightmax [] = new int[n];
        rightmax[n-1]= height[n-1];
        for(int i=n-2;i>=0;i--)
        {
            rightmax[i]=Math.max(height[i],rightmax[i+1]);
        }

        int trappedWater = 0;
        // loop 
        for(int i=0;i<n;i++)
        {
            // waterLevel = min(leftmax bound,rightmax bound)
            int waterLevel = Math.min(leftMax[i],rightmax[i]);
            // tarpped water = waterlevel - height[i]
            trappedWater+= waterLevel -height[i];
        }

        return trappedWater; 
    }
    // Buy and Sell Stocks
    public static int buy_sell_stock(int prices[])
    {
        int buy_price = Integer.MAX_VALUE;
        int max_profit = 0;
        for(int i=0;i<prices.length;i++)
        {
            if(buy_price<prices[i])
            {
                int profit = prices[i]-buy_price;
                max_profit = Math.max(profit,max_profit);
            }
            else
            {
                buy_price = prices[i];
            }
        }
        return max_profit;
    }
    //q1
    public static boolean repeat(int nums[])
    {
        boolean isRepeat = false;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    isRepeat = true;
                }
            }
        }
        return isRepeat;
    }
    //q2
    public static int search(int prices[],int key)
    {
        int st=0,end=prices.length-1;
        while(st<=end)
        {
            int mid = st + (end-st)/2;
            if(prices[mid]==key) // left sorted
            {
                return mid;
            }
            if(prices[st]<=prices[mid])
            {
                if(prices[st]<=key && key<=prices[mid])
                {
                    end = mid-1;
                } 
                else
                {
                    st = mid+1;
                }
            }
            else  // right sorted
            {
                if(prices[mid]<=key && key<=prices[end])
                {
                    st = mid+1;
                }
                else
                {
                    end = mid-1;
                }
            }
        }
        return -1;
    }
    //q2
    // public static int search(int nums[],int target)
    // {
    //     // min will have the index of minimum element of nums
    //     int min = minSearch(nums);
    //     // find in sorted left 
    //     if(nums[min]<=target && target<=nums[nums.length-1])
    //     {
    //         return search(nums,min,nums.length-1,target);
    //     }
    //     //find in sorted right 
    //     else
    //     {
    //         return search(nums,0,min,target);
    //     }

    // }
    // // Binary serach to find 
    // public static int search(int nums[],int left,int right,int target)
    // {
    //     int l = left;
    //     int r = right;
    //     //System.out.println(left+" "+right);
    //     while(l<=r)
    //     {
    //         int mid = l + (r-1)/2;
    //         if(nums[mid]==target)
    //         {
    //             return mid;
    //         }
    //         else if(nums[mid]>target)
    //         {
    //             r = mid-1;
    //         }
    //         else
    //         {
    //             l=mid+1;
    //         }
    //     }
    //     return -1;
    // }
    // public static int minSearch(int nums[])
    // {
    //     int left =0;
    //     int right = nums.length -1;
    //     while(left<right)
    //     {
    //         int mid = left + (right-left)/2;
    //         if(mid>0 && nums[mid-1]>nums[mid])
    //         {
    //             return mid;
    //         }
    //         else if(nums[left]<=nums[mid] && nums[mid]>nums[right])
    //         {
    //             left = mid+1;
    //         }
    //         else
    //         {
    //             right = mid-1;
    //         }
    //     }
    //     return left;
    // }
    // public static int max_profit(int prices[])
    // {
    //     for(int i=0;i<)
    // }

    // q3
    public static int profit(int prices[])
    {
        int max_profit = 0;
        int buy_price = Integer.MAX_VALUE;//tarck the lowest buying price
        int curr_profit=0;
        for(int i=0;i<prices.length;i++)
        {
            if(buy_price<prices[i])
            {
                curr_profit = prices[i]-buy_price;
                max_profit = Math.max(max_profit, curr_profit);
            }
            else
            {
                buy_price = prices[i];
            }
        }
        return max_profit;
    }
    //q4

    public static int rain(int height[])
    {
        int n = height.length;

        // Calculate leftmax boundary
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i=1;i<n;i++)
        {
            leftMax[i] = Math.max(height[i],leftMax[i-1]);
        }

        // Calculate rightmax boundary
        int rightmax[] = new int[n];
        rightmax[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--)
        {
            rightmax[i] = Math.max(height[i],rightmax[i+1]);
        }

        int trappedRainwater =0;
        for(int i=0;i<n;i++)
        {
            int waterLevel = Math.min(leftMax[i],rightmax[i]);
            trappedRainwater+= waterLevel - height[i];
        }
        return trappedRainwater;
    }

    //q5
    public List<List<Integer>> threeSum(int nums[])
    {
        List<List<Integer>> result = new ArrayList <List<Integer>> ();

        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                for(int k=j+1;j<nums.length;k++)
                {
                    if(nums[i]+nums[j]+nums[k]==0)
                    {
                        List<Integer> triplet = new ArrayList <Integer>();
                        triplet.add(nums[i]);
                        triplet.add(nums[j]);
                        triplet.add(nums[k]);
                        Collections.sort(triplet);
                        result.add(triplet);
                    }
                }
            }
        }
        result = new ArrayList<List<Integer>>(new LinkedHashSet<List<Integer>>(result));
        return result;
    }
    public static void main(String args[])
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
        // int height[] = {4,2,0,6,3,2,5};
        // int trappedWater=trappedRainwater(height);
        // System.out.println("Trapped Rainwater = "+trappedWater);
        
        //Buy and Sell Stocks
        // int prices[] = {7,1,5,3,6,4};
        // System.out.println(buy_sell_stock(prices));

        // Assignment 

        //q1
        // int nums[] = {1,1,1,3,3,4,3,2,4,2};
        // System.out.println(repeat(nums));

        //q2
        // int prices[] = {6,7,8,0,1,2,3,4,5};
        // int key = 1;
        // System.out.println(search(prices,key));

        //q3
        // int prices[] = {7,1,5,3,6,4};
        // System.out.println((profit(prices)));

        //q4
        // int height[] = {4,2,0,3,2,5};
        // System.out.println("Trapped Rainwater= "+rain(height));

        // q5=threeSum
        Array example = new Array();
        int nums[]= {-1,0,1,2-1,-4};

        List<List<Integer>> result = example.threeSum(nums);

        System.out.println("Triplets of sum 0: "+ result);
    }        
}
