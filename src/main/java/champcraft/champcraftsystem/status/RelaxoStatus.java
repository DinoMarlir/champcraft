package champcraft.champcraftsystem.status;

import net.md_5.bungee.api.ChatColor;

public class RelaxoStatus implements Status {
    @Override
    public ChatColor getColor() {
        return ChatColor.AQUA;
    }

    @Override
    public String getName() {
        return "RELAXO";
    }
}
