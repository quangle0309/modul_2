package ss11_stack_queue.reverse;

import java.util.Stack;

public class ReverseArr {
    Stack<Integer> stack = new Stack<Integer>();

    public void reverseArr(int[] arr) {
        for (int j : arr) {
            stack.push(j);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        ReverseArr r = new ReverseArr();
        r.reverseArr(arr);
        for (int index: arr) {
            System.out.print(index + " ");
        }
    }
}
