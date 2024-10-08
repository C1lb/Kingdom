package net.cilb.kingdom.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.cilb.kingdom.world.inventory.AnvilcraftbigswordMenu;
import net.cilb.kingdom.network.AnvilcraftbigswordButtonMessage;
import net.cilb.kingdom.KingdomMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class AnvilcraftbigswordScreen extends AbstractContainerScreen<AnvilcraftbigswordMenu> {
	private final static HashMap<String, Object> guistate = AnvilcraftbigswordMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_back;
	Button button_craft;

	public AnvilcraftbigswordScreen(AnvilcraftbigswordMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 182;
	}

	private static final ResourceLocation texture = new ResourceLocation("kingdom:textures/screens/anvilcraftbigsword.png");

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
	}

	@Override
	public void init() {
		super.init();
		button_back = Button.builder(Component.translatable("gui.kingdom.anvilcraftbigsword.button_back"), e -> {
			if (true) {
				KingdomMod.PACKET_HANDLER.sendToServer(new AnvilcraftbigswordButtonMessage(0, x, y, z));
				AnvilcraftbigswordButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + -120, this.topPos + 186, 46, 20).build();
		guistate.put("button:button_back", button_back);
		this.addRenderableWidget(button_back);
		button_craft = Button.builder(Component.translatable("gui.kingdom.anvilcraftbigsword.button_craft"), e -> {
			if (true) {
				KingdomMod.PACKET_HANDLER.sendToServer(new AnvilcraftbigswordButtonMessage(1, x, y, z));
				AnvilcraftbigswordButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 115, this.topPos + 72, 51, 20).build();
		guistate.put("button:button_craft", button_craft);
		this.addRenderableWidget(button_craft);
	}
}
