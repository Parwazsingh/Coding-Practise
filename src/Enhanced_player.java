public class Enhanced_player {

    private String name;

    private int health;

    private String weapon;

    public Enhanced_player(String name) {
        this(name, 100, "churra");
    }

    public Enhanced_player(String name, int health, String weapon) {
        this.name = name;
        if(health<0){
            this.health = 1;
        }
        else if (health > 100){
            this.health = 100;
        }
        else
    {
        this.health = health;
    }
        this.weapon = weapon;
    }

    public void losehealth(int damage){
        health = health - damage;
        if(health<=0){
            System.out.println("player is dead");
        }
    }
    public int healthremaining(){
        return health;
    }

public void restoreHealth(int extrahealth){
        health = health + extrahealth;
        if(health>100){
            System.out.println("player restored to 100%");
            health = 100;
        }
}
}
