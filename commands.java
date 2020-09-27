package oreha;

import oreha.sendMessage;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class commands extends JavaPlugin {
public static boolean started=false;
public static Player targeted;
public static Player sender1;
    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("started compass plugin");
        getCommand("sendMessage").setExecutor(new sendMessage());
        getCommand("setCompass").setExecutor(new setCompass());
        getServer().getPluginManager().registerEvents(new event(),this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
