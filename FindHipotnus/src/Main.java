import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner imp = new Scanner(System.in);
        int side, i, sum=0;
        float u, step, area=1;
        int arr1[] = new int[3];

        for(i=0; i<3; i++){
            System.out.println("enter the "+(i+1)+". triangle side: ");
            arr1[i] = imp.nextInt();
            sum += arr1[i];
        }
        u = sum/2;

        for(i=0; i<3; i++){
            step = (u-arr1[i]);
            area *= step;
        }
        System.out.println("the area of triangle is: " + area);

    }
}