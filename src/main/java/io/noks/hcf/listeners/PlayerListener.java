package io.noks.hcf.listeners;

import java.util.UUID;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerKickEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import io.noks.hcf.managers.PlayerManager;

public class PlayerListener implements Listener {
	
	@EventHandler
	public void onJoin(PlayerJoinEvent event) {
		final Player player = event.getPlayer();
		new PlayerManager(player.getUniqueId());
	}

	@EventHandler
	public void onQuit(PlayerQuitEvent event) {
		this.doLeaveAction(event.getPlayer().getUniqueId());
	}
	
	@EventHandler
	public void onKick(PlayerKickEvent event) {
		this.doLeaveAction(event.getPlayer().getUniqueId());
	}
	
	private void doLeaveAction(UUID uuid) {
		final PlayerManager pm = PlayerManager.get(uuid);
		if (pm == null) {
			return;
		}
		pm.remove();
	}
}
