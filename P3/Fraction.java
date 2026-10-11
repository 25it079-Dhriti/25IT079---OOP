import java.util.Objects;
public class Fraction {
    private int num;
    private int den;
    Fraction(int n, int d) {
        int g = gcd(n, d);
        num = n / g;
        den = d / g;
    }
    int gcd(int a, int b) {
        while (a % b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return b;
    }
    public String toString() {
        return num + "/" + den;
    }
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Fraction))
            return false;
        Fraction f = (Fraction) o;
        return num == f.num && den == f.den;
    }
    public int hashCode() {
        return Objects.hash(num, den);
    }
}