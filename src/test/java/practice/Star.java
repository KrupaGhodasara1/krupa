package practice;

import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
        //----------------------------------------Star--------------------------------------------------------
        for (int i = 0; i < 5; i++) {
            int j;
            for (j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //----------------------------------------Table-------------------------------------------------------
        int number;
        System.out.println("Enter a number for multipication table: ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();

        for (int i=1; i<=10; i++){
            System.out.println(number + " * " + i + " = " + (number*i));
        }

        //----------------------------------------Palindrome---------------------------------------------------
        String s = "madam";
        String rev = "";

        for (int i=s.length()-1; i>=0; i--){
            rev=rev+s.charAt(i);
        }
        System.out.println(rev);

        if (s.equals(rev)){
            System.out.println("it is palaindrome");
        }else {
            System.out.println("it is not palindrome");
        }
    }
}
