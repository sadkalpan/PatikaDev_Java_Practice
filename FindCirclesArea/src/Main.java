import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner imp = new Scanner(System.in);
        final float pi = 3.14f;
        int r, alpha;
        float circumferece, area, sarea;

        System.out.println("Enter the radius: ");
        r = imp.nextInt();

        System.out.println("Enter the alpha: ");
        alpha = imp.nextInt();

        circumferece = 2*pi*r;
        area = pi*(r*r);

        sarea = (area*alpha)/360;

        System.out.println("The circumference of triangle is: "+circumferece+"The area of the triangle is: "+area+" the circumference of triangle is: "+sarea);

    }
}