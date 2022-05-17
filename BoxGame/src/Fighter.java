public class Fighter {
    String name;
    int weight;
    int health;
    int damage;
    int dodge;

    public Fighter(String name, int weight, int health, int damage, int dodge) {
        this.name = name;
        this.weight = weight;
        this.health = health;
        this.damage = damage;
        if(dodge<100 && dodge>0){
            this.dodge = dodge;
        }
        else{
            this.dodge = 0;
        }


    }/*
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setWeight(){
        this.weight = weight;
    }
    public int getWeight(){
        return this.weight;
    }
    public void setDodge(int damage){
        this.damage = damage;
    }
    public double getDodge(){
        return this.dodge;
    }
    public void setHealth(int health){
        this.health = health;
    }
    public int getHealth(){
        return this.health;
    }
*/
    public int hit(Fighter foe){
        System.out.println(this.name+"=>"+foe.name+" "+this.damage+" hit");
        if (foe.isDodge()){
            System.out.println(foe.name+" blocked damage");
            return foe.health;
        }
        if(foe.health - this.damage < 0){
            return 0;
        }
        return foe.health - this.damage;
    }
    boolean isDodge(){
         double randomNumber = Math.random()*100;
         return randomNumber <= this.dodge;
    }


}
