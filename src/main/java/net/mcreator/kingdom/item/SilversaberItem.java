
package net.mcreator.kingdom.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.kingdom.init.KingdomModItems;

public class SilversaberItem extends SwordItem {
	public SilversaberItem() {
		super(new Tier() {
			public int getUses() {
				return 225;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 0.5f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(KingdomModItems.SILVERBAR.get()));
			}
		}, 3, -1f, new Item.Properties());
	}
}
