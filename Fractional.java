package threeweekfive;

public class Fractional {
    // int numerator;
    // int denominator;

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static int[] fractional(int x, int y) {
        int[] z = { x, y };
        normalize(z);
        return z;

    }

    public static String toString(int[] x) {
        return getNumerator(x) + "/" + getDenominator(x);
    }

    public static boolean equals(int[] x, int[] y) {
        return getNumerator(x) == getNumerator(y) && getDenominator(x) == getDenominator(y);
    }

    private static void normalize(int[] rational) {
        int z = gcd(rational[0], rational[1]);
        rational[0] /= z;
        rational[1] /= z;
        /*
         * int z = gcd(getNumerator(rational), getDenominator(rational));
         * getNumerator(rational) /= z;
         * getDenominator(rational) /= z;
         */ // 오류구문
    }

    public static int getNumerator(int[] fractional) {
        // normalize(fractional);
        return fractional[0]; // 분자
    }

    public static int getDenominator(int[] fractional) {
        // normalize(fractional);
        return fractional[1]; // 분모
    }

    public static int[] add(int[] 분수1, int[] 분수2) {

        return fractional((getNumerator(분수1) * getDenominator(분수2)) + (getNumerator(분수2) *
                getDenominator(분수1)), getDenominator(분수1) * getDenominator(분수2));

    }

    public static void main(String[] args) {
        int[] 분수1 = Fractional.fractional(1, 2);
        int[] 분수2 = Fractional.fractional(2, 4);
        int[] 분수3 = Fractional.fractional(4, 8);
        int[] 분수4 = Fractional.fractional(1, 1);

        // boolean same = equals(add(분수1, 분수2), 분수4);
        System.out.println(equals(add(분수1, 분수2), 분수4));
        System.out.println(equals(add(분수1, 분수3), 분수4));
        System.out.println(equals(add(분수2, 분수3), 분수4));

        add(분수1, 분수2);
        System.out.println(toString(add(분수1, 분수2)));
        System.out.println(toString(분수1));
        System.out.println(toString(분수2));
        System.out.println(toString(분수3));
    }

}
