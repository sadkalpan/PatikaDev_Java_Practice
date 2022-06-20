package First;

public class Lecturer extends Academician {
    private String gateNo;
    public Lecturer(String name_sname, String tel, String email, String department, String degree, String gateno){
        super(name_sname, tel, email, department, degree);
        this.gateNo = gateno;
    }
    public void setGateNo(String gateNo) {
        this.gateNo = gateNo;
    }
    public String getGateNo(){
        return gateNo;
    }
    public void senate_meeting(){
        System.out.println();
    }
    public void have_an_exam(){
        System.out.println();
    }
}
