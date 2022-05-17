public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course mat_performance;
    Course fizik;
    Course fzk_performance;
    Course kimya;
    Course kim_performance;
    double average;
    boolean isPass = false;
    Student(String name, String stuNo, int classes, Course mat, Course fizik, Course kimya){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calculateAvarage();
        this.isPass=false;
    }
    public void addBulkExamNote(int mat, int mat_performance,  int fizik, int fzk_performance, int kim_performance,int kimya){
        if(mat>0 || mat<100){
            this.mat.note = mat;
            this.mat.performance_note = mat_performance;
        }
        if(fizik>0 || fizik<100){
            this.fizik.note = fizik;
            this.fizik.performance_note = fzk_performance;
        }
        if(kimya>0 || kimya<100){
            this.kimya.note = kimya;
            this.kimya.performance_note = kim_performance;
        }
    }
    public void calculateAvarage(){

        this.average = (((this.mat.note+this.fizik.note+this.kimya.note) * 0.80)+((this.mat.performance_note+this.fizik.performance_note+this.kimya.performance_note) * 0.20))/3;
    }
    public void isPass(){
        if(this.mat.note==0 || this.fizik.note==0 || this.kimya.note==0){
            System.out.println("Some note missed");
        }
        else{
            this.isPass = isPassCheck();
            printNote();
            System.out.println("Note average: " + this.average);
        if (this.isPass){
            System.out.println("Pass the class");
        }
        else{
            System.out.println("Fail the class");
            }
        }
    }
    public boolean isPassCheck(){
        calculateAvarage();
        return this.average > 60;
    }
    public void printNote(){
        System.out.println("=========================");
        System.out.println("Ogrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Kimya Notu : " + this.kimya.note);
    }
}
