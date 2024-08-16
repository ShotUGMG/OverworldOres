
package net.mcreator.overworldores.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class NetherrackRockItem extends Item {
	public NetherrackRockItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
