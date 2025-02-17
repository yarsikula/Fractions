import cz.uhk.fractions.model.Fraction;

public class TheFractions {

    public static int isThereADivisor(Fraction a) {
        int top = a.getTop();
        int bottom = a.getBottom();
        int divisor = 2;
        int biggestDivisor = 1;

        while (divisor <= top && divisor <= bottom) {
            if (top%divisor == 0 && bottom%divisor == 0) {
                biggestDivisor = divisor;
            }
            divisor++;
        }
        System.out.printf("Biggest divisor found: %d\n",biggestDivisor);
        return biggestDivisor;
    }

    public static int isThereNeedForFraction(Fraction a) {
        if (a.getTop()%a.getBottom() == 0) {return a.getTop() / a.getBottom();} else {System.out.println("This fraction can't be an integer"); return 0;}
    }

    public static void main(String[] args) {
        //creating a fraction using a class
        Fraction a = new Fraction(3,4);
        Fraction b = new Fraction(8,3);

        Fraction c = a.multiply(b);
        System.out.printf("%s\n", c);

        int divisor = isThereADivisor(c);
        if (divisor > 1) {
            c = c.shorten(divisor);
            System.out.printf("After shortening %s\n", c);
        }
        int helpNumber = isThereNeedForFraction(c);
        if (helpNumber != 0) {System.out.printf("Fraction can be expressed as just %d\n", helpNumber);}

        c = a.divide(b);
        System.out.printf("%s\n", c);

        c = a.add(b);
        System.out.printf("%s\n", c);

        c = a.subtract(b);
        System.out.printf("%s\n", c);

    }
}
