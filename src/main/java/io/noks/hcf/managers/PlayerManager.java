package io.noks.hcf.managers;

import java.util.Map;
import java.util.UUID;

import javax.annotation.Nullable;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import com.google.common.collect.Maps;

import io.noks.hcf.abstracts.Abilities;
import io.noks.hcf.caches.Economy;
import io.noks.hcf.caches.Faction;

public class PlayerManager {
	public static final Map<UUID, PlayerManager> players = Maps.newConcurrentMap();
	private final Player player;
	private final UUID playerUUID
	private Faction faction;
	private Economy economy;
	private @Nullable Abilities ability;
	
	public PlayerManager(UUID playerUUID) {
	    this.playerUUID = playerUUID;
	    this.player = Bukkit.getPlayer(this.playerUUID);
	    //this.faction = METHOD FOR SEARCHING IF HE'S IN A FACTION
	    this.economy = new Economy();
	    this.ability = null; // TODO: check stuff and apply the ability
	    players.putIfAbsent(playerUUID, this);
	}
	public PlayerManager(UUID playerUUID, int money, Faction faction) {
	    this.playerUUID = playerUUID;
	    this.player = Bukkit.getPlayer(this.playerUUID);
	    this.faction = faction;
	    this.economy = new Economy(money);
	    this.ability = null; // TODO: check stuff and apply the ability
	    players.putIfAbsent(playerUUID, this);
	}
	
	public static PlayerManager get(UUID playerUUID) {
		if (!players.containsKey(playerUUID)) {
			return null;
		}
		return players.get(playerUUID);
	}

	public void remove() {
		players.remove(this.playerUUID);
	}

	public Player getPlayer() {
		return this.player;
	}
	
	public UUID getPlayerUUID() {
		return this.playerUUID;
	}
	
	public void updateAbility(@Nullable Abilities newAbility) {
		this.ability = newAbility;
	}
	
	public Abilities getCurrentAbility() {
		return this.ability;
	}
}
