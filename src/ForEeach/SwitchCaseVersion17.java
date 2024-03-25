package ForEeach;

import java.util.Scanner;

public class SwitchCaseVersion17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            String text  = sc.nextLine();
            switch (text) {
                case "Hello" -> System.out.println("Text is 'Hello'");
                case "Hi" -> System.out.println("Text is 'Hi'");
                case "Goodbye" -> System.out.println("Text is 'Goodbye'");
                case "Hello, world!" -> System.out.println("Text is 'Hello, world!'");
                default -> System.out.println("Unknown text");
            }

            String email = "john@example.com";

            switch (email) {
                case ".*@example.com" -> System.out.println("Email is from example.com");
                case "[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}" -> System.out.println("Valid email address");
                default -> System.out.println("Invalid email address");
            }
        }

    }
}
