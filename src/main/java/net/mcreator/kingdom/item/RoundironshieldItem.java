
package net.mcreator.kingdom.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ShieldItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class RoundironshieldItem extends ShieldItem {
	public RoundironshieldItem() {
		super(new Item.Properties().durability(416));
	}

	@Override
	public boolean isValidRepairItem(ItemStack itemstack, ItemStack repairitem) {
		return Ingredient.of(new ItemStack(Items.IRON_INGOT)).test(repairitem);
	}
}
