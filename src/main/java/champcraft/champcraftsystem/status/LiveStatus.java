package champcraft.champcraftsystem.status;


import net.md_5.bungee.api.ChatColor;

public class LiveStatus implements Status {
    @Override
    public ChatColor getColor() {
        return ChatColor.DARK_PURPLE;
    }

    @Override
    public String getName() {
        return "LIVE";
    }
}
