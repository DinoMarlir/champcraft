package champcraft.champcraftsystem.status;

import net.md_5.bungee.api.ChatColor;

public class MoinStatus implements Status {
    @Override
    public ChatColor getColor() {
        return ChatColor.BLACK;
    }

    @Override
    public String getName() {
        return "MOIN";
    }
}
