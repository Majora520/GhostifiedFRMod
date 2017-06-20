package net.savcode.fopmr;

import java.util.Arrays;
import java.util.List;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

public class F_Util {
    
    public static final List<String> OWNER = Arrays.asList("iFrostBite");
    public static final List<String> ADMIN_MANAGER = Arrays.asList("");
    public static final List<String> EXECUTIVE = Arrays.asList("");
    
    private F_Util() {
        
    }
    
    public static int bcastMsg(String message) {
        return Bukkit.broadcastMessage(message);
    }

    public static int bcastMsg(String message, ChatColor color) {
        return Bukkit.broadcastMessage((color == null ? "" : color) + message);
    }

    public static String color(String string) {
        return ChatColor.translateAlternateColorCodes('&', string);
    }     
}
