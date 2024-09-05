
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.kingdom.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.kingdom.block.SilverOreBlock;
import net.mcreator.kingdom.block.AnvilBlock;
import net.mcreator.kingdom.KingdomMod;

public class KingdomModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, KingdomMod.MODID);
	public static final RegistryObject<Block> SILVER_ORE = REGISTRY.register("silver_ore", () -> new SilverOreBlock());
	public static final RegistryObject<Block> ANVIL = REGISTRY.register("anvil", () -> new AnvilBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
