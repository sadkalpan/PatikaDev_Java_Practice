package First;

public class Academician extends Workers{
    private String department;
    private String degree;
    public Academician(String name_sname, String tel, String email, String department, String degree){
        super(name_sname, tel, email);
        this.department = department;
        this.degree = degree;
    }
    public void enter_class(){
        System.out.println(this.getName_sname()+" enter the class");
    }
}
