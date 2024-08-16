
package net.mcreator.overworldores.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.overworldores.init.OverworldOresModItems;

public class AdamantitePickaxeItem extends PickaxeItem {
	public AdamantitePickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 3075;
			}

			public float getSpeed() {
				return 14f;
			}

			public float getAttackDamageBonus() {
				return 6f;
			}

			public int getLevel() {
				return 5;
			}

			public int getEnchantmentValue() {
				return 50;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(OverworldOresModItems.ADAMANTITE_SCRAP.get()));
			}
		}, 1, -2.8f, new Item.Properties().fireResistant());
	}
}
