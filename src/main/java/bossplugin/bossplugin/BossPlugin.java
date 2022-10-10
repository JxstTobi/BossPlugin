package bossplugin.bossplugin;

import bossplugin.bossplugin.bosses.Boss;
import bossplugin.bossplugin.commands.ExampleCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class BossPlugin extends JavaPlugin {
    static BossPlugin plugin;
    @Override
    public void onEnable() {
        getCommand("test").setExecutor(new ExampleCommand());
        plugin = this;
    }

    @Override
    public void onDisable() {

        // Plugin shutdown logic
    }

    public static BossPlugin getPlugin(){ return plugin; }
}
//Fortnite