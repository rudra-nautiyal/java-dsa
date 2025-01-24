package userInput;

import java.util.Scanner;

public class Project_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = input.nextLine();
        System.out.println("Good Morning " + name);
    }
}
