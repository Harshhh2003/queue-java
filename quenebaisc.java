import java.util.*;
public class quenebaisc {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
  System.out.println(q.isEmpty());
  q.add(10);
        q.add(20);
        q.add(50);
        q.add(70);
        q.add(100);
        System.out.println(q);
 q.remove(); 
        System.out.println(q);
    System.out.println(q.element());
        System.out.println(q.peek());
  q.offer(200);
      System.out.println(q);
  q.poll();  
    System.out.println(q);
   System.out.println(q.size());
        System.out.println(q.isEmpty());
    }
}
