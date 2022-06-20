package First;

public class Workers {
    private String name_sname;
    private String tel;
    private String email;

    public Workers(){}
    public Workers(String name_sname, String tel, String email){
        this.name_sname = name_sname;
        this.tel = tel;
        this.email = email;
    }
    public void setName_sname(String name_sname){
        this.name_sname = name_sname;
    }
    public String getName_sname(){
        return name_sname;
    }
    public void setTel(String tel){
        this.tel = tel;
    }
    public String getTel(){
        return tel;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }
    public void enter(){
        System.out.println(this.name_sname+" enter");
    }
    public void exit(){
        System.out.println(this.name_sname+" exit");
    }
    public void dining_hall(){
        System.out.println(this.name_sname+" enter the dining hall");
    }
}
