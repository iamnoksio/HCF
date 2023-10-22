package io.noks.hcf.abstracts.abilities;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import io.noks.hcf.abstracts.Abilities;

public abstract class Minor extends Abilities {

	public Minor(String name) {
		super(name);
		abilities.add(this);
	}
	
	@Override
	public ItemStack[] armor() {
		return new ItemStack[] {new ItemStack(Material.IRON_BOOTS), new ItemStack(Material.IRON_LEGGINGS), new ItemStack(Material.IRON_CHESTPLATE), new ItemStack(Material.IRON_HELMET)};
	}
}
