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
        list.addFraction(new Fraction(3,5));
        assertEquals(1, list.fractionsAmount(), "Amount of Fractions");
        list.removeFraction(0);
        assertEquals(0, list.fractionsAmount(), "Amount of fractions after removing");
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
    void sumOfFractions() {
        list.addFraction(new Fraction(4, 8));
        list.addFraction(new Fraction(3, 7));
        Fraction x = list.sumOfFractions();
        assertEquals(52, x.getTop(), "Top");
        assertEquals(56, x.getBottom(), "Bottom");
    }

    @Test
    void fractionsAverage() {
        list.addFraction(new Fraction(4, 8));
        list.addFraction(new Fraction(3, 7));
        list.addFraction(new Fraction(5, 6));
        Fraction x = list.fractionsAverage();
        assertEquals(592, x.getTop(), "Top");
        assertEquals(1008, x.getBottom(), "Bottom");
    }

    //shorten function is flawed, so it cant be used
}