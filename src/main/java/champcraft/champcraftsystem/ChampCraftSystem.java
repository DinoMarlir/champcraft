package champcraft.champcraftsystem;

import champcraft.champcraftsystem.command.StatusCommand;
import champcraft.champcraftsystem.event.GuildMessageReceived;
import champcraft.champcraftsystem.event.MoveEvent;
import champcraft.champcraftsystem.event.PingEvent;
import champcraft.champcraftsystem.status.*;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import org.betterspigot.bspigot.BSpigot;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;

public final class ChampCraftSystem extends JavaPlugin {

    private static ArrayList<Status> statuses = new ArrayList<Status>();
    protected static JDA jda;
    protected static final File FILE = new File("./plugins/", "token.yml");
    protected static YamlConfiguration config;

    @Override
    public void onEnable() {
        try {
            if(!FILE.exists()) {
                FILE.createNewFile();
            }
            config = YamlConfiguration.loadConfiguration(FILE);
            if(!config.contains("token")) {
                config.set("token", "0000-0000-0000-0000");
                config.save(FILE);
            }
            jda = new JDABuilder().setToken(config.getString("token")).setActivity(Activity.streaming("ChampCraft", "https://www.twitch.tv/norisk")).build();
        } catch (Exception e) {
        }
        jda.addEventListener(new GuildMessageReceived());
        register(new NoneStatus());
        register(new GeiloStatus());
        register(new RelaxoStatus());
        register(new SexyStatus());
        register(new DinoStatus());
        register(new MoinStatus());
        register(new HeadStatus());
        register(new SusStatus());
        register(new AFKStatus());
        register(new RedstoneStatus());
        register(new XDStatus());
        register(new LiveStatus());
        register(new RecordingStatus());
        final PluginManager pluginManager = Bukkit.getPluginManager();
        pluginManager.registerEvents(new MoveEvent(), this);
        pluginManager.registerEvents(new PingEvent(), this);
        getCommand("status").setExecutor(new StatusCommand());
        getCommand("status").setTabCompleter(new StatusCommand());
        Bukkit.getScheduler().scheduleSyncRepeatingTask(this, () -> {
            for (Player player : Bukkit.getOnlinePlayers()) {
                player.setPlayerListHeaderFooter("§a\n§8§l» §e§lCHAMPCRAFT §6§l2 §8§l«\n", "\n§7Es sind aktuell §6" + Bukkit.getOnlinePlayers().size() + "§7 Spieler online\n§8» §6§owww.twitch.tv/mooziii_");
                player.setPlayerListName("§f[" + Status.getStatus(player).getColor() + Status.getStatus(player).getName() + "§f] " + Status.getStatus(player).getColor() + player.getName() );
            }
        }, 0L,20L);
        Bukkit.getScheduler().scheduleSyncRepeatingTask(this,() -> {
            MoveEvent.boosted.clear();
        }, 15*20L, 15*20L);
    }

    @Override
    public void onDisable() {
    }

    public void register(Status status) {
        statuses.add(status);
    }

    public static Collection<Status> getStatuses() {
        return statuses;
    }

}
