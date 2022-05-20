import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        String[][] matris = { {"1","1","1","1","1","\n"},
                            {"1"," "," "," ","1","\n"},
                            {"1"," "," "," ","1","\n"},
                            {"1","1","1","1","1","\n"},
                            {"1"," "," "," ","1","\n"},
                            {"1"," "," "," ","1","\n"},
                            {"1","1","1","1","1","\n"}
        };
        PrintWord a = new PrintWord(matris);
    }
    public static class PrintWord{
        private String[][] matris;
        public PrintWord(String[][] matris){
            this.matris = matris;
            for(String[] i:this.matris){
                for(String j:i){
                    System.out.print(j);
                }
            }
        }
    }
}
