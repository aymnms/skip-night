package fr.aymnms.skipnight;

import fr.aymnms.skipnight.event.SNBed;
import fr.aymnms.skipnight.event.SNLeave;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;

public class EventManager {

    public static void registerEvents(final SNMain main) {
        final PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(new SNBed(main), main);
        pm.registerEvents(new SNLeave(main), main);
    }

}
