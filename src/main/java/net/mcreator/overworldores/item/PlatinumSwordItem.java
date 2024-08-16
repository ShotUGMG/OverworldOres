
package net.mcreator.overworldores.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.overworldores.init.OverworldOresModItems;

public class PlatinumSwordItem extends SwordItem {
	public PlatinumSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 1725;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 5f;
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
		}, 3, -2.4f, new Item.Properties());
	}
}
