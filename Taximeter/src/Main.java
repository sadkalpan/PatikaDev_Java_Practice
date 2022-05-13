import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner imp = new Scanner(System.in);
        int distance;
        double price;

        System.out.println("Enter the distance: ");
        distance = imp.nextInt();

        price = (distance*2.20)+10;

        if(price>20){
            price = price;
        }
        else{
            price = 20;
        }
        System.out.println("The taxi price is:" + price);
    }
}