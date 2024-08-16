
package net.mcreator.overworldores.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import net.mcreator.overworldores.init.OverworldOresModItems;

public class SteelAxeItem extends AxeItem {
	public SteelAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 325;
			}

			public float getSpeed() {
				return 7f;
			}

			public float getAttackDamageBonus() {
				return 7.5f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 15;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(OverworldOresModItems.STEEL_INGOT.get()));
			}
		}, 1, -3.2f, new Item.Properties());
	}
}
