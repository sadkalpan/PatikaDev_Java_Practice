package First;

public class Officer extends Workers {
    private String department;
    private String shift;
    public Officer(String name_sname, String tel, String email, String department, String shift){
        super(name_sname, tel, email);
        this.department = department;
        this.shift = shift;
    }
    public void work(){
        System.out.println();
    }
}
