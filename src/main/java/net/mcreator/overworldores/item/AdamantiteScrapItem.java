
package net.mcreator.overworldores.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class AdamantiteScrapItem extends Item {
	public AdamantiteScrapItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.COMMON));
	}
}
