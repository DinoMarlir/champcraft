package champcraft.champcraftsystem.status;

import net.md_5.bungee.api.ChatColor;

public class XDStatus implements Status {
    @Override
    public ChatColor getColor() {
        return ChatColor.BLUE;
    }

    @Override
    public String getName() {
        return "XD";
    }
}
