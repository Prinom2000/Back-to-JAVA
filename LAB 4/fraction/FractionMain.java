
package fraction;

public class FractionMain {
    public static void main(String[] args) {

        Fraction fr1 = new Fraction();
        Fraction fr2 = new Fraction();

        fr1.setNumerator(22);
        fr1.setDenominator(50);
        fr2.setNumerator(77);
        fr2.setDenominator(99);
        System.out.println("Fractions: ");
        System.out.println("f1: " + fr1.toString());
        System.out.println("f2: " + fr2.toString());

        fr1.add(fr2);
        System.out.println("f1 Addition result: " + fr1.toString());

        fr1.sub(fr2);
        System.out.println("f1 Subtraction result: " + fr1.toString());

        fr1.multiplication(fr2);
        System.out.println("f1 Multiplication result: " + fr1.toString());

        fr1.division(fr2);
        System.out.println("f1 Division result: " + fr1.toString());
    }
}

