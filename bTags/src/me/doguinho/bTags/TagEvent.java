package me.doguinho.bTags;

import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class TagEvent implements Listener{
	
	public void onJoin(PlayerJoinEvent e) {
		
	Player p = e.getPlayer();
    if (p.isOp() == true ) {
        Tag.setTag(p, "", "§c[Dono]");
        return;
        
    }else {
        Tag.setTag(p, "tag.membro", "§a[Membro]");
        Tag.setTag(p, "tag.vip", "§a[Vip§6+§a]");
        Tag.setTag(p, "tag.mvp", "§b[Mvp]");
        Tag.setTag(p, "tag.mvp+", "§b[Mvp§6+§b]");
        Tag.setTag(p, "tag.yt", "§c[YT]");
        Tag.setTag(p, "tag.mod", "§5[Mod]");
        Tag.setTag(p, "tag.dono", "§c[Dono]");
    }
    
}
}