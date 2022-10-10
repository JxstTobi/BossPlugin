package bossplugin.bossplugin;

import bossplugin.bossplugin.commands.ExampleCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class BossPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("NaHoerMal").setExecutor(new ExampleCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
//Fortnite