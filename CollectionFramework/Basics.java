package CollectionFramework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Basics {

    public static void main(String[] args) {

        // When solving a problem, ask:

        // Do I need duplicates?

        // Do I care about order?

        // Do I need key-value pairs?

        // Do I need fast lookup?

        // Do I need the smallest/largest element repeatedly?

        
        
        //List -  When order and duplicates matter , Duplicates are allowed. - dynamic array.

        //Use List when:
        //You need duplicates
        //You care about insertion/order
        //You need index-based access

        // List<Integer> list = new ArrayList<>();
        // list.add(10);
        // list.add(20);
        // list.add(10);

        // System.out.println(list.get(0));
        // System.out.println(list.get(1));

        // I need a collection of elements and I frequently access them by index.

        // List<String> students = new ArrayList<>();

        // students.add("Rahul");
        // students.add("Aman");
        // students.add("Priya");

        // System.out.println(students.get(1));

        // LinkedList - stores elements as linked nodes. 
        // [10] → [20] → [30] → [40]
        //  accessing requires traversing the list.

        //ArrayList.get(index) → O(1)
        //LinkedList.get(index) → O(n)

        // Use it when - where frequent insertion/removal at the ends is useful
        //ArrayDeque is often a better choice when you need a queue/deque.
        
        // LinkedList<Integer> list1 = new LinkedList<>();

        // list1.addFirst(10);
        // list1.addLast(20);
        // list1.addLast(30);
        // System.out.println(list1);

        // list1.removeFirst();
        // list1.removeLast();
        // System.out.println(list1);

        // Set — When you DON'T want duplicates

        // HashSet - Fast uniqueness/lookup - Fast average O(1) lookup, insertion and removal.
       
        //Whenever the problem says:

        // "Have I seen this before?"

        // or:

        // "Remove duplicates."

        // or:

        // "Check whether an element exists."

        Set<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2);
        set.add(1);

        // The duplicates are ignored.



        // Find duplicate
        int[] arr = {1, 2, 3, 4, 2};

        Set<Integer> seen = new HashSet<>();

        for (int x : arr) {

            if (seen.contains(x)) {
                System.out.println("Duplicate: " + x);
                break;
            }

            seen.add(x);
        }





    }
    
}
