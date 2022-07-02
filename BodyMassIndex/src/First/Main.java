package First;
import java.util.Scanner;
import java.io.File;

public class Main {
    public static void main(String[] args) throws  Exception{
        //File file = new File("C:\\Users\\sadka\\OneDrive\\Belgeler\\JAVA\\IdeaProjects\\BodyMassIndex\\src\\First\\Input");
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your height:");
        float height = input.nextInt();
        System.out.println("Enter your weight:");
        float weight = input.nextInt();

        BMI bmi = new BMI(height, weight);
        System.out.println(bmi.calculate());
    }
}
