package lesson1;

import java.util.Scanner;

public class Home2 {

    public static void main(String[] args) {

        System.out.print("Enter your name: ");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Hello, " + name + "!");

    }

}
