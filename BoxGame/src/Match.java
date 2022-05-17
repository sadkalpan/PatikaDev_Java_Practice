import java.util.Random;

public class Match {
    Random random =new Random();
    private Fighter f1;
    private Fighter f2;
    int minWeight;
    int maxWeight;
    public Match(Fighter f1, Fighter f2, int minWeight, int maxWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.maxWeight = maxWeight;
        this.minWeight = minWeight;
    }
    public void run(){
        if(this.isCheck()){
            while((this.f1.health>0)&&(this.f2.health>0)){
                if(random.nextInt(2)%2==0){
                    System.out.println("NEW ROUND");
                    this.f2.health = this.f1.hit(f2);
                    System.out.println(this.f2.name+"'s health "+this.f2.health);
                    if(isWin()){
                        break;
                    }
                    this.f1.health = this.f2.hit(f1);
                    System.out.println(this.f1.name+"'s health "+this.f1.health);
                    if(isWin()){
                        break;
                    }
                    else{
                        System.out.println("NEW ROUND");
                        this.f1.health = this.f2.hit(f1);
                        System.out.println(this.f1.name+"'s health "+this.f1.health);
                        if(isWin()){
                            break;
                        }
                        this.f2.health = this.f1.hit(f2);
                        System.out.println(this.f2.name+"'s health "+this.f2.health);
                        if(isWin()){
                            break;
                        }
                    }
                }

            }
        }
        else{
            System.out.println("athletes have different weights");
        }
    }
    public boolean isCheck(){
        return ((this.f1.weight<=this.maxWeight && this.f1.weight>=this.minWeight) && (this.f1.weight<=maxWeight && this.f1.weight>=this.minWeight));
    }
    public boolean isWin(){
        if(this.f1.health==0){
            System.out.println(f2.name+" is win");
            return true;
        }
        if(this.f2.health==0){
            System.out.println(f1.name+" is win");
            return true;
        }
        return false;
    }
}
