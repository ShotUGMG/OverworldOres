
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.overworldores.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class OverworldOresModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == OverworldOresModVillagerProfessions.MINER.get()) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(OverworldOresModItems.RUBY.get(), 5),

					new ItemStack(OverworldOresModItems.METEORITE_SCRAPS.get()), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(OverworldOresModItems.DEEPSLATE_ROCK.get(), 15),

					new ItemStack(OverworldOresModItems.RUBY.get()), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(OverworldOresModItems.DEEPSLATE_ROCK.get(), 25),

					new ItemStack(OverworldOresModItems.SAPPHIRE.get()), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(OverworldOresModItems.DEEPSLATE_ROCK.get(), 35),

					new ItemStack(OverworldOresModItems.ALEXANDRITE.get()), 10, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(OverworldOresModItems.OBSIDIAN_SHARD.get(), 10),

					new ItemStack(OverworldOresModItems.OLIVINITE_SMITHING_TEMPLATE.get()), 10, 7, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(OverworldOresModItems.NETHERRACK_ROCK.get(), 32),

					new ItemStack(OverworldOresModItems.RAW_ANCIENT_DEBRIS.get()), 10, 7, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(OverworldOresModItems.SAPPHIRE.get(), 5),

					new ItemStack(OverworldOresModItems.METEORITE_COMPOSITE.get()), 10, 7, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(OverworldOresModItems.SILVER_INGOT.get(), 5),

					new ItemStack(OverworldOresModItems.ALEXANDRITE.get(), 5), 10, 7, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(OverworldOresModItems.SAPPHIRE.get(), 3),

					new ItemStack(OverworldOresModItems.CHISEL.get()), 10, 9, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(OverworldOresModItems.SAPPHIRE.get(), 5),

					new ItemStack(OverworldOresModItems.OLIVINITE_PICKAXE.get()), 10, 9, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(OverworldOresModItems.SAPPHIRE.get(), 5),

					new ItemStack(OverworldOresModItems.STEEL_PICKAXE.get()), 10, 9, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(OverworldOresModItems.SAPPHIRE.get(), 8),

					new ItemStack(Items.DIAMOND_PICKAXE), 10, 11, 0.05f));
			event.getTrades().get(4)
					.add(new BasicItemListing(new ItemStack(OverworldOresModItems.ALEXANDRITE.get(), 10), new ItemStack(OverworldOresModItems.SAPPHIRE.get(), 2), new ItemStack(OverworldOresModItems.ADAMANTITE_SCRAP.get()), 10, 11, 0.05f));
			event.getTrades().get(5)
					.add(new BasicItemListing(new ItemStack(OverworldOresModItems.ALEXANDRITE.get(), 2), new ItemStack(OverworldOresModItems.RUBY.get(), 5), new ItemStack(OverworldOresModItems.PLATINUM_UPGRADE_TEMPLATE.get()), 10, 13, 0.05f));
			event.getTrades().get(5).add(
					new BasicItemListing(new ItemStack(OverworldOresModItems.ALEXANDRITE.get(), 10), new ItemStack(OverworldOresModItems.ADAMANTITE_SCRAP.get()), new ItemStack(OverworldOresModItems.ADAMANTITE_UPGRADE_TEMPLATE.get()), 10, 13, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(OverworldOresModItems.ALEXANDRITE.get(), 32), new ItemStack(OverworldOresModItems.SAPPHIRE.get(), 10), new ItemStack(Items.NETHERITE_PICKAXE), 10, 13, 0.05f));
		}
	}
}
