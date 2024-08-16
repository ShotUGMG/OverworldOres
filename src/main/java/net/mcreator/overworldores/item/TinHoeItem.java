
package net.mcreator.overworldores.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

import net.mcreator.overworldores.init.OverworldOresModItems;

public class TinHoeItem extends HoeItem {
	public TinHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 225;
			}

			public float getSpeed() {
				return 5f;
			}

			public float getAttackDamageBonus() {
				return 0f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 12;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(OverworldOresModItems.TIN_INGOT.get()));
			}
		}, 0, -2.5f, new Item.Properties());
	}
}
