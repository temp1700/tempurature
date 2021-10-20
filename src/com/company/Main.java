package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the temperature?");
        int temp = scan.nextInt();
        double celc = temp;
        celc -= 32;
        celc *= 5.0 / 9.0;
        System.out.println("the temperature in celsius is");
        System.out.print(celc);
    }
}
