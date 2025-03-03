package cz.uhk.fractions.app;

import cz.uhk.fractions.model.Fraction;
import cz.uhk.fractions.model.ListOfFractions;

public class FractionList {

    public static void main(String[] args) {
        ListOfFractions fractions = new ListOfFractions();

        fractions.addFraction(new Fraction(3, 4));
        fractions.addFraction(new Fraction(5, 6));
        fractions.addFraction(new Fraction(7, 8));
        fractions.addFraction(new Fraction(9, 10));

        fractions.printFractions(System.out);

        fractions.removeFraction(3);
        System.out.println("after removing");
        fractions.printFractions(System.out);

    }
}
