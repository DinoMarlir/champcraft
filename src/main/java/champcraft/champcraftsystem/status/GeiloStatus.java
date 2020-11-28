package champcraft.champcraftsystem.status;

import net.md_5.bungee.api.ChatColor;

public class GeiloStatus implements Status {
    @Override
    public ChatColor getColor() {
        return ChatColor.LIGHT_PURPLE;
    }

    @Override
    public String getName() {
        return "GEILO";
    }
}
