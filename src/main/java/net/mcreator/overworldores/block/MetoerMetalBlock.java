
package net.mcreator.overworldores.block;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.common.util.ForgeSoundType;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class MetoerMetalBlock extends Block {
	public MetoerMetalBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM)
				.sound(new ForgeSoundType(1.0f, 1.0f, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("overworld_ores:meteormetal.broken")),
						() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("overworld_ores:meteormetal.step")), () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("overworld_ores:meteormetal.placed")),
						() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("overworld_ores:meteormetal.breaking")), () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("overworld_ores:meteormetal.placed"))))
				.strength(4f, 5f).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}
