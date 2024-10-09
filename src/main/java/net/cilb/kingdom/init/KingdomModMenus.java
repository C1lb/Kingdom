
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.cilb.kingdom.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.cilb.kingdom.world.inventory.CraftbooksaberMenu;
import net.cilb.kingdom.world.inventory.CraftbookguiMenu;
import net.cilb.kingdom.world.inventory.CraftbookchainmailhelmetMenu;
import net.cilb.kingdom.world.inventory.AnvilcrafttabelsaberMenu;
import net.cilb.kingdom.world.inventory.AnvilcrafttabelmenuMenu;
import net.cilb.kingdom.world.inventory.AnvilcraftbigswordMenu;
import net.cilb.kingdom.world.inventory.AnvilcraftarmorMenu;
import net.cilb.kingdom.KingdomMod;

public class KingdomModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, KingdomMod.MODID);
	public static final RegistryObject<MenuType<AnvilcrafttabelmenuMenu>> ANVILCRAFTTABELMENU = REGISTRY.register("anvilcrafttabelmenu", () -> IForgeMenuType.create(AnvilcrafttabelmenuMenu::new));
	public static final RegistryObject<MenuType<AnvilcrafttabelsaberMenu>> ANVILCRAFTTABELSABER = REGISTRY.register("anvilcrafttabelsaber", () -> IForgeMenuType.create(AnvilcrafttabelsaberMenu::new));
	public static final RegistryObject<MenuType<AnvilcraftbigswordMenu>> ANVILCRAFTBIGSWORD = REGISTRY.register("anvilcraftbigsword", () -> IForgeMenuType.create(AnvilcraftbigswordMenu::new));
	public static final RegistryObject<MenuType<AnvilcraftarmorMenu>> ANVILCRAFTARMOR = REGISTRY.register("anvilcraftarmor", () -> IForgeMenuType.create(AnvilcraftarmorMenu::new));
	public static final RegistryObject<MenuType<CraftbookguiMenu>> CRAFTBOOKGUIMENU = REGISTRY.register("craftbookguimenu", () -> IForgeMenuType.create(CraftbookguiMenu::new));
	public static final RegistryObject<MenuType<CraftbookchainmailhelmetMenu>> CRAFTBOOKARMOR = REGISTRY.register("craftbookarmor", () -> IForgeMenuType.create(CraftbookchainmailhelmetMenu::new));
	public static final RegistryObject<MenuType<CraftbooksaberMenu>> CRAFTBOOKSABER_AND_BIG_SWARD = REGISTRY.register("craftbooksaber_and_big_sward", () -> IForgeMenuType.create(CraftbooksaberMenu::new));
}
