package net.saifa.quackems_the_end_update_mod.entity.custom;

import net.minecraft.client.resources.sounds.Sound;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.AnimationState;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import net.saifa.quackems_the_end_update_mod.entity.ModEntities;
import net.saifa.quackems_the_end_update_mod.entity.ai.EndBruteAttackGoal;
import net.saifa.quackems_the_end_update_mod.item.ModItems;
import org.jetbrains.annotations.Nullable;

public class EndBruteEntity extends Animal {
    private static final EntityDataAccessor<Boolean> ATTACKING =
            SynchedEntityData.defineId(EndBruteEntity.class, EntityDataSerializers.BOOLEAN);


    public EndBruteEntity(EntityType<? extends Animal> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }




    public final AnimationState idleAnimationState = new AnimationState();
    private int idleAnimationTimeout = 0;


    public final AnimationState attackAnimationState = new AnimationState();
    public int attackAnimationTimeout = 0;


    @Override
    public void tick() {
        super.tick();

        if (this.level().isClientSide()){
            setupAnimationStates();
        }
    }


    private void setupAnimationStates(){
        if (idleAnimationTimeout <= 0){
            this.idleAnimationTimeout = this.random.nextInt(40) + 80;
            this.idleAnimationState.start(this.tickCount);
        }else {
            --this.idleAnimationTimeout;
        }


        if(this.isAttacking() && attackAnimationTimeout <= 0) {
            attackAnimationTimeout = 5; //Length in ticks of attack animation
            attackAnimationState.start(this.tickCount);
        }else {
            -- attackAnimationTimeout;
        }


        if (!this.isAttacking()) {
            attackAnimationState.stop();
        }
    }





    @Override
    protected void updateWalkAnimation(float pPartialTick) {
        float f;
        if (this.getPose() == Pose.STANDING){
            f = Math.min(pPartialTick * 6F, 1F);
        }else {
            f = 0f;
        }

        this.walkAnimation.update(f, 0.2f);
    }


    public void setAttacking(boolean attacking) {
        this.entityData.set(ATTACKING, attacking);
    }

    public boolean isAttacking() {
        return this.entityData.get(ATTACKING);
    }


    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(ATTACKING, false);
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(0, new FloatGoal(this));

        this.goalSelector.addGoal(1, new EndBruteAttackGoal(this, 0.75D, true));
        this.goalSelector.addGoal(2, new BreedGoal(this, 1.1f));
        this.goalSelector.addGoal(3, new TemptGoal(this, 1.2f, Ingredient.of(ModItems.CORRUPTED_DIAMOND.get()), false));


        this.goalSelector.addGoal(4, new FollowParentGoal(this, 1.1f));

        this.goalSelector.addGoal(5, new WaterAvoidingRandomStrollGoal(this, 1.1f));

        this.goalSelector.addGoal(6, new LookAtPlayerGoal(this, Player.class, 20f));

        this.goalSelector.addGoal(6, new RandomLookAroundGoal(this));

        this.targetSelector.addGoal(1, new HurtByTargetGoal(this));
    }

    public static AttributeSupplier.Builder createAttributes(){
        return Animal.createLivingAttributes()
                .add(Attributes.MAX_HEALTH, 125D)
                .add(Attributes.MOVEMENT_SPEED, 0.2D)
                .add(Attributes.ARMOR_TOUGHNESS, 9.9f)
                .add(Attributes.ATTACK_KNOCKBACK, 20.5f)
                .add(Attributes.KNOCKBACK_RESISTANCE, 10.5f)
                .add(Attributes.ATTACK_DAMAGE, 15.5f)
                .add(Attributes.FOLLOW_RANGE, 16)
                .add(Attributes.ATTACK_SPEED, 1);



    }



    @Nullable
    @Override
    public AgeableMob getBreedOffspring(ServerLevel pLevel, AgeableMob pOtherParent) {
        return ModEntities.END_BRUTE.get().create(pLevel);
    }

    @Override
    public boolean isFood(ItemStack pStack) {
        return pStack.is(ModItems.CORRUPTED_DIAMOND.get());
    }

    @Nullable
    @Override
    protected SoundEvent getAmbientSound() {
        return SoundEvents.ENDERMAN_AMBIENT;
    }

    @Nullable
    @Override
    protected SoundEvent getHurtSound(DamageSource pDamageSource) {
        return SoundEvents.RAVAGER_HURT;
    }

    @Nullable
    @Override
    protected SoundEvent getDeathSound() {
        return SoundEvents.ENDERMAN_SCREAM;
    }
}
