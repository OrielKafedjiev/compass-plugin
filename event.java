package oreha;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

import static oreha.commands.*;

public class event implements Listener {

    @EventHandler
    public void refresh(PlayerMoveEvent e){
        if(started){
            if(e.getPlayer().equals(targeted))
            sender1.setCompassTarget(targeted.getLocation());
        }
    }
}
