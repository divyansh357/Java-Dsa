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
        int max = 0;
        for(int i=0;i<list.size();i++){
            for(int j=i;j<list.size();j++){
                int height = Math.min(list.get(i),list.get(j));
                int width = j-1;
                max = Math.max(max,height*width);
            }
        }
        return max;
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

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        System.out.println(contains_water(list));


        // Two Sum-2
        class Solution {
            public int[] twoSum(int[] numbers, int target) {
                int l =0, r= numbers.length -1;
                while(l<r){
                    int curSum = numbers[l] + numbers[r];
                    if(curSum > target){
                        r--;
                    }
                    else if(curSum < target){
                        l++;
                    }
                    else{
                        return new int [] {l+1,r+1};
                    }
                }
                return new int[0];
            }
        }
        
        



    }

}
