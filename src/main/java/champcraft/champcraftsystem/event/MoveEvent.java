package champcraft.champcraftsystem.event;

import champcraft.champcraftsystem.region.SpawnRegion;
import org.betterspigot.bspigot.entity.BPlayerConnection;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityToggleGlideEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerSwapHandItemsEvent;

import java.util.HashMap;

public class MoveEvent implements Listener {

    public static HashMap<Player, Boolean> boosted = new HashMap<Player, Boolean>();

    @EventHandler
    public void onMove(PlayerMoveEvent event) {
        if(new SpawnRegion().isInRegion(new BPlayerConnection(event.getPlayer()))) {
            if(event.getPlayer().getFallDistance() > 5) {
                event.getPlayer().setGliding(true);
            }
        }
        if(event.getPlayer().isOnGround()) {
            event.getPlayer().setGliding(false);
        }
    }

    @EventHandler
    public void onGlide(EntityToggleGlideEvent event) {
        if(event.getEntity() instanceof Player) {
            Player player = (Player) event.getEntity();
            if(player.getEquipment().getChestplate() != null) {
                if(!player.getEquipment().getChestplate().getType().equals(Material.ELYTRA)) {
                    event.setCancelled(true);
                }
            } else {
                event.setCancelled(true);
            }
        }
    }

    @EventHandler
    public void onSwitch(PlayerSwapHandItemsEvent event) {
        Player player = event.getPlayer();
        if(!boosted.containsKey(player)) {
            if(player.isGliding()) {
                boosted.put(player, true);
                event.setCancelled(true);
                player.setVelocity(player.getLocation().getDirection().multiply(2));
            }
        }
    }

}
