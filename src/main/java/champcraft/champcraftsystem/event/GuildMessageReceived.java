package champcraft.champcraftsystem.event;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;

public class GuildMessageReceived extends ListenerAdapter {

    @Override
    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        if(event.getAuthor().isBot()) return;
        if(event.getChannel().getId().equalsIgnoreCase("782197432569692192")) {
            OfflinePlayer player = Bukkit.getOfflinePlayer(event.getMessage().getContentRaw());
            player.setWhitelisted(true);
            Bukkit.getConsoleSender().sendMessage("Whitelisted " + player.getName());
            event.getChannel().sendMessage(":unlock: | Der Spieler `" + player.getName() + "` wurde gewhitelisted").queue();
            event.getGuild().addRoleToMember(event.getMember(), event.getGuild().getRoleById("782199667164971009")).queue();
        }
    }
}
