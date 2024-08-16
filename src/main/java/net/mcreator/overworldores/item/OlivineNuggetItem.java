
package net.mcreator.overworldores.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class OlivineNuggetItem extends Item {
	public OlivineNuggetItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
