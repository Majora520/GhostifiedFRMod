package net.savcode.fopmr;

import net.savcode.fopmr.config.ConfigEntry;
import static net.savcode.fopmr.config.ConfigEntry.A_DELAY;
import static net.savcode.fopmr.config.ConfigEntry.A_MESSAGES;
import static net.savcode.fopmr.config.ConfigEntry.A_PREFIX;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitRunnable;

public class Announcer {
    
  public static void Broadcast(Plugin pl) {
      
    new BukkitRunnable() {
      int number = 0;
      
      public void run() {
          
        if (this.number >= ConfigEntry.MainConfig().getStringList(A_MESSAGES).size()) {
          this.number = 0;
        }
        
        String prefix = ConfigEntry.MainConfig().getString(A_PREFIX);
        String message = (String)ConfigEntry.MainConfig().getStringList(A_MESSAGES).get(this.number);
        
        this.number += 1;
        
        F_Util.bcastMsg(F_Util.color(prefix + message));
      }
    }.runTaskTimer(pl, 100L, 20 * pl.getConfig().getInt(A_DELAY));
  }
}