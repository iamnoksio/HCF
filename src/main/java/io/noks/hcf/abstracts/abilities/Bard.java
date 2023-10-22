package io.noks.hcf.abstracts.abilities;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import io.noks.hcf.abstracts.Abilities;

public abstract class Bard extends Abilities {

	public Bard(String name) {
		super(name);
		abilities.add(this);
	}
	
	@Override
	public ItemStack[] armor() {
		return new ItemStack[] {new ItemStack(Material.GOLD_BOOTS), new ItemStack(Material.GOLD_LEGGINGS), new ItemStack(Material.GOLD_CHESTPLATE), new ItemStack(Material.GOLD_HELMET)};
	}
}
