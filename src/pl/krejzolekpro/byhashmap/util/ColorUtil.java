package pl.krejzolekpro.byhashmap.util;

import org.bukkit.ChatColor;

public class ColorUtil {

    public static String fixColor(String text){
        return ChatColor.translateAlternateColorCodes('&', text);
    }
}
