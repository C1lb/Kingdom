
package net.cilb.kingdom.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class SilveroreitemItem extends Item {
	public SilveroreitemItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
