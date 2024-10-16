
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.cilb.kingdom.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerProfession;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class KingdomModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == VillagerProfession.WEAPONSMITH) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 5), new ItemStack(Items.PAPER, 6), new ItemStack(KingdomModItems.SAMPLESWORD.get()), 1, 8, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 9), new ItemStack(Items.PAPER, 6), new ItemStack(KingdomModItems.SAMPLEARMOR.get()), 1, 12, 0.05f));
		}
	}
}
