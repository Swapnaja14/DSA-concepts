import java.util.*;

public class initial {
    public static void main(String[] args) {
        Deque<Integer> deq = new LinkedList<>();
        deq.addFirst(1);
        deq.addFirst(2);
        deq.addFirst(3);
        System.out.println(deq);
        deq.addLast(4);
        deq.addLast(5);
        System.out.println(deq);
        deq.removeFirst();
        System.out.println(deq);

        // addFirst
        // addLast
        // removeFirst
        // removeLast
        // getFirst
        // getLast
    }
}
