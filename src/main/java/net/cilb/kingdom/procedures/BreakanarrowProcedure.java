package net.cilb.kingdom.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.core.registries.Registries;

public class BreakanarrowProcedure {
	public static void execute(LevelAccessor world, Entity Arrow) {
		if (Arrow == null)
			return;
		if (new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.PLAYER_ATTACK)).is(DamageTypes.PLAYER_ATTACK)) {
			Arrow.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.PLAYER_ATTACK)), 1);
		}
	}
}
