public class Main {
    public static void main(String[] args){
        StringBuffer s = new StringBuffer("Ahmet");
        Employee e1 = new Employee(s, 2000, 45, 1985);
        System.out.println(e1.toString());
    }
}
