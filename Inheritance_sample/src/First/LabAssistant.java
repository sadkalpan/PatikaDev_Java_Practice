package First;

public class LabAssistant extends Assistant{
    public LabAssistant(String name_sname, String tel, String email, String department, String degree, String ofice_time){
        super(name_sname, tel, email, department, degree, ofice_time);
    }

    public void enter_lab(){
        System.out.println(this.getName_sname()+" enter the lab.");
    }
    public void enter_class(){
        System.out.println(this.getName_sname()+" enter the class.");
    }
}
