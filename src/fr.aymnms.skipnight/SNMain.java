package fr.aymnms.skipnight;

import org.bukkit.entity.Player;
import java.util.ArrayList;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class SNMain extends JavaPlugin implements Listener
{
    public static SNMain instance;
    private ArrayList<Player> PlayerBed;

    public SNMain() {
        String version = getServer().getBukkitVersion();
        String[] parts = version.split("\\.");
        try {
            int major = Integer.parseInt(parts[0]);
            int minor = Integer.parseInt(parts[1].split("-")[0]);
            if ((major == 1 && minor >= 17) || major > 1) {
                getLogger().warning("This plugin is no longer required with the playersSleepingPercentage gamerule.");
                getServer().getPluginManager().disablePlugin(this);
            }
        } catch (Exception e) {
            getLogger().warning("Unable to read Minecraft version. The plugin is activated by default.");
        }

        this.PlayerBed = new ArrayList<>();
    }

    public static SNMain getInstance() {
        return SNMain.instance;
    }

    @Override
    public void onEnable() {
        EventManager.registerEvents(this);
    }

    public ArrayList<Player> getPB() {
        return this.PlayerBed;
    }
}
