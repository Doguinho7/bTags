package me.doguinho.bTags;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class Tag {
    
    private static Main plugin = (Main) Bukkit.getPluginManager().getPlugin("bTags");
    
    public static void setTag(Player p, String perm ,String tag) {
        
        Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, new Runnable() {
            
            @Override
            public void run() {
                if (p.hasPermission(perm)) {
                    p.setDisplayName(tag + " §f" +p.getName());
                    p.setPlayerListName(tag + " §f" +p.getName());
                }
                
            }
        }, 0, 40);
        

    }
}