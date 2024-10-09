
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.cilb.kingdom.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.cilb.kingdom.block.entity.AnvilBlockEntity;
import net.cilb.kingdom.KingdomMod;

public class KingdomModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, KingdomMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> ANVIL = register("anvil", KingdomModBlocks.ANVIL, AnvilBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
