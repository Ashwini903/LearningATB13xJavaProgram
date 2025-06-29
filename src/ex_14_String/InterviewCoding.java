package ex_14_String;

import java.util.Scanner;

public class InterviewCoding {
    public static void main(String[] args) {

        Scanner SC = new Scanner(System.in);
        System.out.println("Enter the input");
        String input = SC.nextLine();

        String newStringReverserd = reversedString(input);
      //  String newStringReverserd=stringBuilder(input);

        if (newStringReverserd.equalsIgnoreCase(input)) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome");
        }

    }

    static String reversedString(String input) {
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }
        return  reversed;

    }
    static  String stringBuilder(String  input){
        StringBuilder stringBuilder=new StringBuilder(input);
        return stringBuilder.reverse().toString();
    }
}

