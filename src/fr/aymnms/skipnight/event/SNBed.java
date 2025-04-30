package fr.aymnms.skipnight.event;

import org.bukkit.event.player.PlayerBedLeaveEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.entity.Player;
import org.bukkit.Bukkit;
import org.bukkit.event.player.PlayerBedEnterEvent;
import fr.aymnms.skipnight.SNMain;
import org.bukkit.event.Listener;

public class SNBed implements Listener
{
    private final SNMain main;

    public SNBed(final SNMain main) {
        this.main = main;
    }

    @EventHandler
    public void joinBedEvent(final PlayerBedEnterEvent e) {
        final Player p = e.getPlayer();
        joinBed(p);
        skipNight(p);
    }

    @EventHandler
    public void leaveBedEvent(final PlayerBedLeaveEvent e) {
        Player p = e.getPlayer();
        leaveBed(p);
    }

    public void leaveBed(final Player p){
        final int playerLimit = Bukkit.getServer().getOnlinePlayers().size() / 2;

        this.main.getPB().remove(p);
        System.out.println("leave: Bedlist: " + this.main.getPB());

        if (this.main.getPB().isEmpty()) {
            Bukkit.broadcastMessage("§8[§rSkip§9Night§8] §7Nobody wants to go to bed anymore!");
        } else {
            Bukkit.broadcastMessage("§8§l" + p.getName() + " §r§7has just left the bed §8[§9§l" + this.main.getPB().size() + "§8/§f" + playerLimit + "]");
        }
    }

    public void joinBed(Player p) {
        if (p.getWorld().getTime() < 12000L && !p.getWorld().isThundering())
            return;

        final int playerLimit = Math.max(1, Bukkit.getServer().getOnlinePlayers().size() / 2);

        if (!this.main.getPB().contains(p))
            this.main.getPB().add(p);

        System.out.println("join: Bedlist: " + this.main.getPB());

        if (this.main.getPB().size() == 1)
            Bukkit.broadcastMessage("§8[§rSkip§9Night§8] §9" + this.main.getPB().get(0).getName() + " §r§would to skip the night §8[§9§l" + this.main.getPB().size() + "§8/§f" + playerLimit + "]");
        else if (this.main.getPB().size() > 1)
            Bukkit.broadcastMessage("§8[§rSkip§9Night§8] §9" + p.getName() + " §7has just gone to bed §8[§9§l" + this.main.getPB().size() + "§8/§f" + playerLimit + "]");
    }

    public void skipNight(Player p) {
        if (p.getWorld().getTime() < 12000L && !p.getWorld().isThundering())
            return;

        final int playerLimit = Math.max(1, Bukkit.getServer().getOnlinePlayers().size() / 2);

        if (this.main.getPB().size() >= playerLimit) {
            Bukkit.broadcastMessage("§8[§rSkip§9Night§8] §7The sun rises.");
            p.getWorld().setTime(0L);
            this.main.getPB().clear();
        }
    }
}
