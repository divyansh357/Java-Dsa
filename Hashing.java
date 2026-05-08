import java.util.*; 
public class Hashing
{
   // Hashmap Implementation
   static class Hashmap<K,V>{
    private class Node{
        K key;
        V value;

        public Node(K key,V value){
            this.key = key;
            this.value = value;
        }
    }

    private int size; //n
    private LinkedList<Node> buckets[]; //N= buckets.length

    

   }

    public static void main(String args[]){
        //Create
        HashMap<String,Integer>hm = new HashMap<>();

        // Insert -O(1)
        hm.put("India",100);
        hm.put("China",150);
        hm.put("Bhutan",50);
        hm.put("US",1000);
        hm.put("Indonesia",25);

        //System.out.println(hm);

        // //Get -O(1)
        // System.out.println(hm.get("India"));
        // System.out.println(hm.get("Indonesia"));

        // //containsKey -O(1)
        // System.out.println(hm.containsKey("Bhutan"));
        // System.out.println(hm.containsKey("US"));

        // // remove - O(1)
        // System.out.println(hm.remove("Bhutan"));
        // System.out.println(hm);
        
        // // size
        // System.out.println(hm.size());

        // // isEmpty
        // hm.clear(); // clears whole hashmap
        // System.out.println(hm.isEmpty());

        // Iterations on HashMap

        Set<String>keys= hm.keySet();
        System.out.println(keys);

        for(String k: keys){
            System.out.println("Key:"+k+", Value:"+hm.get(k));
        }
    }


}
