package bossplugin.bossplugin.bosses.zombie;

import org.bukkit.Bukkit;
import org.bukkit.Location;

public class ZombieT4 extends ZombieBoss {
    public ZombieT4(String name, int tier, double hp, double damage, Location location) {
        super(name, tier, hp, damage, location);
    }

    public void stomp() {
        Bukkit.getOnlinePlayers().forEach(player -> {
            double distance = player.getLocation().distance(getLocation());
            if (distance <= 5.6) {
                player.damage(getDamage() * 2.6);
            }
        });
    }
}