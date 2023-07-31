package threeweekfive;

public class FractionalTest {
    public static void main(String[] args) {
        int[] 분수1 = Fractional.fractional(1, 2);
        int[] 분수2 = Fractional.fractional(2, 4);
        int[] 분수3 = Fractional.fractional(4, 8);
        int[] 분수4 = Fractional.fractional(1, 1);

        // boolean same = equals(add(분수1, 분수2), 분수4);
        System.out.println(Fractional.equals(Fractional.add(분수1, 분수2), 분수4));
        System.out.println(Fractional.equals(Fractional.add(분수1, 분수3), 분수4));
        System.out.println(Fractional.equals(Fractional.add(분수2, 분수3), 분수4));

        System.out.println(Fractional.toString(Fractional.add(분수1, 분수2)));
        System.out.println(Fractional.toString(분수1));
        System.out.println(Fractional.toString(분수2));
        System.out.println(Fractional.toString(분수3));
    }
}
