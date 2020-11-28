package champcraft.champcraftsystem.status;

import net.md_5.bungee.api.ChatColor;

public class AFKStatus implements Status {
    @Override
    public ChatColor getColor() {
        return ChatColor.GRAY;
    }

    @Override
    public String getName() {
        return "AFK";
    }
}
