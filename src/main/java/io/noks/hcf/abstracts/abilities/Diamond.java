package io.noks.hcf.abstracts.abilities;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import io.noks.hcf.abstracts.Abilities;

public abstract class Diamond extends Abilities {

	public Diamond(String name) {
		super(name);
		abilities.add(this);
	}
	
	@Override
	public ItemStack[] armor() {
		return new ItemStack[] {new ItemStack(Material.DIAMOND_BOOTS), new ItemStack(Material.DIAMOND_LEGGINGS), new ItemStack(Material.DIAMOND_CHESTPLATE), new ItemStack(Material.DIAMOND_HELMET)};
	}
}
