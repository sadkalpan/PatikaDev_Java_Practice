import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner imp = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = imp.nextInt();

        int[] list = {1,10,20,30,40};

        FindMaxMin f = new FindMaxMin(list, number);
        System.out.println(f.toString());
    }
    public static class FindMaxMin{
        private int[] list;
        private int[] copyList;
        private int number;
        public FindMaxMin(int[] list, int number){
            this.list = list;
            copyList = Arrays.copyOf(list, list.length);
            System.out.println(Arrays.toString(copyList));
            this.number = number;
        }

        public void sort(){
            for(int i=0; i<this.copyList.length; i++){
                this.copyList[i] = this.list[i]-this.number;
            }
        }
        public int fmin(){
            int a=0 ,min=100000;
            for (int i=0; i<this.list.length; i++){
                //a = this.copyList[i]-this.number;
                if(this.copyList[i]<this.number && this.copyList[i]<min){
                    min = this.list[i];
                }
            }
            return min;
        }
        public int fmax(){
            int a=0 ,max=100;
            for (int i=0; i<this.list.length; i++){
                //a = this.list[i]-this.number;
                if(this.copyList[i]>this.number && this.copyList[i]<max){
                    max = this.list[i];
                }
            }
            return max;
        }
        public String toString(){
            return "Closest min value: "+this.fmin()+"\n"+
                    "Closest max value: "+this.fmax();
        }
     }
}
