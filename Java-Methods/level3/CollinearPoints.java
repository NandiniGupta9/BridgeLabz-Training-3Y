public class CollinearPoints {
    public static void main(String[] args) {
        int x1=1, y1=1;
        int x2=2, y2=2;
        int x3=3, y3=3;

        System.out.println("Using slope: " + checkCollinearSlope(x1,y1,x2,y2,x3,y3));
        System.out.println("Using area: " + checkCollinearArea(x1,y1,x2,y2,x3,y3));
    }

    static boolean checkCollinearSlope(int x1,int y1,int x2,int y2,int x3,int y3) {
        return (y2-y1)*(x3-x2) == (y3-y2)*(x2-x1);
    }

    static boolean checkCollinearArea(int x1,int y1,int x2,int y2,int x3,int y3) {
        int area = x1*(y2-y3) + x2*(y3-y1) + x3*(y1-y2);
        return area == 0;
    }
}
