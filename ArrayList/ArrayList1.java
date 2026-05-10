package ArrayList;

import java.util.*;
public class ArrayList1 {

    public static void swap(ArrayList<Integer> list, int idx1, int idx2){
        int temp = list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        list.add(2);
        list.add(2);
        list.add(9);
        list.add(4);
        list.add(2);

        list.add(1,12);

        System.out.println(list);

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

    }

}
