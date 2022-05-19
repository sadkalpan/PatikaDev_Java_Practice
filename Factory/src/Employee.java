public class Employee {
    private StringBuffer name;
    private int salary;
    private int workHours;
    private int hireYear;

    public Employee(StringBuffer name, int salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    public int tax(){
        if(this.salary>=1000){
            //this.salary = this.salary - this.salary*3/100;
            return this.salary*3/100;
        }
        else{
            return 0;
        }
    }
    public int bonus(){
        if(this.workHours>40){
            //this.salary = this.salary + (this.workHours-40)*30;
            return (this.workHours-40)*30;
        }
        else{
            return  0;
        }
    }
    public int raiseSalary() {
        if (2021 - this.hireYear < 10) {
            //this.salary = this.salary + (this.salary * 5) / 100;
            return (this.salary * 5) / 100;
        } else if (2021 - this.hireYear < 20) {
            //this.salary = this.salary + (this.salary * 10) / 100;
            return (this.salary * 10) / 100;
        }
        else{
            //this.salary = this.salary + (this.salary*15)/100;
            return (this.salary*15)/100;
        }
    }
    public String toString(){
        return "Name:\t"+this.name+"\n"+"Salary:\t"+this.salary+"\n"+"Work hour:\t"+
                this.workHours+"\n"+"Hire year:\t"+this.hireYear+"\n"+"Tax:\t"+this.tax()+"\n"+
                "Bonus\t:"+this.bonus()+"\n"+"Raise salary\t:"+this.raiseSalary()+"\n"+
                "Bonus and tax with salary\t:"+ this.bonus()+this.tax();
    }

}
