package champcraft.champcraftsystem.status;

import net.md_5.bungee.api.ChatColor;

public class NoneStatus implements Status {
    @Override
    public ChatColor getColor() {
        return ChatColor.GREEN;
    }

    @Override
    public String getName() {
        return "ONLINE";
    }
}
