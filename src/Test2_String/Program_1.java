package Test2_String;

import java.util.Scanner;

public class Program_1 {
    public static void main(String[] args) {
        String input="Hello World";
        int length=input.length();
        System.out.println("Length="  +length);

        String firstChar= String.valueOf(input.charAt(0));
        System.out.println("FirstChar="  +firstChar);

        String subString= input.substring(5,11);
        System.out.println("SubString="  +subString);


    }
}
