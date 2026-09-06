package ArrayList;

import java.lang.reflect.Array;
import java.util.*;
public class ArrayList1 {

    public static void swap(ArrayList<Integer> list, int idx1, int idx2){
        int temp = list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
    }

    //Container with most water 
    public static int  contains_water(ArrayList<Integer> list){
        // Brute-force
        // int max = 0;
        // for(int i=0;i<list.size();i++){
        //     for(int j=i;j<list.size();j++){
        //         int height = Math.min(list.get(i),list.get(j));
        //         int width = j-1;
        //         max = Math.max(max,height*width);
        //     }
        // }

        // 2-Pointer Approach

        int maxWater = 0;
        int height =0, width=0;
        int lp = 0, rp = list.size()-1;
        while(lp<rp){
            // calculate water area
            height = Math.min(list.get(lp),list.get(rp));
            width = rp - lp;
            int currWater = width * height;
            maxWater = Math.max(maxWater, currWater);

            // Update ptr
            if(list.get(lp)<list.get(rp)){
                lp++;
            }
            else{
                rp--;
            }
        }

        return maxWater;
    }

    // Pair Sum -1
    public static boolean pairSum1(ArrayList<Integer> nums, int target){
        // Brute -force
        // for(int i=0;i<nums.size();i++){
        //     for(int j =i+1;j<nums.size();j++){
        //         if(nums.get(i)+nums.get(j)== target)
        //         {
        //             return true;
        //         }
        //     }
        // }
        // return false;

        // 2- Pointer
        int lp = 0;
        int rp = nums.size()-1;
        while(lp!=rp){
            if(nums.get(lp)+nums.get(rp)==target){
                return true;
            }
            else if(nums.get(lp)+nums.get(rp)>target){
                rp--;
            }
            else{
                lp++;
            }
        }
        return false;
    }

    public static boolean Ps2(ArrayList<Integer> list, int target) {
        if (list == null || list.size() < 2) {
        return false;
        }
        int n = list.size();
        int lp = 0, rp = n - 1;
        for(int i=0;i<n-1;i++){
            if(list.get(i)>list.get(i+1)){
                lp = i+1;
                rp = i;
                break;
            }
        }
        int currSum =0;
        while(lp!=rp){
            currSum = list.get(lp) + list.get(rp);
            if(currSum == target){
                return true;
            }
            else if(currSum<target){
                lp = (lp+1)%n;
            }
            else{
                rp = (n+rp-1)%n;
            }
        }
        return false;
    }
    

