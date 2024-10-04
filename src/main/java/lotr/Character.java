package lotr;
public class Character {
    private int power;
    private int hp;


    public Character(int power, int hp) {
        this.power = power;
        this.hp = hp;
    }


    public int getPower(){
        return power;
    }

    public void setPower(int power){
        this.power=power;
    }

    public int getHp(){
        return hp;
    }

    public void setHp(int hp){
        if (hp<0){
            this.hp=0;
        }
        else{
            this.hp=hp;
        }
    }

    public void kick(Character c){
        c.hp-=this.power;
    }


    public boolean isAlive(){
        return this.hp>0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName());
        sb.append("{hp=").append(hp);
        sb.append(", power=").append(power);
        sb.append('}');
        return sb.toString();
    }
}
