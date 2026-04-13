public class evenlySpaced {
    public static boolean evenlySpaced(int a, int b, int c) {

        int small;
        int middle;
        int large;

        if (a <= b && a <= c) {
            small = a;
        } else {
            if (b <= a && b <= c) {
                small = b;
            } else {
                small = c;
            }
            if (a <= b && a >= b) {
                large = a;
            } else {
                if (b <= a && b <= c) {
                    large = b;
                } else {
                    large = c;
                    middle = a + b + c - small - large;
                }
            }
        }









