
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.kingdom.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.kingdom.item.SilversaberItem;
import net.mcreator.kingdom.item.SilveroreitemItem;
import net.mcreator.kingdom.item.SilvercoinItem;
import net.mcreator.kingdom.item.SilverbarItem;
import net.mcreator.kingdom.item.SilverItem;
import net.mcreator.kingdom.item.PiecesilverItem;
import net.mcreator.kingdom.item.IronshaberItem;
import net.mcreator.kingdom.item.IroncoinItem;
import net.mcreator.kingdom.item.HammerItem;
import net.mcreator.kingdom.item.GoldenshabrItem;
import net.mcreator.kingdom.item.GoldencoinItem;
import net.mcreator.kingdom.KingdomMod;

public class KingdomModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, KingdomMod.MODID);
	public static final RegistryObject<Item> SILVERBAR = REGISTRY.register("silverbar", () -> new SilverbarItem());
	public static final RegistryObject<Item> SILVER_ORE = block(KingdomModBlocks.SILVER_ORE);
	public static final RegistryObject<Item> ANVIL = block(KingdomModBlocks.ANVIL);
	public static final RegistryObject<Item> HAMMER = REGISTRY.register("hammer", () -> new HammerItem());
	public static final RegistryObject<Item> SILVERSABER = REGISTRY.register("silversaber", () -> new SilversaberItem());
	public static final RegistryObject<Item> PIECESILVER = REGISTRY.register("piecesilver", () -> new PiecesilverItem());
	public static final RegistryObject<Item> SILVER_HELMET = REGISTRY.register("silver_helmet", () -> new SilverItem.Helmet());
	public static final RegistryObject<Item> SILVER_CHESTPLATE = REGISTRY.register("silver_chestplate", () -> new SilverItem.Chestplate());
	public static final RegistryObject<Item> SILVER_LEGGINGS = REGISTRY.register("silver_leggings", () -> new SilverItem.Leggings());
	public static final RegistryObject<Item> SILVER_BOOTS = REGISTRY.register("silver_boots", () -> new SilverItem.Boots());
	public static final RegistryObject<Item> IRONSHABER = REGISTRY.register("ironshaber", () -> new IronshaberItem());
	public static final RegistryObject<Item> UNDEAD_KNIGHT_SPAWN_EGG = REGISTRY.register("undead_knight_spawn_egg", () -> new ForgeSpawnEggItem(KingdomModEntities.UNDEAD_KNIGHT, -8176105, -6383476, new Item.Properties()));
	public static final RegistryObject<Item> KINGHT_SPAWN_EGG = REGISTRY.register("kinght_spawn_egg", () -> new ForgeSpawnEggItem(KingdomModEntities.KINGHT, -5723992, -10987432, new Item.Properties()));
	public static final RegistryObject<Item> SILVERCOIN = REGISTRY.register("silvercoin", () -> new SilvercoinItem());
	public static final RegistryObject<Item> SILVEROREITEM = REGISTRY.register("silveroreitem", () -> new SilveroreitemItem());
	public static final RegistryObject<Item> KNIGHTARCHER_SPAWN_EGG = REGISTRY.register("knightarcher_spawn_egg", () -> new ForgeSpawnEggItem(KingdomModEntities.KNIGHTARCHER, -6646379, -10531001, new Item.Properties()));
	public static final RegistryObject<Item> GOLDENSHABR = REGISTRY.register("goldenshabr", () -> new GoldenshabrItem());
	public static final RegistryObject<Item> IRONCOIN = REGISTRY.register("ironcoin", () -> new IroncoinItem());
	public static final RegistryObject<Item> GOLDENCOIN = REGISTRY.register("goldencoin", () -> new GoldencoinItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
