package champcraft.champcraftsystem.status;

import net.md_5.bungee.api.ChatColor;

public class HeadStatus implements Status {
    @Override
    public ChatColor getColor() {
        return ChatColor.DARK_BLUE;
    }

    @Override
    public String getName() {
        return "5Head";
    }
}
