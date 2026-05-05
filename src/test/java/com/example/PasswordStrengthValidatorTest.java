package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PasswordStrengthValidatorTest {

    @Test
    void passwordIsNull_shouldReturnWeek() {
        assertEquals(PasswordStrengthValidator.Strength.WEAK, PasswordStrengthValidator.checkStrength(null));
    }

    @Test
    void passwordIsTooShort_shouldReturnWeek() {
        assertEquals(PasswordStrengthValidator.Strength.WEAK, PasswordStrengthValidator.checkStrength("Ab1@xyz"));
    }

    @Test
    void twoRulesMatch_shouldReturnsWeak() {
        assertEquals(PasswordStrengthValidator.Strength.WEAK, PasswordStrengthValidator.checkStrength("abcdefgh"));
    }

    @Test
    void threeRulesMatch_shouldReturnsMedium() {
        assertEquals(PasswordStrengthValidator.Strength.MEDIUM, PasswordStrengthValidator.checkStrength("Abcdefg1"));
    }

    @Test
    void AllRulesMatch_shouldReturnsStrong() {
        assertEquals(PasswordStrengthValidator.Strength.STRONG, PasswordStrengthValidator.checkStrength("Abcdef1!"));
    }
}
