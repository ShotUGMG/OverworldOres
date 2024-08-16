
package net.mcreator.overworldores.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class AdamantiteIngotItem extends Item {
	public AdamantiteIngotItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.COMMON));
	}
}
