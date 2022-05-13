import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner imp = new Scanner(System.in);
        int price;
        float KDV;
        System.out.println("Enter the price: ");
        price = imp.nextInt();

        if(price>=1000){
            KDV = price - (price*100)/108;
        }
        else{
            KDV = price - (price*100)/118;
        }
        System.out.println("KDV price is: " + KDV);
    }
}