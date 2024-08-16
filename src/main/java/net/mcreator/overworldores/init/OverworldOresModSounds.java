
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.overworldores.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.overworldores.OverworldOresMod;

public class OverworldOresModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, OverworldOresMod.MODID);
	public static final RegistryObject<SoundEvent> METEORMETAL_PLACED = REGISTRY.register("meteormetal.placed", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("overworld_ores", "meteormetal.placed")));
	public static final RegistryObject<SoundEvent> METEORMETAL_BREAKING = REGISTRY.register("meteormetal.breaking", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("overworld_ores", "meteormetal.breaking")));
	public static final RegistryObject<SoundEvent> METEORMETAL_BROKEN = REGISTRY.register("meteormetal.broken", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("overworld_ores", "meteormetal.broken")));
	public static final RegistryObject<SoundEvent> METEORMETAL_STEP = REGISTRY.register("meteormetal.step", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("overworld_ores", "meteormetal.step")));
}
