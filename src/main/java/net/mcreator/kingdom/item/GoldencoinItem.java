
package net.mcreator.kingdom.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class GoldencoinItem extends Item {
	public GoldencoinItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.RARE));
	}
}
