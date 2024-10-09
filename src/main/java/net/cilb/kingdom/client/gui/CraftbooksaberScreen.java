package net.cilb.kingdom.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.cilb.kingdom.world.inventory.CraftbooksaberMenu;
import net.cilb.kingdom.network.CraftbooksaberButtonMessage;
import net.cilb.kingdom.KingdomMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class CraftbooksaberScreen extends AbstractContainerScreen<CraftbooksaberMenu> {
	private final static HashMap<String, Object> guistate = CraftbooksaberMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_trade_arrow_left;

	public CraftbooksaberScreen(CraftbooksaberMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 0;
	}

	private static final ResourceLocation texture = new ResourceLocation("kingdom:textures/screens/craftbooksaber_and_big_sward.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("kingdom:textures/screens/book_gui.png"), this.leftPos + -136, this.topPos + -94, 0, 0, 271, 180, 271, 180);

		guiGraphics.blit(new ResourceLocation("kingdom:textures/screens/craft_gui_saber.png"), this.leftPos + -109, this.topPos + -67, 0, 0, 88, 43, 88, 43);

		guiGraphics.blit(new ResourceLocation("kingdom:textures/screens/sampel_sword.png"), this.leftPos + -62, this.topPos + -37, 0, 0, 8, 8, 8, 8);

		guiGraphics.blit(new ResourceLocation("kingdom:textures/screens/stick.png"), this.leftPos + -96, this.topPos + -45, 0, 0, 8, 8, 8, 8);

		guiGraphics.blit(new ResourceLocation("kingdom:textures/screens/iron_ingot.png"), this.leftPos + -87, this.topPos + -54, 0, 0, 8, 8, 8, 8);

		guiGraphics.blit(new ResourceLocation("kingdom:textures/screens/iron_ingot.png"), this.leftPos + -78, this.topPos + -63, 0, 0, 8, 8, 8, 8);

		guiGraphics.blit(new ResourceLocation("kingdom:textures/screens/iron_nugget.png"), this.leftPos + -105, this.topPos + -36, 0, 0, 8, 8, 8, 8);

		guiGraphics.blit(new ResourceLocation("kingdom:textures/screens/craft_gui_big_sword.png"), this.leftPos + 17, this.topPos + -67, 0, 0, 88, 51, 88, 51);

		guiGraphics.blit(new ResourceLocation("kingdom:textures/screens/stick.png"), this.leftPos + 30, this.topPos + -36, 0, 0, 8, 8, 8, 8);

		guiGraphics.blit(new ResourceLocation("kingdom:textures/screens/iron_nugget.png"), this.leftPos + 21, this.topPos + -27, 0, 0, 8, 8, 8, 8);

		guiGraphics.blit(new ResourceLocation("kingdom:textures/screens/sampel_sword.png"), this.leftPos + 64, this.topPos + -30, 0, 0, 8, 8, 8, 8);

		guiGraphics.blit(new ResourceLocation("kingdom:textures/screens/big_sword.png"), this.leftPos + 82, this.topPos + -52, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("kingdom:textures/screens/iron_ingot.png"), this.leftPos + 39, this.topPos + -45, 0, 0, 8, 8, 8, 8);

		guiGraphics.blit(new ResourceLocation("kingdom:textures/screens/iron_ingot.png"), this.leftPos + 48, this.topPos + -54, 0, 0, 8, 8, 8, 8);

		guiGraphics.blit(new ResourceLocation("kingdom:textures/screens/iron_ingot.png"), this.leftPos + 57, this.topPos + -63, 0, 0, 8, 8, 8, 8);

		guiGraphics.blit(new ResourceLocation("kingdom:textures/screens/iron_nugget.png"), this.leftPos + 39, this.topPos + -36, 0, 0, 8, 8, 8, 8);

		guiGraphics.blit(new ResourceLocation("kingdom:textures/screens/iron_nugget.png"), this.leftPos + 48, this.topPos + -45, 0, 0, 8, 8, 8, 8);

		guiGraphics.blit(new ResourceLocation("kingdom:textures/screens/iron_nugget.png"), this.leftPos + 57, this.topPos + -54, 0, 0, 8, 8, 8, 8);

		guiGraphics.blit(new ResourceLocation("kingdom:textures/screens/iron_nugget.png"), this.leftPos + 48, this.topPos + -63, 0, 0, 8, 8, 8, 8);

		guiGraphics.blit(new ResourceLocation("kingdom:textures/screens/iron_nugget.png"), this.leftPos + 39, this.topPos + -54, 0, 0, 8, 8, 8, 8);

		guiGraphics.blit(new ResourceLocation("kingdom:textures/screens/iron_nugget.png"), this.leftPos + 30, this.topPos + -45, 0, 0, 8, 8, 8, 8);

		guiGraphics.blit(new ResourceLocation("kingdom:textures/screens/saber.png"), this.leftPos + -43, this.topPos + -51, 0, 0, 8, 8, 8, 8);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.kingdom.craftbooksaber_and_big_sward.label_saber"), -82, -76, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.kingdom.craftbooksaber_and_big_sward.label_big_sword"), 35, -76, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_trade_arrow_left = new ImageButton(this.leftPos + -118, this.topPos + 59, 24, 17, 0, 0, 17, new ResourceLocation("kingdom:textures/screens/atlas/imagebutton_trade_arrow_left.png"), 24, 34, e -> {
			if (true) {
				KingdomMod.PACKET_HANDLER.sendToServer(new CraftbooksaberButtonMessage(0, x, y, z));
				CraftbooksaberButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_trade_arrow_left", imagebutton_trade_arrow_left);
		this.addRenderableWidget(imagebutton_trade_arrow_left);
	}
}
