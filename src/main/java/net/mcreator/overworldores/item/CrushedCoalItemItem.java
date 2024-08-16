
package net.mcreator.overworldores.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class CrushedCoalItemItem extends Item {
	public CrushedCoalItemItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
