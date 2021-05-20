import java.util.*;
class PriorityQ{
 public static void main(String[] args){
    PriorityQueue<String> pq = new PriorityQueue<>();
    pq.add("Java");
    pq.add("python");
    pq.add("Sql");
    pq.add("Smalltalk");
    pq.add("HTML");
    pq.add("CSS");
    System.out.println(pq); 
    System.out.println("The size of Queue is:"+pq.size());
    pq.remove("Smalltalk");
    pq.offer("PerL"); 
    System.out.println("After peek method:"+pq.peek());
    System.out.println("After poll method:"+pq.poll());//print first element and remove it
    System.out.println(pq);
    Iterator<String> itr=pq.iterator();  
    while(itr.hasNext()){  
    System.out.println(itr.next()); 
    }
    pq.toArray();
    System.out.println(pq);
   } 

} 