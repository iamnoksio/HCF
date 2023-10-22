package io.noks.hcf.abstracts.abilities;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import io.noks.hcf.abstracts.Abilities;

public abstract class Archer extends Abilities {

	public Archer(String name) {
		super(name);
		abilities.add(this);
	}
	
	@Override
	public ItemStack[] armor() {
		return new ItemStack[] {new ItemStack(Material.LEATHER_BOOTS), new ItemStack(Material.LEATHER_LEGGINGS), new ItemStack(Material.LEATHER_CHESTPLATE), new ItemStack(Material.LEATHER_HELMET)};
	}
}
