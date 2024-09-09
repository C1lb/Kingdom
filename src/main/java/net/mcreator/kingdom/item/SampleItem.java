
package net.mcreator.kingdom.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class SampleItem extends Item {
	public SampleItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
