package bossplugin.bossplugin.bosses.zombie;

import bossplugin.bossplugin.BossPlugin;
import bossplugin.bossplugin.bosses.Boss;
import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Zombie;

public class ZombieBoss extends Boss {
    private String displayName;
    private Zombie boss;

    public ZombieBoss(String name, int tier, double hp, double damage, Location location){
        super(name, tier,  hp, damage, location);
        displayName = name + tier;
    }

    public void spawnEntity(){
        boss = (Zombie) BossPlugin.getPlugin().getServer().getWorld("world").spawnEntity(location, EntityType.ZOMBIE);
        boss.setHealth(getHp());
        boss.setCustomName(displayName);
    }

    public String getDisplayName(){return displayName;}
    public void setDisplayName(String newName){displayName = newName;}

    public void setArmor(){}
    public void setDrops(){}
}