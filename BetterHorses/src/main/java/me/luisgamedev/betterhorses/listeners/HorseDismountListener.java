package me.luisgamedev.betterhorses.listeners;

import org.bukkit.entity.AbstractHorse;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.vehicle.VehicleExitEvent;

import me.luisgamedev.betterhorses.commands.DespawnCommand;

public class HorseDismountListener implements Listener {
    @EventHandler
    public void onDismount(VehicleExitEvent event) {
        if  (event.getVehicle() instanceof AbstractHorse horse) {
            if (event.getVehicle().getPassengers().get(0) instanceof Player player) {
                DespawnCommand.despawnHorseToItem(player, horse);
            }
        }
    }
}
