package champcraft.champcraftsystem.status;

import net.md_5.bungee.api.ChatColor;

public class SusStatus implements Status {
    @Override
    public ChatColor getColor() {
        return ChatColor.DARK_AQUA;
    }

    @Override
    public String getName() {
        return "SUS";
    }
}
