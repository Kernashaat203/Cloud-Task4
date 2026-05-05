package com.example;

public class PasswordStrengthValidator {
    public enum Strength {
            WEAK, MEDIUM, STRONG
    }
    public static Strength checkStrength(String password) {
            if (password == null || password.length() < 8) {
                return Strength.WEAK;
            }

            int score = 0;

            if (password.matches(".*[A-Z].*")) score++;      // uppercase
            if (password.matches(".*[a-z].*")) score++;      // lowercase
            if (password.matches(".*\\d.*")) score++;        // digit
            if (password.matches(".*[@#$%^&+=!].*")) score++; // special char

            if (score <= 2) return Strength.WEAK;
            else if (score == 3) return Strength.MEDIUM;
            else return Strength.STRONG;
    }
}

