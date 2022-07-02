package First;

public class BMI {
    private float weight;
    private float height;

    public BMI(float height, float weight){
        this.height=height;
        this.weight=weight;
    }
    public float calculate(){
        return this.weight/((this.height/100)*(this.height/100));
    }
}
