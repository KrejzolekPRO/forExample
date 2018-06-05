package pl.krejzolekpro.byhashmap;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import org.bukkit.plugin.java.JavaPlugin;
import pl.krejzolekpro.byhashmap.listeners.PlayerJoinListener;

import java.util.HashMap;

public class Main extends JavaPlugin{

    public static HashMap<String, Integer> playerLoginAmount = new HashMap<String, Integer>();
    public static Integer allLoginAmount = 0;

    public void onEnable(){
        this.getServer().getPluginManager().registerEvents(new PlayerJoinListener(), this);
    }

    public void onDisable(){
        for(Player p : Bukkit.getOnlinePlayers()){
            p.kickPlayer("Restart.");
        }
        Bukkit.shutdown(); //polecam, aby sie nie zbugowalo.
    }
}
