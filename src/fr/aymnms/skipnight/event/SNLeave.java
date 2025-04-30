package fr.aymnms.skipnight.event;

import fr.aymnms.skipnight.SNMain;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class SNLeave implements Listener {
    private final SNMain main;

    public SNLeave(final SNMain main) {
        this.main = main;
    }

    @EventHandler
    public void onQuit(PlayerQuitEvent e) {
        Player p = e.getPlayer();
        SNBed bed = new SNBed(this.main);
        bed.leaveBed(p);
        bed.skipNight(p);
    }
}
