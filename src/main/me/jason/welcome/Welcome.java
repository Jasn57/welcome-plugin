package main.me.jason.welcome;

import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Welcome extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
        getLogger().info("welcomePlugin enabled");
    }

    @Override
    public void onDisable() {
        getLogger().info("welcomePlugin disabled");
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        event.getPlayer().sendMessage("§aWelcome to the server, §e" + event.getPlayer().getName() + "§a");
    }
}
