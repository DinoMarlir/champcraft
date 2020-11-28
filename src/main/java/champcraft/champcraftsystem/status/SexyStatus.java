package champcraft.champcraftsystem.status;

import net.md_5.bungee.api.ChatColor;

public class SexyStatus implements Status {
    @Override
    public ChatColor getColor() {
        return ChatColor.WHITE;
    }

    @Override
    public String getName() {
        return "SEXY";
    }
}
