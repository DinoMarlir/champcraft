package champcraft.champcraftsystem.status;

import net.md_5.bungee.api.ChatColor;

public class RedstoneStatus implements Status {
    @Override
    public ChatColor getColor() {
        return ChatColor.DARK_RED;
    }

    @Override
    public String getName() {
        return "REDSTONE";
    }
}
