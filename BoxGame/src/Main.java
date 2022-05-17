//declare

public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Ali", 85, 120, 10, 30);
        Fighter f2 = new Fighter("Mehmet", 75, 100, 20, 40);

        Match match = new Match(f1, f2, 60, 100);
        match.run();
    }
}