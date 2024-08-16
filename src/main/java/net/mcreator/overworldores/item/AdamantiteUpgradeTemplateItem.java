
package net.mcreator.overworldores.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import java.util.List;

public class AdamantiteUpgradeTemplateItem extends Item {
	public AdamantiteUpgradeTemplateItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.literal(("\u00A77") + ("Adamantite Upgrade")));
		list.add(Component.literal(" "));
		list.add(Component.literal(("\u00A77") + ("Applies to:")));
		list.add(Component.literal(("\u00A79") + (" Netherite Equipment")));
		list.add(Component.literal(("\u00A77") + ("Ingredients")));
		list.add(Component.literal(("\u00A79") + (" Adamantite Ingot")));

	}
}
