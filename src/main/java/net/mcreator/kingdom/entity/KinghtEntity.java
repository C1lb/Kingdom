
package net.mcreator.kingdom.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.WitherSkull;
import net.minecraft.world.entity.monster.ZombieVillager;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.entity.monster.WitherSkeleton;
import net.minecraft.world.entity.monster.Witch;
import net.minecraft.world.entity.monster.Slime;
import net.minecraft.world.entity.monster.Skeleton;
import net.minecraft.world.entity.monster.EnderMan;
import net.minecraft.world.entity.monster.Creeper;
import net.minecraft.world.entity.boss.enderdragon.EnderDragon;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.Packet;

import net.mcreator.kingdom.init.KingdomModItems;
import net.mcreator.kingdom.init.KingdomModEntities;

public class KinghtEntity extends PathfinderMob {
	public KinghtEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(KingdomModEntities.KINGHT.get(), world);
	}

	public KinghtEntity(EntityType<KinghtEntity> type, Level world) {
		super(type, world);
		setMaxUpStep(0.6f);
		xpReward = 5;
		setNoAi(false);
		this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(KingdomModItems.IRONSHABER.get()));
	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.3, false) {
			@Override
			protected double getAttackReachSqr(LivingEntity entity) {
				return this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth();
			}
		});
		this.targetSelector.addGoal(2, new NearestAttackableTargetGoal(this, UndeadKnightEntity.class, true, false));
		this.targetSelector.addGoal(3, new NearestAttackableTargetGoal(this, Zombie.class, true, false));
		this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, ZombieVillager.class, true, false));
		this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, Skeleton.class, true, false));
		this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, WitherSkeleton.class, true, false));
		this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, WitherSkull.class, true, false));
		this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, Witch.class, true, false));
		this.targetSelector.addGoal(9, new NearestAttackableTargetGoal(this, Slime.class, true, false));
		this.targetSelector.addGoal(10, new NearestAttackableTargetGoal(this, Creeper.class, true, false));
		this.targetSelector.addGoal(11, new NearestAttackableTargetGoal(this, EnderMan.class, true, false));
		this.targetSelector.addGoal(12, new NearestAttackableTargetGoal(this, EnderDragon.class, true, false));
		this.goalSelector.addGoal(14, new RandomStrollGoal(this, 1));
		this.targetSelector.addGoal(15, new HurtByTargetGoal(this).setAlertOthers());
		this.goalSelector.addGoal(16, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(17, new FloatGoal(this));
	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEFINED;
	}

	@Override
	public double getMyRidingOffset() {
		return -0.35D;
	}

	protected void dropCustomDeathLoot(DamageSource source, int looting, boolean recentlyHitIn) {
		super.dropCustomDeathLoot(source, looting, recentlyHitIn);
		this.spawnAtLocation(new ItemStack(KingdomModItems.IRONCOIN.get()));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
	}

	@Override
	public boolean isPushable() {
		return false;
	}

	@Override
	protected void doPush(Entity entityIn) {
	}

	@Override
	protected void pushEntities() {
	}

	public static void init() {
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.2);
		builder = builder.add(Attributes.MAX_HEALTH, 25);
		builder = builder.add(Attributes.ARMOR, 1.5);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 7);
		builder = builder.add(Attributes.FOLLOW_RANGE, 20);
		builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 0.1);
		builder = builder.add(Attributes.ATTACK_KNOCKBACK, 0.2);
		return builder;
	}
}
