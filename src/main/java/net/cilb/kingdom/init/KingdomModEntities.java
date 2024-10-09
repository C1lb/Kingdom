
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.cilb.kingdom.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.cilb.kingdom.entity.UndeadknightarcherEntity;
import net.cilb.kingdom.entity.UndeadKnightEntity;
import net.cilb.kingdom.entity.KnightarcherEntity;
import net.cilb.kingdom.entity.KinghtEntity;
import net.cilb.kingdom.KingdomMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class KingdomModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, KingdomMod.MODID);
	public static final RegistryObject<EntityType<UndeadKnightEntity>> UNDEAD_KNIGHT = register("undead_knight", EntityType.Builder.<UndeadKnightEntity>of(UndeadKnightEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(70).setUpdateInterval(3).setCustomClientFactory(UndeadKnightEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<KinghtEntity>> KINGHT = register("kinght",
			EntityType.Builder.<KinghtEntity>of(KinghtEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(70).setUpdateInterval(3).setCustomClientFactory(KinghtEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<KnightarcherEntity>> KNIGHTARCHER = register("knightarcher",
			EntityType.Builder.<KnightarcherEntity>of(KnightarcherEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(70).setUpdateInterval(3).setCustomClientFactory(KnightarcherEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<UndeadknightarcherEntity>> UNDEADKNIGHTARCHER = register("undeadknightarcher", EntityType.Builder.<UndeadknightarcherEntity>of(UndeadknightarcherEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(70).setUpdateInterval(3).setCustomClientFactory(UndeadknightarcherEntity::new).fireImmune().sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			UndeadKnightEntity.init();
			KinghtEntity.init();
			KnightarcherEntity.init();
			UndeadknightarcherEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(UNDEAD_KNIGHT.get(), UndeadKnightEntity.createAttributes().build());
		event.put(KINGHT.get(), KinghtEntity.createAttributes().build());
		event.put(KNIGHTARCHER.get(), KnightarcherEntity.createAttributes().build());
		event.put(UNDEADKNIGHTARCHER.get(), UndeadknightarcherEntity.createAttributes().build());
	}
}
