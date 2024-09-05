
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.kingdom.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.kingdom.client.renderer.UndeadKnightRenderer;
import net.mcreator.kingdom.client.renderer.KnightarcherRenderer;
import net.mcreator.kingdom.client.renderer.KinghtRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class KingdomModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(KingdomModEntities.UNDEAD_KNIGHT.get(), UndeadKnightRenderer::new);
		event.registerEntityRenderer(KingdomModEntities.KINGHT.get(), KinghtRenderer::new);
		event.registerEntityRenderer(KingdomModEntities.KNIGHTARCHER.get(), KnightarcherRenderer::new);
	}
}
