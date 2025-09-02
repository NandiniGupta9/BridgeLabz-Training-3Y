public class EuclideanLineEquation {
    public static void main(String[] args) {
        int x1=1,y1=1;
        int x2=4,y2=5;

        double distance = distance(x1,y1,x2,y2);
        System.out.println("Distance: " + distance);

        String equation = lineEquation(x1,y1,x2,y2);
        System.out.println("Line Equation: " + equation);
    }

    static double distance(int x1,int y1,int x2,int y2) {
        return Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
    }

    static String lineEquation(int x1,int y1,int x2,int y2) {
        int a = y2-y1;
        int b = x1-x2;
        int c = (x2*y1 - x1*y2);
        return a + "x + " + b + "y + " + c + " = 0";
    }
}
