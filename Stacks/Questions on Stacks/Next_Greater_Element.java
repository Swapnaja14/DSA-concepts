// // Brute force approach

// import java.util.*;

// public class Next_Greater_Element {

//     public static void nextGreater (int[] arr) {
//         int array[] = new int[arr.length];

//         for (int i=0; i<arr.length; i++) {
//             for (int j = i+1; j<arr.length; j++) {
//                 if (arr[j] > arr[i]) {
//                     array[i] = arr[j];
//                 }
//                 else {
//                     array[i] = -1;
//                 }
//             }
//         }
//         for (int i=0; i<array.length; i++) {
//             System.out.print(array[i] +" ");
//         }
//     }

//     public static void main (String args[]) {
//         int[] arr = {6, 8, 0, 1, 3};
//         nextGreater(arr);
//     }
// }


import java.util.*;

public class Next_Greater_Element {    
    public static void main(String[] args) {
        int[] arr = {6, 8, 0, 1, 3};
        Stack<Integer> s = new Stack<>();
        int nextGreater[] = new int[arr.length];

        for (int i=arr.length-1; i>=0; i--) {
            // 1 while

            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }

            // 2 if-else
            if (s.isEmpty()) {
                nextGreater[i] = -1;
            }
            else {
                nextGreater[i] = arr[s.peek()];
            }
            // 3 push in s
            s.push(i); 
        }

        for (int i=0; i<nextGreater.length; i++) {
            System.out.println(nextGreater[i]+" ");
        }
        System.out.println();
    }
}