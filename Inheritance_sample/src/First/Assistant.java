package First;

public class Assistant extends Academician {
    private String ofice_time;
    public Assistant(String name_sname, String tel, String email, String department, String degree, String ofice_time){
        super(name_sname, tel, email, department, degree);
        this.ofice_time = ofice_time;
    }
    public void have_quiz(){
        System.out.println();
    }
}
