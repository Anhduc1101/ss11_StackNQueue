package bt2.kiemTraChuoiDauVaoCoDauNgoacHayKhong;

import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

import static bt2.kiemTraChuoiDauVaoCoDauNgoacHayKhong.Test.validateBrackets;

public class Main {
    public static void main(String[] args) {
        String input1 = "{[()]}";
        String input2 = "{[()]}(";

        System.out.println("Chuỗi 1 : " + validateBrackets(input1));
        System.out.println("Chuỗi 2 : " + validateBrackets(input2));
    }
}
