public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Ayse", "555", "MAT");
        Teacher t2 = new Teacher("Ahmet", "444", "FZK");
        Teacher t3 = new Teacher("Suzan", "222", "KIM");

        Course mat = new Course("Matematik", "101", "MAT");
        mat.addTeacher(t1);
        Course fizik = new Course("Matematik", "101", "FZK");
        fizik.addTeacher(t2);
        Course kimya = new Course("Fizik", "101", "KIM");
        kimya.addTeacher(t3);


        Student ahmet = new Student("ahmet", "1", 2, mat, fizik, kimya);
        ahmet.addBulkExamNote(90,65,60, 66, 58, 60);
        ahmet.isPass();
    }

}