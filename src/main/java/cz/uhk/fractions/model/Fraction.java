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

    public Fraction multiply(Fraction second) {
        return new Fraction(top * second.top, bottom * second.bottom);
    }

    public Fraction divide(Fraction second) {
        return new Fraction(top * second.bottom, bottom * second.top);
    }

    public Fraction add(Fraction second) {
        return new Fraction((top * second.bottom) + (second.top * bottom), bottom * second.bottom);
    }

    public Fraction subtract(Fraction second) {
        return new Fraction((top * second.bottom) - (second.top * bottom), bottom * second.bottom);
    }

    public Fraction shorten(int divisor) {
        return new Fraction(top / divisor, bottom / divisor);
    }

    @Override
    public String toString() {
        return String.format("%d/%d", top, bottom);
    }
}
