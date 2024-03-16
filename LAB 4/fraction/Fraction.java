
package fraction;

class Fraction {
    private int numerator, denominator;

    Fraction() {
    }

    Fraction(int num, int denom) {
        this.numerator = num;
        this.denominator = denom;
    }

    public void setNumerator(int num) {
        numerator = num;
    }

    public void setDenominator(int denom) {
        denominator = denom;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public String toString() {
        return " " + numerator + '/' + denominator;
    }

    public void add(Fraction fr) {
        numerator = (this.numerator * fr.denominator) + (this.denominator * fr.numerator);
        denominator = (this.denominator * fr.denominator);
        simplify();
    }

    public void sub(Fraction fr) {
        numerator = (this.numerator * fr.getDenominator()) - (this.denominator * fr.numerator);
        denominator = (this.denominator * fr.denominator);
        simplify();
    }

    public void multiplication(Fraction fr) {
        numerator = (this.numerator * fr.numerator);
        denominator = (this.denominator * fr.denominator);
        simplify();
    }

    public void division(Fraction fr) {
        numerator = (this.numerator * fr.denominator);
        denominator = (this.denominator * fr.numerator);
        simplify();
    }

    void simplify() {
        int gcd = GCD(numerator, denominator);
        numerator = numerator / gcd;
        denominator = denominator / gcd;
    }

    int GCD(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return GCD(num2, num1 % num2);
    }
}
