
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.cilb.kingdom.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.cilb.kingdom.KingdomMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class KingdomModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, KingdomMod.MODID);
	public static final RegistryObject<CreativeModeTab> DIFFERENT = REGISTRY.register("different",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.kingdom.different")).icon(() -> new ItemStack(KingdomModBlocks.ANVIL.get())).displayItems((parameters, tabData) -> {
				tabData.accept(KingdomModBlocks.ANVIL.get().asItem());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> KINGDOMITEM = REGISTRY.register("kingdomitem",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.kingdom.kingdomitem")).icon(() -> new ItemStack(KingdomModItems.GOLDENCOIN.get())).displayItems((parameters, tabData) -> {
				tabData.accept(KingdomModItems.GOLDENCOIN.get());
				tabData.accept(KingdomModItems.SILVERCOIN.get());
				tabData.accept(KingdomModItems.IRONCOIN.get());
				tabData.accept(KingdomModItems.SAMPLE.get());
				tabData.accept(KingdomModItems.SAMPLESWORD.get());
				tabData.accept(KingdomModItems.SAMPLEBOW.get());
				tabData.accept(KingdomModItems.SAMPLEARMOR.get());
				tabData.accept(KingdomModItems.CRAFTBOOK.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> KINGDOM_ORE = REGISTRY.register("kingdom_ore",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.kingdom.kingdom_ore")).icon(() -> new ItemStack(KingdomModBlocks.SILVER_ORE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(KingdomModItems.PIECESILVER.get());
				tabData.accept(KingdomModItems.SILVERBAR.get());
				tabData.accept(KingdomModItems.SILVEROREITEM.get());
				tabData.accept(KingdomModBlocks.SILVERBLOCK.get().asItem());
				tabData.accept(KingdomModBlocks.RAWSILVERBLOCK.get().asItem());
				tabData.accept(KingdomModBlocks.SILVER_ORE.get().asItem());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> KINGDOMTOOLS = REGISTRY.register("kingdomtools",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.kingdom.kingdomtools")).icon(() -> new ItemStack(KingdomModItems.IRONSHABER.get())).displayItems((parameters, tabData) -> {
				tabData.accept(KingdomModItems.CHISEL.get());
				tabData.accept(KingdomModItems.HAMMER.get());
				tabData.accept(KingdomModItems.SILVERSABER.get());
				tabData.accept(KingdomModItems.IRONSHABER.get());
				tabData.accept(KingdomModItems.GOLDENSHABR.get());
				tabData.accept(KingdomModItems.DIAMONDSABER.get());
				tabData.accept(KingdomModItems.NETHERITESABER.get());
				tabData.accept(KingdomModItems.BIGSILVERSWORD.get());
				tabData.accept(KingdomModItems.BIGIRONSWORD.get());
				tabData.accept(KingdomModItems.BIGGOLDENSWORD.get());
				tabData.accept(KingdomModItems.BIGDIAMONDSWORD.get());
				tabData.accept(KingdomModItems.BIGNETHERITESWORD.get());
				tabData.accept(KingdomModItems.SILVER_HELMET.get());
				tabData.accept(KingdomModItems.SILVER_CHESTPLATE.get());
				tabData.accept(KingdomModItems.SILVER_LEGGINGS.get());
				tabData.accept(KingdomModItems.SILVER_BOOTS.get());
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(KingdomModItems.KINGHT_SPAWN_EGG.get());
			tabData.accept(KingdomModItems.KNIGHTARCHER_SPAWN_EGG.get());
			tabData.accept(KingdomModItems.UNDEAD_KNIGHT_SPAWN_EGG.get());
			tabData.accept(KingdomModItems.UNDEADKNIGHTARCHER_SPAWN_EGG.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(KingdomModItems.DIAMONDSHARD.get());
		}
	}
}
