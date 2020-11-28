package champcraft.champcraftsystem.command;

import champcraft.champcraftsystem.ChampCraftSystem;
import champcraft.champcraftsystem.status.Status;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class StatusCommand implements CommandExecutor, TabExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player) {
            Player player = (Player) sender;
            if(args.length == 1) {
                for (Status status : ChampCraftSystem.getStatuses()) {
                    if(args[0].equalsIgnoreCase(status.getName())) {
                        Status.setStatus(player, status);
                        player.sendMessage("§8[§aSystem§8] §7Dein Status wurde auf " + status.getColor() + status.getName() + "§7 gesetzt" );
                    }
                }
            }
        }
        return false;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        if(command.getName().equalsIgnoreCase("status")) {
            List<String> result = new ArrayList<String>();
            for (Status status : ChampCraftSystem.getStatuses()) {
                result.add(status.getName().toLowerCase());
            }
            return result;
        }
        return null;
    }

}
