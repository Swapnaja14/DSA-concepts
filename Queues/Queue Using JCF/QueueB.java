

import java.util.*;

public class QueueB {
    public static void main (String args[]) {

    // Using LinkedList
    // Queue<Integer> q = new LinkedList<>();
    // q.add(1);
    // q.add(2);
    // q.add(3);
    // System.out.println(q);
    // q.remove();
    // System.out.println(q);

    // Using ArrayDeque
    Queue<Integer> q = new LinkedList<>();
    q.add(1);
    q.add(2);
    q.add(3);
    System.out.println(q);
    q.remove();
    System.out.println(q);
    }
}
