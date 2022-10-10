package bossplugin.bossplugin.bosses;

public abstract class Boss {
    private final int tier;
    private String name;
    private double hp;
    private double damage;

    public Boss(String name, int tier, double hp, double damage) {
        this.name = name;
        this.tier = tier;
        this.hp = hp;
        this.damage = damage;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTier() {
        return tier;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }
}
