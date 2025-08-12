
public class CircularQueueB {
    static class CircularQueue {
        int arr[];
        int size;
        int rear;
        int front;
        
        CircularQueue (int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public boolean isEmpty () {
            return rear == -1 && front == -1;
        }

        public boolean isFull () {
            return (rear+1) % size == front;
        }

        public void add (int data) {
            if (isFull()) {
                System.out.println("queue is full");
                return;
            }
            // Add 1st element
            if (front == -1) {
                front = 0;
            }            
            rear = (rear+1)%size;
            arr[rear] = data;
        }

        public int remove () {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }

            int result = arr[front];
            
            // last element delete
            if (rear == front) {
                rear = front = -1;
            }
            else {
                front = (front+1)%size;
            }
            return result;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main (String args[]) {
        CircularQueue cq = new CircularQueue(5);
        cq.add(1);
        cq.add(2);
        cq.add(3);

        System.out.println(cq.remove());
        cq.add(4);
        System.out.println(cq.remove());
        cq.add(5);
    }
}
