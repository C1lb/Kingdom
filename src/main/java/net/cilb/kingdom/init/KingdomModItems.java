
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.cilb.kingdom.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.cilb.kingdom.item.SilverswordItem;
import net.cilb.kingdom.item.SilvershovelItem;
import net.cilb.kingdom.item.SilversaberItem;
import net.cilb.kingdom.item.SilverpickaxeItem;
import net.cilb.kingdom.item.SilveroreitemItem;
import net.cilb.kingdom.item.SilverhoeItem;
import net.cilb.kingdom.item.SilvercoinItem;
import net.cilb.kingdom.item.SilverbarItem;
import net.cilb.kingdom.item.SilveraxeItem;
import net.cilb.kingdom.item.SilverItem;
import net.cilb.kingdom.item.SampleswordItem;
import net.cilb.kingdom.item.SamplearmorItem;
import net.cilb.kingdom.item.PiecesilverItem;
import net.cilb.kingdom.item.NetheritesaberItem;
import net.cilb.kingdom.item.IronshaberItem;
import net.cilb.kingdom.item.IroncoinItem;
import net.cilb.kingdom.item.HammerItem;
import net.cilb.kingdom.item.GoldenshabrItem;
import net.cilb.kingdom.item.GoldencoinItem;
import net.cilb.kingdom.item.DiamondshardItem;
import net.cilb.kingdom.item.DiamondsaberItem;
import net.cilb.kingdom.item.CraftbookItem;
import net.cilb.kingdom.item.ChiselItem;
import net.cilb.kingdom.item.BigsilverswordItem;
import net.cilb.kingdom.item.BignetheriteswordItem;
import net.cilb.kingdom.item.BigironswordItem;
import net.cilb.kingdom.item.BiggoldenswordItem;
import net.cilb.kingdom.item.BigdiamondswordItem;
import net.cilb.kingdom.KingdomMod;

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
	public static final RegistryObject<Item> IRONSABER = REGISTRY.register("ironsaber", () -> new IronshaberItem());
	public static final RegistryObject<Item> UNDEAD_KNIGHT_SPAWN_EGG = REGISTRY.register("undead_knight_spawn_egg", () -> new ForgeSpawnEggItem(KingdomModEntities.UNDEAD_KNIGHT, -8176105, -6383476, new Item.Properties()));
	public static final RegistryObject<Item> KINGHT_SPAWN_EGG = REGISTRY.register("kinght_spawn_egg", () -> new ForgeSpawnEggItem(KingdomModEntities.KINGHT, -5723992, -10987432, new Item.Properties()));
	public static final RegistryObject<Item> SILVERCOIN = REGISTRY.register("silvercoin", () -> new SilvercoinItem());
	public static final RegistryObject<Item> SILVEROREITEM = REGISTRY.register("silveroreitem", () -> new SilveroreitemItem());
	public static final RegistryObject<Item> KNIGHTARCHER_SPAWN_EGG = REGISTRY.register("knightarcher_spawn_egg", () -> new ForgeSpawnEggItem(KingdomModEntities.KNIGHTARCHER, -6646379, -10531001, new Item.Properties()));
	public static final RegistryObject<Item> GOLDENSABER = REGISTRY.register("goldensaber", () -> new GoldenshabrItem());
	public static final RegistryObject<Item> IRONCOIN = REGISTRY.register("ironcoin", () -> new IroncoinItem());
	public static final RegistryObject<Item> GOLDENCOIN = REGISTRY.register("goldencoin", () -> new GoldencoinItem());
	public static final RegistryObject<Item> SILVERBLOCK = block(KingdomModBlocks.SILVERBLOCK);
	public static final RegistryObject<Item> RAWSILVERBLOCK = block(KingdomModBlocks.RAWSILVERBLOCK);
	public static final RegistryObject<Item> UNDEADKNIGHTARCHER_SPAWN_EGG = REGISTRY.register("undeadknightarcher_spawn_egg", () -> new ForgeSpawnEggItem(KingdomModEntities.UNDEADKNIGHTARCHER, -8176105, -6383476, new Item.Properties()));
	public static final RegistryObject<Item> SAMPLESWORD = REGISTRY.register("samplesword", () -> new SampleswordItem());
	public static final RegistryObject<Item> SAMPLEARMOR = REGISTRY.register("samplearmor", () -> new SamplearmorItem());
	public static final RegistryObject<Item> DIAMONDSABER = REGISTRY.register("diamondsaber", () -> new DiamondsaberItem());
	public static final RegistryObject<Item> NETHERITESABER = REGISTRY.register("netheritesaber", () -> new NetheritesaberItem());
	public static final RegistryObject<Item> DIAMONDSHARD = REGISTRY.register("diamondshard", () -> new DiamondshardItem());
	public static final RegistryObject<Item> BIGGOLDENSWORD = REGISTRY.register("biggoldensword", () -> new BiggoldenswordItem());
	public static final RegistryObject<Item> BIGIRONSWORD = REGISTRY.register("bigironsword", () -> new BigironswordItem());
	public static final RegistryObject<Item> BIGDIAMONDSWORD = REGISTRY.register("bigdiamondsword", () -> new BigdiamondswordItem());
	public static final RegistryObject<Item> BIGNETHERITESWORD = REGISTRY.register("bignetheritesword", () -> new BignetheriteswordItem());
	public static final RegistryObject<Item> BIGSILVERSWORD = REGISTRY.register("bigsilversword", () -> new BigsilverswordItem());
	public static final RegistryObject<Item> BOOK_OF_RECIPES = REGISTRY.register("book_of_recipes", () -> new CraftbookItem());
	public static final RegistryObject<Item> CHISEL = REGISTRY.register("chisel", () -> new ChiselItem());
	public static final RegistryObject<Item> SILVERSWORD = REGISTRY.register("silversword", () -> new SilverswordItem());
	public static final RegistryObject<Item> SILVERPICKAXE = REGISTRY.register("silverpickaxe", () -> new SilverpickaxeItem());
	public static final RegistryObject<Item> SILVERAXE = REGISTRY.register("silveraxe", () -> new SilveraxeItem());
	public static final RegistryObject<Item> SILVERSHOVEL = REGISTRY.register("silvershovel", () -> new SilvershovelItem());
	public static final RegistryObject<Item> SILVERHOE = REGISTRY.register("silverhoe", () -> new SilverhoeItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
