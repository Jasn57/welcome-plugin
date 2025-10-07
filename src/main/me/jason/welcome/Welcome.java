package main.me.jason.welcome;

// import from game
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Welcome extends JavaPlugin implements Listener {

// when on    
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
        getLogger().info("welcomePlugin enabled");
    }

// when off    
    @Override
    public void onDisable() {
        getLogger().info("welcomePlugin disabled");
    }

// when player joins send a message    
    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        event.getPlayer().sendMessage("§aWelcome to the server, §e" + event.getPlayer().getName() + "§a");
    }
}
