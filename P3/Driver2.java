public class Driver2 {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(2, 4);
        Fraction f3 = new Fraction(3, 6);
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        if (f1.equals(f2))
            System.out.println("f1 and f2 are equal");
        if (f2.equals(f3))
            System.out.println("f2 and f3 are equal");
    }
}