    //q1 - Check Monotonic 
    public static boolean checkMonotonic(ArrayList<Integer> list){
        boolean increasing = true;
        boolean decreasing = true;
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)>=list.get(i+1)){
                increasing = false;
            }
            if(list.get(i)<=list.get(i+1)){
                decreasing = false;
            }
        }
        if(increasing || decreasing){
            return true;
        }
        return false;    
    }

    //q2 - Lonely numbers in an ArrayList 
    

    //q4- Beautiful ArrayList : Even/Odd Iterative 
    // public static ArrayList<Integer> beautifulArray(int n){
    //     ArrayList<Integer> ans = new ArrayList<>();
    //     ans.add(1);
    //     for(int i=2;i<=n;i++){
    //         ArrayList<Integer> temp = new ArrayList<>();
    //         for(Integer e : ans){
    //             if(e*2<=n) temp.add(e*2);
    //         }
    //         for(Integer e : ans) if(e*2-1 <=n) temp.add(e*2-1);

    //         ans = temp;
    //     }
    //     return ans;
    // }
    
    //Beautiful ArrayList : Divide and Conquer
    public static ArrayList<Integer> beautifulArray(int n){
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(1);
        for(int i=2;i<=n;i++){
            ArrayList<Integer> temp = new ArrayList<>();
            for(Integer e : ans){
                if(e*2<=n) temp.add(e*2);
            }
            for(Integer e : ans) if(e*2-1 <=n) temp.add(e*2-1);

            ans = temp;
        }
        return ans;
    }
    

    public static void main(String[] args) {
        // ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<String> list2 = new ArrayList<>();
        // ArrayList<Boolean> list3 = new ArrayList<>();

        // list.add(2);
        // list.add(2);
        // list.add(9);
        // list.add(4);
        // list.add(2);

        // list.add(1,12);

        // System.out.println(list);

        // Get Element 
        // int element = list.get(2);
        // System.out.println(element);

        // // Remove Operation

        // list.remove(2);
        // System.out.println(list);

        // // Set Element at Index 
        // list.set(2,11);
        // System.out.println(list);

        // // Contains Element 
        // System.out.println(list.contains(1));
        // System.out.println(list.contains(12));

        // Size of an ArrayList
        // System.out.println(list.size());

        // // Iterating through the arrayList
        // for(int i=0;i<list.size();i++){
        //     System.out.print(list.get(i) + " ");
        // }
        // System.out.println();

        // Print reverse of an ArrayList
        // for(int i= list.size()-1;i>=0;i--){
        //     System.out.println(list.get(i)+ " ");
        // }

        // max in Array List

        // int max = Integer.MIN_VALUE;
        // for(int i=0;i<list.size();i++){
        //     max = Math.max(max,list.get(i));
        // }
        // System.out.println(max);

        // Swap in ArrayList
        // int idx1 = 1,idx2 = 2;
        // swap(list, idx1, idx2);
        // System.out.println(list);

        // Sorting an ArrayList
        // Collections.sort(list); // Sort in ascending order
        // System.out.println(list);

        // Collections.sort(list, Collections.reverseOrder()); // Sort in descending Order By Comparator fxn- reverseOrder()- logics
        // System.out.println(list);

        // 2-D Array 
        //ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        // ArrayList<Integer> list1 = new ArrayList<>();
        // list1.add(1);
        // list1.add(2);

        // mainList.add(list1);

        // ArrayList<Integer> list2 = new ArrayList<>();
        // list2.add(3);
        // list2.add(4);

        // mainList.add(list2);

        // for(int i=0;i<mainList.size();i++){
        //     ArrayList<Integer> arr = mainList.get(i);
        //     for(int j=0;j<arr.size();j++){
        //         System.out.print(arr.get(j)+" ");
        //     }
        //     System.out.println();
        // }
        // System.out.println(mainList);

        // ArrayList<Integer> list1 = new ArrayList<>();
        // ArrayList<Integer> list2 = new ArrayList<>();
        // ArrayList<Integer> list3 = new ArrayList<>();

        // for(int i=1;i<=5;i++){
        //     list1.add(i);
        //     list2.add(i*2);
        //     list3.add(i*3);
        // }

        // mainList.add(list1);
        // mainList.add(list2);
        // mainList.add(list3);

        // for(int i=0;i<mainList.size();i++){
        //     ArrayList<Integer> list = mainList.get(i);
        //     for(int j=0;j<list.size();j++){
        //         System.out.print(list.get(j)+" ");
        //     }
        //     System.out.println();
        // }
        // System.out.println();

        //Container with most water 

        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(1);
        // list.add(8);
        // list.add(6);
        // list.add(2);
        // list.add(5);
        // list.add(4);
        // list.add(8);
        // list.add(3);
        // list.add(7);
        // System.out.println(contains_water(list));

        // Pair Sum -1
        // ArrayList<Integer> nums = new ArrayList<>();
        // for(int i=1;i<=6;i++){
        //     nums.add(i);
        // }
        // int target = 5;
        // System.out.println(pairSum1(nums, target));

        // Pair Sum -2
        // ArrayList<Integer> list = new ArrayList<>();
        // int target = 16;
        // list.add(11);
        // list.add(15);
        // list.add(6);
        // list.add(8);
        // list.add(9);
        // list.add(10);
        // System.out.println(Ps2(list, target));

        // ArrayList Sheet
        //q1
        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(1);
        // list.add(3);
        // list.add(2);
        // System.out.print(checkMonotonic(list));

        //q2
        int n = 5;
        ArrayList<Integer> nums = beautifulArray(n);
        for(int i=0;i<nums.size();i++){
            System.out.println(nums.get(i));
        }

    }

}
