import java.util.*;
 
class Priority_Integer{  
    public stati
c void main(String args[]){ 
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.add(8);  
        pq.add(6);  
        pq.add(4); 
        pq.add(2);  
        pq.add(12);  
        pq.add(10);
        System.out.println("The min Priority Queue (natural ordering) contents:");
        Integer val = null;
        while( (val = pq.poll()) != null) {
            System.out.print(val + " ");
        }
    }  
}