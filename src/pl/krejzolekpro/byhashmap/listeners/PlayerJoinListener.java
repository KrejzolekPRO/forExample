package pl.krejzolekpro.byhashmap.listeners;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import pl.krejzolekpro.byhashmap.Main;
import pl.krejzolekpro.byhashmap.util.ColorUtil;

public class PlayerJoinListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event){
        Main.allLoginAmount++;
        if(Main.playerLoginAmount.containsKey(event.getPlayer().getName())){
            Integer amount = Main.playerLoginAmount.get(event.getPlayer().getName()) +1;
            Main.playerLoginAmount.put(event.getPlayer().getName(), amount);
        } else {
            Main.playerLoginAmount.put(event.getPlayer().getName(), 1);
        }
        event.getPlayer().sendMessage(ColorUtil.fixColor("&eAktualnie na serwerze: " + Bukkit.getServer().getOnlinePlayers().size() + "/" + Bukkit.getServer().getMaxPlayers()));
        event.getPlayer().sendMessage(ColorUtil.fixColor("&eOgolna ilosc polaczen z serweren: " + Main.allLoginAmount));
        event.getPlayer().sendMessage(ColorUtil.fixColor("&eTwoja ilosc polaczen z serweren: " + Main.playerLoginAmount.get(event.getPlayer().getName())));
    }
}
