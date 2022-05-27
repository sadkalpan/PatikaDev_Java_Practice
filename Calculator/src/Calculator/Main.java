package Calculator;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter a process: ");
        String number = inp.next();

        Calculate calculate = new Calculate(number,20,12);
        calculate.switchCase();
    }
}
