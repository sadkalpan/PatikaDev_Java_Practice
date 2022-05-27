package Calculator;

public class Calculate {
    protected String choice;
    protected int number1;
    protected int number2;
    protected Calculate(String choice, int number1, int number2){
        this.number1 = number1;
        this.number2 = number2;
        this.choice = choice;
    }
    protected void switchCase(){
        switch(this.choice){
            case "1":
                System.out.println("summaration:"+(this.number1+this.number2));
                break;
            case "2":
                System.out.println("subtraction:"+(this.number1-this.number2));
                break;
            case "3":
                System.out.println("division:"+(float)(this.number1/this.number2));
                break;
            case "4":
                System.out.println("multiplication:"+(this.number1*this.number2));
                break;
            default:
                System.out.println("Given value is not valid");
        }
    }

}
