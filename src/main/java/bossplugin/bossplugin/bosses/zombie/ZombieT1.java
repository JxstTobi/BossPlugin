package bossplugin.bossplugin.bosses.zombie;

import org.bukkit.Bukkit;
import org.bukkit.Location;

public class ZombieT1 extends ZombieBoss{
    public ZombieT1(String name, int tier, double hp, double damage, Location location) {
        super(name, tier, hp, damage, location);
    }

    public void stomp(){
        Bukkit.getOnlinePlayers().forEach(player->{
            double distance = player.getLocation().distance(getLocation());
            if (distance <= 5){
                player.damage(getDamage()*2);
            }
        });
    }
}
