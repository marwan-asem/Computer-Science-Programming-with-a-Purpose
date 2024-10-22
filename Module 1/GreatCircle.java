
public class GreatCircle {
    public static void main(String[] args) {
        double x1 = Double.parseDouble(args[0]);
        double y1 = Double.parseDouble(args[1]);
        double x2 = Double.parseDouble(args[2]);
        double y2 = Double.parseDouble(args[3]);
        x1 = Math.toRadians(x1);
        x2 = Math.toRadians(x2);
        y1 = Math.toRadians(y1);
        y2 = Math.toRadians(y2);

        double r = 6371.0;
        double sinXsinXX = Math.sin((x2 - x1) / 2) * Math.sin((x2 - x1) / 2);
        double sinXsinYY = Math.sin((y2 - y1) / 2) * Math.sin((y2 - y1) / 2);
        double Squrt = Math.sqrt(sinXsinXX + (Math.cos(x1) * Math.cos(x2)) * sinXsinYY);
        double distanc = r * 2 * Math.asin(Squrt);
        System.out.println(distanc + " kilometers");


    }
}
