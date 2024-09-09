
package net.mcreator.kingdom.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class DiamondshardItem extends Item {
	public DiamondshardItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
