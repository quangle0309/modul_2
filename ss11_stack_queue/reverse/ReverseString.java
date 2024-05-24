package ss11_stack_queue.reverse;

import java.util.Stack;

public class ReverseString {
    Stack<String> stack = new Stack<String>();

    public String reverseString(String str) {
        String[] words = str.split(" ");
        String newString = "";
        for (String word : words) {
            stack.push(word);
        }
        while (!stack.isEmpty()) {
            newString += (stack.pop() + " ");
        }
        return newString;
    }

    public static void main(String[] args) {
        String string = "một hai ba bốn năm sáu bảy tám chín mười";
        ReverseString reverseString = new ReverseString();
        System.out.println(reverseString.reverseString(string));
    }
}
