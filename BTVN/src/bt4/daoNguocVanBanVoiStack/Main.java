package bt4.daoNguocVanBanVoiStack;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
//        B1: tạo 1 stack để lưu trữ văn bản
        Stack<String> stack=new Stack<>();
//        B2 tạo 1 biến numberOfWord để lưu số lượng các từ
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập vào số lượng từ bạn muốn thêm: ");
        int numberOfWord= Integer.parseInt(scanner.nextLine());
//        B3: tạo 1 vòng lặp for với số lần lặp = số lượng các từ, mỗi vòng lặp cho nhập 1 từ. rồi push vào stack.
        for (int i = 0; i < numberOfWord; i++) {
            System.out.println("Nhập vào từ thứ "+(i+1)+" :");
            String str=scanner.nextLine();
            stack.push(str);
        }
        System.out.println("Các từ có trong stack là: "+stack);
        for (int i = stack.size()-1; i >=0; i--) {
            System.out.println("Các từ có trong stack sau khi đảo ngược là: "+stack);
            break;
        }
    }
}
