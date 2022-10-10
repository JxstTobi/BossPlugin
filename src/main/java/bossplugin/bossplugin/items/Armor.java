package bossplugin.bossplugin.items;

import org.bukkit.Material;

public abstract class Armor {
    private final ArmorTypes armorType;
    private final Material material;

    public Armor(ArmorTypes armorType, Material material) {
        this.armorType = armorType;
        this.material = material;
    }

    public ArmorTypes getArmorType() {
        return armorType;
    }

    public Material getMaterial() {
        return material;
    }

    public abstract double getDefence();

    public abstract void setDefence(double defence);

    public abstract void setSpecialDefence(double defence);

    public abstract void setHealthBonus();
}
