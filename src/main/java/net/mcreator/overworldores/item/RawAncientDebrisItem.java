
package net.mcreator.overworldores.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

import net.mcreator.overworldores.procedures.RawAncientDebrisItemInInventoryTickProcedure;

public class RawAncientDebrisItem extends Item {
	public RawAncientDebrisItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.COMMON));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		RawAncientDebrisItemInInventoryTickProcedure.execute(entity);
	}
}
