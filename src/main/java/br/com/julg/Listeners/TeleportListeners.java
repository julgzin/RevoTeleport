package br.com.julg.Listeners;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class TeleportListeners implements Listener {

    @EventHandler
    public void voidTeleport(PlayerMoveEvent event) {

        Player player = event.getPlayer();
        World world = player.getWorld();
        Location location = player.getLocation();

        if (location.getY() < 0 && world.getName().equalsIgnoreCase("practice")) {

            double X = 0;
            double Y = 100;
            double Z = 0;

            Location teleportLocation = new Location(world, X, Y, Z);
            player.teleport(teleportLocation);

        }


    }
}
