package champcraft.champcraftsystem.status;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.entity.Player;

import java.util.HashMap;

public interface Status {

    ChatColor getColor();

    String getName();

    static HashMap<Player, Status> stats = new HashMap<Player, Status>();

    static void setStatus(Player player, Status status) {
        stats.remove(player);
        stats.put(player,status);
    }

    static Status getStatus(Player player) {
        if(stats.containsKey(player)) {
            return stats.get(player);
        }
        return new NoneStatus();
    }

}
