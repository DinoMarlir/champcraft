package champcraft.champcraftsystem.status;

import net.md_5.bungee.api.ChatColor;

public class RecordingStatus implements Status {
    @Override
    public ChatColor getColor() {
        return ChatColor.RED;
    }

    @Override
    public String getName() {
        return "REC";
    }
}
