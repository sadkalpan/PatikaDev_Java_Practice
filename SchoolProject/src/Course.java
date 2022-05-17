import javax.rmi.ssl.SslRMIClientSocketFactory;
public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note, performance_note;
    Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        note = 0;
        performance_note = 0;
    }
    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)){
            this.teacher = teacher;
        }
        else{
            System.out.println("Akademisyen bu dersi vermiyor.");
    }
    }
    void printTeacher(){
        this.teacher.print();
    }


}
