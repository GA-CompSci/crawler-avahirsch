package monsters;

public abstract class Monster {
    // encasulated variables
    private int health;
    private int levelModifier;
    private int minDamage;
    private int maxDamage;
    private String name;

    // blank constructor
    public Monster() {
        this.health = 100;
        levelModifier = 1;
        minDamage = 1;
        maxDamage = 10;
        name = "Monster";
    }

    // constructor with params
    public Monster(int h, int l, int min, int max, String n) {
        health = h;
        this.levelModifier = l;
        this.minDamage = min;
        this.maxDamage = max;
        this.name = n;
    }

    // health modifier
    public void setHealth(int health){
        this.health = health;
    }

    // accessors
    public int getHealth() {
        return health;
    }

    public int getLevelModifier() {
        return levelModifier;
    }

    public int getDamage() {
        int x = (int) (Math.random() * (maxDamage - minDamage) + minDamage);
        return x;
    }
}
