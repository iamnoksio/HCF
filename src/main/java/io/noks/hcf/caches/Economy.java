package io.noks.hcf.caches;

import org.bukkit.ChatColor;

public class Economy {
	private int coins;
	
	public Economy() {
		this.coins = 0;
	}
	public Economy(int money) {
		this.coins = money;
	}

	public int getMoney() {
		return this.coins;
	}

	public void add(int amount) {
		this.coins += amount;
	}

	public void remove(int amount) {
		this.coins -= amount;
	}

	public String toString() {
		return ChatColor.RED + "$" + ChatColor.GOLD + this.coins;
	}
}
