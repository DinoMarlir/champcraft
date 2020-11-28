package champcraft.champcraftsystem.status;

import net.md_5.bungee.api.ChatColor;

public class DinoStatus implements Status {
    @Override
    public ChatColor getColor() {
        return ChatColor.YELLOW;
    }

    @Override
    public String getName() {
        return "DINO";
    }
}
