package bossplugin.bossplugin.bosses.zombie;

import org.bukkit.Bukkit;
import org.bukkit.Location;

public class ZombieT3 extends ZombieBoss {
    public ZombieT3(String name, int tier, double hp, double damage, Location location) {
        super(name, tier, hp, damage, location);
    }

    public void stomp() {
        Bukkit.getOnlinePlayers().forEach(player -> {
            double distance = player.getLocation().distance(getLocation());
            if (distance <= 5.4) {
                player.damage(getDamage() * 2.4);
            }
        });
    }
}