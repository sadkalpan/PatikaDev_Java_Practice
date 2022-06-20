package First;

public class SecurityOfficer extends Officer{
    private String document;
    public SecurityOfficer(String name_sname, String tel, String email, String department, String shift){
        super(name_sname, tel, email, department, shift);
    }
    public void setDocument(String document){
        this.document = document;
    }
    public String getDocument(){
        return document;
    }
}
