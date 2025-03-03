package cz.uhk.fractions.model;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class ListOfFractions {
    private List<Fraction> fractions = new ArrayList<>();

    public void addFraction(Fraction fraction) {
        fractions.add(fraction);
    }

    public void removeFraction(int index) {
        fractions.remove(index);
    }

    public Fraction returnFraction(int index) {
        return fractions.get(index);
    }

    public void printFractions(PrintStream out) {
        for (Fraction fraction : fractions) {out.printf("[%s]\n",fraction.toString());}
    }


    //add sum and avg later since i fucking cant take it anymore
    //also add all the testing shit

}
