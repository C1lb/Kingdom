
package net.cilb.kingdom.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.cilb.kingdom.world.inventory.CraftbookguiMenu;
import net.cilb.kingdom.procedures.OpencraftbooksaberandbigswordProcedure;
import net.cilb.kingdom.procedures.OpencraftbookarmorProcedure;
import net.cilb.kingdom.KingdomMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CraftbookguiButtonMessage {
	private final int buttonID, x, y, z;

	public CraftbookguiButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public CraftbookguiButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(CraftbookguiButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(CraftbookguiButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level();
		HashMap guistate = CraftbookguiMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			OpencraftbookarmorProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			OpencraftbookarmorProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			OpencraftbookarmorProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			OpencraftbookarmorProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 4) {

			OpencraftbookarmorProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 5) {

			OpencraftbooksaberandbigswordProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 6) {

			OpencraftbooksaberandbigswordProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		KingdomMod.addNetworkMessage(CraftbookguiButtonMessage.class, CraftbookguiButtonMessage::buffer, CraftbookguiButtonMessage::new, CraftbookguiButtonMessage::handler);
	}
}
