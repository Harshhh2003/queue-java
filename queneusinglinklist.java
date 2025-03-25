
public class queneusinglinklist {
    static class quene {
        static class node {
            int data;
            node next;
   node(int data) {
                this.data = data;
                this.next = null;} }
 static node head = null;
        static node tail = null;
  public static boolean isEmpty() {
            return head == null && tail == null;
        }  public static void add(int data) {
            node newNode = new node(data);
            if (tail == null) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }
 public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;  }
            int front = head.data;
            head = head.next;
            if (head == null) {
                tail = null; // means quene is empty so tail  next will also nulll
            }
            return front; // fornt weill store the head value
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
        } public static void main(String[] args) {
        quene q = new quene();
        q.add(10);
        q.add(20);
        q.add(30);
        System.out.println(q.peek()); 
        System.out.println(q.remove()); 
        System.out.println(q.remove()); 
        System.out.println(q.isEmpty()); 
        System.out.println(q.remove()); 
        System.out.println(q.isEmpty()); 
    }
}}
