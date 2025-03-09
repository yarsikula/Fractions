package cz.uhk.fractions.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ListOfFractionsTest {
    ListOfFractions list;

    @BeforeEach
    void setUp() {
        list = new ListOfFractions();
    }

    @Test
    @DisplayName("Addition test")
    void addFraction() {
        list.addFraction(new Fraction(3,5));
        assertEquals(1, list.fractionsAmount(), "Amount of Fractions");
        Fraction x = list.returnFraction(0);
        assertEquals(3, x.getTop(), "Top");
        assertEquals(5, x.getBottom(), "Bottom");
    }

    @Test
    @DisplayName("Test of adding zeros")
    void addFractionNull() {
        assertThrows(NullPointerException.class, () -> list.addFraction(null));
    }

    @Test
    void removeFraction() {
    }

    @Test
    void returnFraction() {
        list.addFraction(new Fraction(3,5));
        Fraction x = list.returnFraction(0);
        assertEquals(3, x.getTop(), "Top");
        assertEquals(5, x.getBottom(), "Bottom");
    }

    @Test
    @DisplayName("Grabbing fractions from nothing")
    void returnFractionFromNothing() {
        assertThrows(IndexOutOfBoundsException.class, () -> list.returnFraction(0));
    }

    @Test
    void printFractions() {
    }

    @Test
    void sumOfFractions() {
    }

    @Test
    void fractionsAverage() {
    }
}