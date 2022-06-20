package First;

public class Main {
    public static void main(String[] args){
    Workers w1 = new Workers("ahmet", "111", "ahmet@gmail");
    w1.enter();
    Academician a1 = new Academician("mehmet","222", "mehmet@gmail", "Computer", "Assistant Proffesor");
    a1.enter_class();
    }
}
