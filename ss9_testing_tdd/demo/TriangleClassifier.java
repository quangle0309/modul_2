package ss9_testing_tdd.demo;

public class TriangleClassifier {

    public static final String TYPE_EQUILATERAL = "Equilateral";
    public static final String TYPE_ISOSCELES = "Isosceles";
    public static final String TYPE_NORMAL = "Normal";
    public static final String TYPE_INVALID = "Invalid";

    public static String classify(int a, int b, int c){
        if (a + b < c || c + b < a || c + a < b) {
            return TYPE_INVALID;
        } else if (a == b && b == c) {
            return TYPE_EQUILATERAL;
        } else if (a == b || b == c || c == a) {
            return TYPE_ISOSCELES;
        }
        return TYPE_NORMAL;
    }
}
