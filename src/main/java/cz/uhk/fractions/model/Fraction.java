package cz.uhk.fractions.model;

public class Fraction {
    private int top;
    private int bottom;

    public Fraction(int top, int bottom) {
        this.top = top;
        this.bottom = bottom;
    }

    public int getTop() {return top;}
    public int getBottom() {return bottom;}

    @Override
    public String toString() {
        return String.format("%d/%d", top, bottom);
    }
}
