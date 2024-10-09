
package net.cilb.kingdom.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class PiecesilverItem extends Item {
	public PiecesilverItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
