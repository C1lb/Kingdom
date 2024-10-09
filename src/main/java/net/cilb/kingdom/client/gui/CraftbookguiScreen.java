package net.cilb.kingdom.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.cilb.kingdom.world.inventory.CraftbookguiMenu;
import net.cilb.kingdom.network.CraftbookguiButtonMessage;
import net.cilb.kingdom.KingdomMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class CraftbookguiScreen extends AbstractContainerScreen<CraftbookguiMenu> {
	private final static HashMap<String, Object> guistate = CraftbookguiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_trade_arrow;
	ImageButton imagebutton_chainmail_helmet;
	ImageButton imagebutton_chainmail_chestplate;
	ImageButton imagebutton_chainmail_leggings;
	ImageButton imagebutton_chainmail_boots;
	ImageButton imagebutton_saber;
	ImageButton imagebutton_big_sword;

	public CraftbookguiScreen(CraftbookguiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 0;
	}

	private static final ResourceLocation texture = new ResourceLocation("kingdom:textures/screens/craftbookguimenu.png");

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
		guiGraphics.drawString(this.font, Component.translatable("gui.kingdom.craftbookguimenu.label_armor"), 49, -85, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.kingdom.craftbookguimenu.label_saber"), 49, -47, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.kingdom.craftbookguimenu.label_big_sward"), 39, -11, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.kingdom.craftbookguimenu.label_welcome_to_craft_book_to_see_the"), -118, -83, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.kingdom.craftbookguimenu.label_to_see_the_recipe_click_on_the"), -109, -63, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.kingdom.craftbookguimenu.label_click_on_the_item_or_on_the_arro"), -107, -51, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.kingdom.craftbookguimenu.label_or"), -69, -37, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.kingdom.craftbookguimenu.label_on_the_arrow"), -95, -25, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_trade_arrow = new ImageButton(this.leftPos + 98, this.topPos + 59, 24, 17, 0, 0, 17, new ResourceLocation("kingdom:textures/screens/atlas/imagebutton_trade_arrow.png"), 24, 34, e -> {
			if (true) {
				KingdomMod.PACKET_HANDLER.sendToServer(new CraftbookguiButtonMessage(0, x, y, z));
				CraftbookguiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_trade_arrow", imagebutton_trade_arrow);
		this.addRenderableWidget(imagebutton_trade_arrow);
		imagebutton_chainmail_helmet = new ImageButton(this.leftPos + 8, this.topPos + -67, 16, 16, 0, 0, 16, new ResourceLocation("kingdom:textures/screens/atlas/imagebutton_chainmail_helmet.png"), 16, 32, e -> {
			if (true) {
				KingdomMod.PACKET_HANDLER.sendToServer(new CraftbookguiButtonMessage(1, x, y, z));
				CraftbookguiButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_chainmail_helmet", imagebutton_chainmail_helmet);
		this.addRenderableWidget(imagebutton_chainmail_helmet);
		imagebutton_chainmail_chestplate = new ImageButton(this.leftPos + 35, this.topPos + -67, 16, 16, 0, 0, 16, new ResourceLocation("kingdom:textures/screens/atlas/imagebutton_chainmail_chestplate.png"), 16, 32, e -> {
			if (true) {
				KingdomMod.PACKET_HANDLER.sendToServer(new CraftbookguiButtonMessage(2, x, y, z));
				CraftbookguiButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_chainmail_chestplate", imagebutton_chainmail_chestplate);
		this.addRenderableWidget(imagebutton_chainmail_chestplate);
		imagebutton_chainmail_leggings = new ImageButton(this.leftPos + 62, this.topPos + -67, 16, 16, 0, 0, 16, new ResourceLocation("kingdom:textures/screens/atlas/imagebutton_chainmail_leggings.png"), 16, 32, e -> {
			if (true) {
				KingdomMod.PACKET_HANDLER.sendToServer(new CraftbookguiButtonMessage(3, x, y, z));
				CraftbookguiButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:imagebutton_chainmail_leggings", imagebutton_chainmail_leggings);
		this.addRenderableWidget(imagebutton_chainmail_leggings);
		imagebutton_chainmail_boots = new ImageButton(this.leftPos + 89, this.topPos + -67, 16, 16, 0, 0, 16, new ResourceLocation("kingdom:textures/screens/atlas/imagebutton_chainmail_boots.png"), 16, 32, e -> {
			if (true) {
				KingdomMod.PACKET_HANDLER.sendToServer(new CraftbookguiButtonMessage(4, x, y, z));
				CraftbookguiButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		});
		guistate.put("button:imagebutton_chainmail_boots", imagebutton_chainmail_boots);
		this.addRenderableWidget(imagebutton_chainmail_boots);
		imagebutton_saber = new ImageButton(this.leftPos + 53, this.topPos + -31, 16, 16, 0, 0, 16, new ResourceLocation("kingdom:textures/screens/atlas/imagebutton_saber.png"), 16, 32, e -> {
			if (true) {
				KingdomMod.PACKET_HANDLER.sendToServer(new CraftbookguiButtonMessage(5, x, y, z));
				CraftbookguiButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		});
		guistate.put("button:imagebutton_saber", imagebutton_saber);
		this.addRenderableWidget(imagebutton_saber);
		imagebutton_big_sword = new ImageButton(this.leftPos + 49, this.topPos + -4, 32, 32, 0, 0, 32, new ResourceLocation("kingdom:textures/screens/atlas/imagebutton_big_sword.png"), 32, 64, e -> {
			if (true) {
				KingdomMod.PACKET_HANDLER.sendToServer(new CraftbookguiButtonMessage(6, x, y, z));
				CraftbookguiButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		});
		guistate.put("button:imagebutton_big_sword", imagebutton_big_sword);
		this.addRenderableWidget(imagebutton_big_sword);
	}
}
