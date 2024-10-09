package net.cilb.kingdom.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.cilb.kingdom.world.inventory.CraftbookchainmailhelmetMenu;
import net.cilb.kingdom.network.CraftbookchainmailhelmetButtonMessage;
import net.cilb.kingdom.KingdomMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class CraftbookchainmailhelmetScreen extends AbstractContainerScreen<CraftbookchainmailhelmetMenu> {
	private final static HashMap<String, Object> guistate = CraftbookchainmailhelmetMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_trade_arrow;
	ImageButton imagebutton_trade_arrow_left;

	public CraftbookchainmailhelmetScreen(CraftbookchainmailhelmetMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 0;
	}

	private static final ResourceLocation texture = new ResourceLocation("kingdom:textures/screens/craftbookarmor.png");

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

		guiGraphics.blit(new ResourceLocation("kingdom:textures/screens/craft_gui_armor.png"), this.leftPos + -109, this.topPos + -76, 0, 0, 88, 51, 88, 51);

		guiGraphics.blit(new ResourceLocation("kingdom:textures/screens/craft_gui_armor.png"), this.leftPos + -109, this.topPos + -13, 0, 0, 88, 51, 88, 51);

		guiGraphics.blit(new ResourceLocation("kingdom:textures/screens/craft_gui_armor.png"), this.leftPos + 17, this.topPos + -76, 0, 0, 88, 51, 88, 51);

		guiGraphics.blit(new ResourceLocation("kingdom:textures/screens/craft_gui_armor.png"), this.leftPos + 17, this.topPos + -13, 0, 0, 88, 51, 88, 51);

		guiGraphics.blit(new ResourceLocation("kingdom:textures/screens/sampel_armor.png"), this.leftPos + 68, this.topPos + 26, 0, 0, 8, 8, 8, 8);

		guiGraphics.blit(new ResourceLocation("kingdom:textures/screens/sampel_armor.png"), this.leftPos + 68, this.topPos + -37, 0, 0, 8, 8, 8, 8);

		guiGraphics.blit(new ResourceLocation("kingdom:textures/screens/sampel_armor.png"), this.leftPos + -58, this.topPos + -37, 0, 0, 8, 8, 8, 8);

		guiGraphics.blit(new ResourceLocation("kingdom:textures/screens/sampel_armor.png"), this.leftPos + -58, this.topPos + 26, 0, 0, 8, 8, 8, 8);

		guiGraphics.blit(new ResourceLocation("kingdom:textures/screens/chainmail_helmet.png"), this.leftPos + -41, this.topPos + -51, 0, 0, 8, 8, 8, 8);

		guiGraphics.blit(new ResourceLocation("kingdom:textures/screens/chainmail_chestplate.png"), this.leftPos + -41, this.topPos + 12, 0, 0, 8, 8, 8, 8);

		guiGraphics.blit(new ResourceLocation("kingdom:textures/screens/chainmail_leggings.png"), this.leftPos + 85, this.topPos + -51, 0, 0, 8, 8, 8, 8);

		guiGraphics.blit(new ResourceLocation("kingdom:textures/screens/chainmail_boots.png"), this.leftPos + 85, this.topPos + 12, 0, 0, 8, 8, 8, 8);

		guiGraphics.blit(new ResourceLocation("kingdom:textures/screens/iron_nugget.png"), this.leftPos + -105, this.topPos + -73, 0, 0, 8, 8, 8, 8);

		guiGraphics.blit(new ResourceLocation("kingdom:textures/screens/iron_nugget.png"), this.leftPos + -96, this.topPos + -73, 0, 0, 8, 8, 8, 8);

		guiGraphics.blit(new ResourceLocation("kingdom:textures/screens/iron_nugget.png"), this.leftPos + -87, this.topPos + -73, 0, 0, 8, 8, 8, 8);

		guiGraphics.blit(new ResourceLocation("kingdom:textures/screens/iron_nugget.png"), this.leftPos + -78, this.topPos + -73, 0, 0, 8, 8, 8, 8);

		guiGraphics.blit(new ResourceLocation("kingdom:textures/screens/iron_nugget.png"), this.leftPos + -69, this.topPos + -73, 0, 0, 8, 8, 8, 8);

		guiGraphics.blit(new ResourceLocation("kingdom:textures/screens/iron_nugget.png"), this.leftPos + -105, this.topPos + -64, 0, 0, 8, 8, 8, 8);

		guiGraphics.blit(new ResourceLocation("kingdom:textures/screens/iron_nugget.png"), this.leftPos + -96, this.topPos + -64, 0, 0, 8, 8, 8, 8);

		guiGraphics.blit(new ResourceLocation("kingdom:textures/screens/iron_nugget.png"), this.leftPos + -78, this.topPos + -64, 0, 0, 8, 8, 8, 8);

		guiGraphics.blit(new ResourceLocation("kingdom:textures/screens/iron_nugget.png"), this.leftPos + -69, this.topPos + -64, 0, 0, 8, 8, 8, 8);

		guiGraphics.blit(new ResourceLocation("kingdom:textures/screens/iron_nugget.png"), this.leftPos + -105, this.topPos + -55, 0, 0, 8, 8, 8, 8);

		guiGraphics.blit(new ResourceLocation("kingdom:textures/screens/iron_nugget.png"), this.leftPos + -69, this.topPos + -55, 0, 0, 8, 8, 8, 8);

		guiGraphics.blit(new ResourceLocation("kingdom:textures/screens/iron_nugget.png"), this.leftPos + -105, this.topPos + -10, 0, 0, 8, 8, 8, 8);

		guiGraphics.blit(new ResourceLocation("kingdom:textures/screens/iron_nugget.png"), this.leftPos + -105, this.topPos + -1, 0, 0, 8, 8, 8, 8);

		guiGraphics.blit(new ResourceLocation("kingdom:textures/screens/iron_nugget.png"), this.leftPos + -96, this.topPos + -1, 0, 0, 8, 8, 8, 8);

		guiGraphics.blit(new ResourceLocation("kingdom:textures/screens/iron_nugget.png"), this.leftPos + -105, this.topPos + 8, 0, 0, 8, 8, 8, 8);

		guiGraphics.blit(new ResourceLocation("kingdom:textures/screens/iron_nugget.png"), this.leftPos + -96, this.topPos + 8, 0, 0, 8, 8, 8, 8);

		guiGraphics.blit(new ResourceLocation("kingdom:textures/screens/iron_nugget.png"), this.leftPos + -87, this.topPos + 8, 0, 0, 8, 8, 8, 8);

		guiGraphics.blit(new ResourceLocation("kingdom:textures/screens/iron_nugget.png"), this.leftPos + -78, this.topPos + 8, 0, 0, 8, 8, 8, 8);

		guiGraphics.blit(new ResourceLocation("kingdom:textures/screens/iron_nugget.png"), this.leftPos + -69, this.topPos + 8, 0, 0, 8, 8, 8, 8);

		guiGraphics.blit(new ResourceLocation("kingdom:textures/screens/iron_nugget.png"), this.leftPos + -69, this.topPos + -1, 0, 0, 8, 8, 8, 8);

		guiGraphics.blit(new ResourceLocation("kingdom:textures/screens/iron_nugget.png"), this.leftPos + -78, this.topPos + -1, 0, 0, 8, 8, 8, 8);

		guiGraphics.blit(new ResourceLocation("kingdom:textures/screens/iron_nugget.png"), this.leftPos + -69, this.topPos + -10, 0, 0, 8, 8, 8, 8);

		guiGraphics.blit(new ResourceLocation("kingdom:textures/screens/iron_nugget.png"), this.leftPos + -96, this.topPos + 16, 0, 0, 8, 8, 8, 8);

		guiGraphics.blit(new ResourceLocation("kingdom:textures/screens/iron_nugget.png"), this.leftPos + -87, this.topPos + 16, 0, 0, 8, 8, 8, 8);

		guiGraphics.blit(new ResourceLocation("kingdom:textures/screens/iron_nugget.png"), this.leftPos + -78, this.topPos + 16, 0, 0, 8, 8, 8, 8);

		guiGraphics.blit(new ResourceLocation("kingdom:textures/screens/iron_nugget.png"), this.leftPos + -87, this.topPos + 25, 0, 0, 8, 8, 8, 8);

		guiGraphics.blit(new ResourceLocation("kingdom:textures/screens/iron_nugget.png"), this.leftPos + -96, this.topPos + 25, 0, 0, 8, 8, 8, 8);

		guiGraphics.blit(new ResourceLocation("kingdom:textures/screens/iron_nugget.png"), this.leftPos + -78, this.topPos + 25, 0, 0, 8, 8, 8, 8);

		guiGraphics.blit(new ResourceLocation("kingdom:textures/screens/iron_nugget.png"), this.leftPos + 21, this.topPos + -73, 0, 0, 8, 8, 8, 8);

		guiGraphics.blit(new ResourceLocation("kingdom:textures/screens/iron_nugget.png"), this.leftPos + 30, this.topPos + -73, 0, 0, 8, 8, 8, 8);

		guiGraphics.blit(new ResourceLocation("kingdom:textures/screens/iron_nugget.png"), this.leftPos + 39, this.topPos + -73, 0, 0, 8, 8, 8, 8);

		guiGraphics.blit(new ResourceLocation("kingdom:textures/screens/iron_nugget.png"), this.leftPos + 48, this.topPos + -73, 0, 0, 8, 8, 8, 8);

		guiGraphics.blit(new ResourceLocation("kingdom:textures/screens/iron_nugget.png"), this.leftPos + 57, this.topPos + -73, 0, 0, 8, 8, 8, 8);

		guiGraphics.blit(new ResourceLocation("kingdom:textures/screens/iron_nugget.png"), this.leftPos + 21, this.topPos + -64, 0, 0, 8, 8, 8, 8);

		guiGraphics.blit(new ResourceLocation("kingdom:textures/screens/iron_nugget.png"), this.leftPos + 30, this.topPos + -64, 0, 0, 8, 8, 8, 8);

		guiGraphics.blit(new ResourceLocation("kingdom:textures/screens/iron_nugget.png"), this.leftPos + 48, this.topPos + -64, 0, 0, 8, 8, 8, 8);

		guiGraphics.blit(new ResourceLocation("kingdom:textures/screens/iron_nugget.png"), this.leftPos + 57, this.topPos + -64, 0, 0, 8, 8, 8, 8);

		guiGraphics.blit(new ResourceLocation("kingdom:textures/screens/iron_nugget.png"), this.leftPos + 21, this.topPos + -55, 0, 0, 8, 8, 8, 8);

		guiGraphics.blit(new ResourceLocation("kingdom:textures/screens/iron_nugget.png"), this.leftPos + 21, this.topPos + -47, 0, 0, 8, 8, 8, 8);

		guiGraphics.blit(new ResourceLocation("kingdom:textures/screens/iron_nugget.png"), this.leftPos + 21, this.topPos + -38, 0, 0, 8, 8, 8, 8);

		guiGraphics.blit(new ResourceLocation("kingdom:textures/screens/iron_nugget.png"), this.leftPos + 57, this.topPos + -55, 0, 0, 8, 8, 8, 8);

		guiGraphics.blit(new ResourceLocation("kingdom:textures/screens/iron_nugget.png"), this.leftPos + 57, this.topPos + -47, 0, 0, 8, 8, 8, 8);

		guiGraphics.blit(new ResourceLocation("kingdom:textures/screens/iron_nugget.png"), this.leftPos + 57, this.topPos + -38, 0, 0, 8, 8, 8, 8);

		guiGraphics.blit(new ResourceLocation("kingdom:textures/screens/iron_nugget.png"), this.leftPos + 30, this.topPos + 8, 0, 0, 8, 8, 8, 8);

		guiGraphics.blit(new ResourceLocation("kingdom:textures/screens/iron_nugget.png"), this.leftPos + 48, this.topPos + 8, 0, 0, 8, 8, 8, 8);

		guiGraphics.blit(new ResourceLocation("kingdom:textures/screens/iron_nugget.png"), this.leftPos + 48, this.topPos + 16, 0, 0, 8, 8, 8, 8);

		guiGraphics.blit(new ResourceLocation("kingdom:textures/screens/iron_nugget.png"), this.leftPos + 48, this.topPos + 25, 0, 0, 8, 8, 8, 8);

		guiGraphics.blit(new ResourceLocation("kingdom:textures/screens/iron_nugget.png"), this.leftPos + 57, this.topPos + 25, 0, 0, 8, 8, 8, 8);

		guiGraphics.blit(new ResourceLocation("kingdom:textures/screens/iron_nugget.png"), this.leftPos + 30, this.topPos + 16, 0, 0, 8, 8, 8, 8);

		guiGraphics.blit(new ResourceLocation("kingdom:textures/screens/iron_nugget.png"), this.leftPos + 30, this.topPos + 25, 0, 0, 8, 8, 8, 8);

		guiGraphics.blit(new ResourceLocation("kingdom:textures/screens/iron_nugget.png"), this.leftPos + 21, this.topPos + 25, 0, 0, 8, 8, 8, 8);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.kingdom.craftbookarmor.label_chainmail_helmet"), -109, -85, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.kingdom.craftbookarmor.label_chainmail_chestplate"), -118, -22, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.kingdom.craftbookarmor.label_chainmail_leggings"), 14, -85, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.kingdom.craftbookarmor.label_chainmail_boots"), 20, -22, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_trade_arrow = new ImageButton(this.leftPos + 98, this.topPos + 59, 24, 17, 0, 0, 17, new ResourceLocation("kingdom:textures/screens/atlas/imagebutton_trade_arrow.png"), 24, 34, e -> {
			if (true) {
				KingdomMod.PACKET_HANDLER.sendToServer(new CraftbookchainmailhelmetButtonMessage(0, x, y, z));
				CraftbookchainmailhelmetButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_trade_arrow", imagebutton_trade_arrow);
		this.addRenderableWidget(imagebutton_trade_arrow);
		imagebutton_trade_arrow_left = new ImageButton(this.leftPos + -118, this.topPos + 59, 24, 17, 0, 0, 17, new ResourceLocation("kingdom:textures/screens/atlas/imagebutton_trade_arrow_left.png"), 24, 34, e -> {
			if (true) {
				KingdomMod.PACKET_HANDLER.sendToServer(new CraftbookchainmailhelmetButtonMessage(1, x, y, z));
				CraftbookchainmailhelmetButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_trade_arrow_left", imagebutton_trade_arrow_left);
		this.addRenderableWidget(imagebutton_trade_arrow_left);
	}
}
