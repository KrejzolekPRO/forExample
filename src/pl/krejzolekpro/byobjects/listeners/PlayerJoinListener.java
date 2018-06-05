package pl.krejzolekpro.byobjects.listeners;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import pl.krejzolekpro.byobjects.Main;
import pl.krejzolekpro.byobjects.util.ColorUtil;
import pl.krejzolekpro.byobjects.objects.User;
import pl.krejzolekpro.byobjects.objects.UserUtil;

public class PlayerJoinListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event){
        Main.allLoginAmount++;
        User user = UserUtil.get(event.getPlayer().getName());
        Integer amount = user.getAmount() +1;
        user.setAmount(amount);
        event.getPlayer().sendMessage(ColorUtil.fixColor("&eAktualnie na serwerze: " + Bukkit.getServer().getOnlinePlayers().size() + "/" + Bukkit.getServer().getMaxPlayers()));
        event.getPlayer().sendMessage(ColorUtil.fixColor("&eOgolna ilosc polaczen z serweren: " + Main.allLoginAmount));
        event.getPlayer().sendMessage(ColorUtil.fixColor("&eTwoja ilosc polaczen z serweren: " + user.getAmount()));
    }
}
