package io.noks.hcf.abstracts;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;

public abstract class Abilities {
	public static List<Abilities> abilities = new ArrayList<>();
	protected final Set<PotionEffect> passiveEffects = new HashSet<>();
    protected final String name;
    
    public Abilities(String name) {
    	this.name = name;
    }
	
	public abstract ItemStack[] armor();
}
