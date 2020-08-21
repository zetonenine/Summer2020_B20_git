package Utility;

import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
        reverse(scan.next());
    }

    public static void reverse(String input) {
        for (int i = input.length() - 1; 0 <= i; i--) {
            System.out.print(input.charAt(i) + "");
        }


    }
}