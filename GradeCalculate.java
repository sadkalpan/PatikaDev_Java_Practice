import java.util.Scanner;

public class GradeCalculate {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int mathematic, physic, chemistry, turkish, history, music;
        float average_grade;
        String StringResult;

        System.out.println("enter your mathematic grade: ");
        mathematic = inp.nextInt();

        System.out.println("enter your physic grade: ");
        physic = inp.nextInt();

        System.out.println("enter your chemistry grade: ");
        chemistry = inp.nextInt();

        System.out.println("enter your turkish grade: ");
        turkish = inp.nextInt();

        System.out.println("enter your history grade: ");
        history = inp.nextInt();

        System.out.println("enter your music grade: ");
        music = inp.nextInt();

        average_grade = (mathematic+physic+chemistry+turkish+history+music)/6;
        System.out.println("Avarega grade is the: " + average_grade);

        StringResult =  average_grade > 60 ? "sinifi gecti" : "sinifta kaldi";
        System.out.println(StringResult);
    }
}
