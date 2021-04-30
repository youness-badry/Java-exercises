import java.math.BigInteger;

public class Fraction {

    private BigInteger num;
    private BigInteger den;

    public Fraction(BigInteger num, BigInteger den) {
        this.num = num;
        this.den = den;
    }
    public Fraction(int n, int d) {

        this.num = BigInteger.valueOf(n);
        this.den = BigInteger.valueOf(d);
    }
    public Fraction(int n) {

        this(n,1);
    }
    public Fraction() {

        this.num = BigInteger.valueOf(0);
        this.den = BigInteger.valueOf(1);
    }
    public Fraction add(Fraction f) {
        Fraction fraction = new Fraction();
        fraction.num = num.multiply(f.den).add(den.multiply(f.num));
        fraction.den = den.multiply(f.den);
        return fraction;
    }
    public Fraction sub(Fraction f) {
        Fraction fraction = new Fraction();
        fraction.num = num.multiply(f.den).subtract(den.multiply(f.num));
        fraction.den = den.multiply(f.den);
        return fraction;
    }
    public Fraction mult(Fraction f) {
        Fraction fraction = new Fraction();
        fraction.num = num.multiply(f.num);
        fraction.den = den.multiply(f.den);
        return fraction;
    }
    public Fraction divi(Fraction f) {
        Fraction fraction = new Fraction();
        fraction.num = num.multiply(f.den);
        fraction.den = den.multiply(f.num);
        return fraction;
    }
    public String toString() {
        return num.toString()+"/"+den.toString();
    }
    public double doubleValue() {
        return num.divide(den).doubleValue();
    }
    public BigInteger getNum() {
        return num;
    }
    public BigInteger getDen() {
        return den;
    }
}
