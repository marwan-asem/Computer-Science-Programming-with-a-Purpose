public class RightTriangle {

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        boolean isPositive;
        isPositive = (a > 0) && (b > 0) && (c > 0);
        boolean isTrue = isPositive && (
                a * a + b * b == c * c || a * a + c * c == b * b || a * a == b * b + c * c
        );
        System.out.println(isTrue);
    }


}
