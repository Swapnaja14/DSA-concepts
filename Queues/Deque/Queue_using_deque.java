import java.util.*;
public class Queue_using_deque {

    static class queue {

        Deque<Integer> deq = new ArrayDeque<>();

        public void add (int data) {
            deq.addLast(data);
        }

        public int remove () {
            return deq.removeFirst();
        }

        public int peek () {
            return deq.getFirst();
        }
    }

    public static void main (String args[]) {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q);
        q.remove();
        System.out.println(q);
        System.out.println(q.peek());
    }
}
