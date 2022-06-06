import java.util.Comparator;
import java.util.PriorityQueue;

public class PQ_String_Comparator_Ex {
    public static void main(String[] args) {
       
	    Comparator<String> str_Length = new Comparator<>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();
            }
        };			
        PriorityQueue<String> ob_pq = new PriorityQueue<String>(str_Length);
        ob_pq.add("Lisa");
        ob_pq.add("Robert");
        ob_pq.add("John");
        ob_pq.add("Chris");
        ob_pq.add("Angelina");
        ob_pq.add("Joe"); 
        while (!ob_pq.isEmpty()) {
            System.out.println(ob_pq.remove());
        }
    }
}