
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.cilb.kingdom.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.cilb.kingdom.client.gui.CraftbooksaberScreen;
import net.cilb.kingdom.client.gui.CraftbookguiScreen;
import net.cilb.kingdom.client.gui.CraftbookchainmailhelmetScreen;
import net.cilb.kingdom.client.gui.AnvilcrafttabelsaberScreen;
import net.cilb.kingdom.client.gui.AnvilcrafttabelmenuScreen;
import net.cilb.kingdom.client.gui.AnvilcraftbigswordScreen;
import net.cilb.kingdom.client.gui.AnvilcraftarmorScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class KingdomModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(KingdomModMenus.ANVILCRAFTTABELMENU.get(), AnvilcrafttabelmenuScreen::new);
			MenuScreens.register(KingdomModMenus.ANVILCRAFTTABELSABER.get(), AnvilcrafttabelsaberScreen::new);
			MenuScreens.register(KingdomModMenus.ANVILCRAFTBIGSWORD.get(), AnvilcraftbigswordScreen::new);
			MenuScreens.register(KingdomModMenus.ANVILCRAFTARMOR.get(), AnvilcraftarmorScreen::new);
			MenuScreens.register(KingdomModMenus.CRAFTBOOKGUIMENU.get(), CraftbookguiScreen::new);
			MenuScreens.register(KingdomModMenus.CRAFTBOOKARMOR.get(), CraftbookchainmailhelmetScreen::new);
			MenuScreens.register(KingdomModMenus.CRAFTBOOKSABER_AND_BIG_SWARD.get(), CraftbooksaberScreen::new);
		});
	}
}
