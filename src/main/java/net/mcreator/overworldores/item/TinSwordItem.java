
package net.mcreator.overworldores.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.overworldores.init.OverworldOresModItems;

public class TinSwordItem extends SwordItem {
	public TinSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 225;
			}

			public float getSpeed() {
				return 5f;
			}

			public float getAttackDamageBonus() {
				return 0.5f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(OverworldOresModItems.TIN_INGOT.get()));
			}
		}, 3, -2.4f, new Item.Properties());
	}
}
