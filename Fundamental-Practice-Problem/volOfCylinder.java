import java.util.*;
public class volOfCylinder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       float radius=sc.nextFloat();
        float height=sc.nextFloat();
        float Area= (float)(3.14*radius*radius*height);
        System.out.println(Area);;
    }
}
