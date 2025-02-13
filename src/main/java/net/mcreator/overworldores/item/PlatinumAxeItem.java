
package net.mcreator.overworldores.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import net.mcreator.overworldores.init.OverworldOresModItems;

public class PlatinumAxeItem extends AxeItem {
	public PlatinumAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 1725;
			}

			public float getSpeed() {
				return 10f;
			}

			public float getAttackDamageBonus() {
				return 6f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 20;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(OverworldOresModItems.PLATINUM_INGOT.get()));
			}
		}, 1, -3f, new Item.Properties());
	}
}
