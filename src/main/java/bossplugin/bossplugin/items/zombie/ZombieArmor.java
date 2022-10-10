package bossplugin.bossplugin.items.zombie;

import bossplugin.bossplugin.BossPlugin;
import bossplugin.bossplugin.items.Armor;
import bossplugin.bossplugin.items.ArmorTypes;
import bossplugin.bossplugin.items.DamageType;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataType;

import java.util.HashMap;

public class ZombieArmor extends Armor {
    private final String name;
    private final int tier;
    private final NamespacedKey defenceKey = new NamespacedKey(BossPlugin.getPlugin(), "Defence");
    private NamespacedKey specialDefenceKey;
    private ItemStack armorPiece;
    private double defence;
    private HashMap<DamageType, Double> specialDefence;

    public ZombieArmor(String name, int tier, Material material) {
        super(ArmorTypes.ZOMBIEARMOR, material);
        this.name = name;
        this.tier = tier;
    }

    @Override
    public double getDefence() {
        return defence;
    }

    @Override
    public void setDefence(double defence) {
        this.defence = defence;
    }

    public HashMap<DamageType, Double> getSpecialDefence() {
        return specialDefence;
    }

    @Override
    public void setSpecialDefence(double defence) {
        specialDefenceKey = new NamespacedKey(BossPlugin.getPlugin(), DamageType.ZOMBIEBOSS + "Defence");
        specialDefence.clear();
        specialDefence.put(DamageType.ZOMBIEBOSS, defence);
    }

    @Override
    public void setHealthBonus() {

    }

    public ItemStack createItem() {
        armorPiece = new ItemStack(getMaterial());
        ItemMeta armorPieceMeta = armorPiece.getItemMeta();
        armorPieceMeta.setDisplayName(getArmorType().toString() + " " + tier);
        armorPieceMeta.getPersistentDataContainer().set(defenceKey, PersistentDataType.DOUBLE, getDefence());
        armorPieceMeta.getPersistentDataContainer().set(specialDefenceKey, PersistentDataType.DOUBLE, getSpecialDefence().get(DamageType.ZOMBIEBOSS));
        armorPiece.setItemMeta(armorPieceMeta);
        return armorPiece;
    }
}
