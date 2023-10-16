package bt5.KiemTraChuoiPalidrome;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Stack;

//public class Main {
//    public static void main(String[] args) {
//        String str="Able was I ere I saw Elba";
//        String[] arrStr=str.split(" ");
//        System.out.println(Arrays.toString(arrStr));
//        Stack<String> stack=new Stack<>();
//        stack.push(str);
//        PriorityQueue<String> queue=new PriorityQueue<>();
//        queue.add(str);
//        for (int i=0;i<str.length();i++){
//          String letter=String.valueOf(str.charAt(i));
//          if(String.valueOf(letter))
//        }
//    }
//}
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String input = "Able was I ere I saw Elba";

        // Khởi tạo stack và queue
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        // Đưa từng ký tự của chuỗi vào stack và queue
        for (int i = 0; i < input.length(); i++) {
            char ch = Character.toLowerCase(input.charAt(i));
            if (Character.isLetter(ch)) {
                stack.push(ch);
                queue.add(ch);
            }
        }

        boolean isPalindrome = true;

        // So sánh từng cặp phần tử trong stack và queue
        while (!stack.isEmpty() && !queue.isEmpty()) {
            char stackChar = stack.pop();
            char queueChar = queue.poll();

            if (stackChar != queueChar) {
                isPalindrome = false;
                break;
            }
        }

        // In kết quả
        if (isPalindrome) {
            System.out.println("Chuỗi '" + input + "' là chuỗi Palindrome.");
        } else {
            System.out.println("Chuỗi '" + input + "' không phải là chuỗi Palindrome.");
        }
    }
}

