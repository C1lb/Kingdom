
package net.mcreator.kingdom.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class SilvercoinItem extends Item {
	public SilvercoinItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON));
	}
}
