package bossplugin.bossplugin.bosses;

import org.bukkit.Location;

public abstract class Boss {
    private final int tier;
    private String name;
    private double hp;
    private double damage;
    protected Location location;

    public Boss(String name, int tier, double hp, double damage, Location location) {
        this.name = name;
        this.tier = tier;
        this.hp = hp;
        this.damage = damage;
        this.location = location;
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

    public abstract void setArmor();
    public abstract void setDrops();

    public Location getLocation(){
        return location;
    }
}
