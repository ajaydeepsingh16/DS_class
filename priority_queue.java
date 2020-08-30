import java.util.*;
public class MyClass {
    public static void main(String args[]) {
   PriorityQueue<String> pq=new PriorityQueue<>();
   pq.add("Ajay");
   pq.add("Deep");
   pq.add("Singh");
   pq.add("Bajwa");
   Iterator itr=pq.iterator();
   while(itr.hasNext())
   System.out.print(itr.next()+" ");
   pq.remove();
   System.out.println("");
   Iterator itr1=pq.iterator();
   while(itr1.hasNext())
   System.out.print(itr1.next()+" ");
    }
}
