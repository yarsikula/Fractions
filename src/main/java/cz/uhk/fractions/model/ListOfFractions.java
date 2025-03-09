package cz.uhk.fractions.model;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class ListOfFractions {
    private List<Fraction> fractions = new ArrayList<>();

    public void addFraction(Fraction fraction) {
        if (fraction != null) {
            fractions.add(fraction);
        }
        else {throw new NullPointerException("Fraction null");}
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

    public Fraction sumOfFractions() {
        Fraction sum = new Fraction(0, 1);
        for(Fraction x : fractions){
            sum = sum.add(x);
        }
        return sum;
    }

    public Fraction fractionsAverage() {
        Fraction sum = sumOfFractions();
        Fraction amount = new Fraction(fractions.size(),1);
        return sum.divide(amount);
    }

    public int fractionsAmount() {
        return fractions.size();
    }
    //also add all the testing shit

}
