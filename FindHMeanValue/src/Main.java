import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        float[] numbers = {1,2,4,5};
        HMeanValue m = new HMeanValue(numbers);
        System.out.println("Mean value is: "+m.HarmonicMean());

    }
    static class HMeanValue {
        private float[] a;
        private float sum=0;
        private float b;
        public HMeanValue(float[] a){
            this.a = a;
        }
        public float HarmonicMean(){
            for(int i=0; i<this.a.length; i++){
                System.out.println(this.b += 1/this.a[i]);
            }
            return 0;
        }
    }
}
