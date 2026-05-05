package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        PasswordStrengthValidator.Strength strength =
            PasswordStrengthValidator.checkStrength(password);

        System.out.println("Password strength: " + strength);
        scanner.close();
    }
}
