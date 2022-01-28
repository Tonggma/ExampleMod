package ton.ExampleMod.common.entity;

import net.minecraft.block.Blocks;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.datafix.DataFixesManager;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.IServerWorld;
import net.minecraft.world.World;
import ton.ExampleMod.core.init.EntityInit;

import javax.annotation.Nullable;

public class ExampleEntity extends CreatureEntity{
    //实体type初始化
    public static final EntityType TYPE =
            EntityType.Builder.<ExampleEntity>create(ExampleEntity::new,
                    EntityClassification.MONSTER).size(1.2f, 1.95f).build("example_entity");

    //存储颜色字段
    private static final DataParameter<Byte> COLOR = EntityDataManager.createKey(ExampleEntity.class, DataSerializers.BYTE);

    public ExampleEntity(World worldIn) {
        this(EntityInit.EXAMPLE_ENTITY.get(), worldIn);
    }
    //构建实体
    public ExampleEntity(EntityType<? extends CreatureEntity> type, World worldIn) {
        super(type, worldIn);
    }

    public byte getColor() {
        return this.getDataManager().get(COLOR);
    }

    @Override
    protected void registerData() {
        super.registerData();
        this.getDataManager().register(COLOR,(byte)0);
    }

    public static AttributeModifierMap.MutableAttribute func_234192_eI_() { //为实体构造属性
        return MobEntity.func_233666_p_().createMutableAttribute(Attributes.MOVEMENT_SPEED, //移动速度
                (double)0.3F).createMutableAttribute(Attributes.MAX_HEALTH, //最大生命值
                50.0D).createMutableAttribute(Attributes.FOLLOW_RANGE, //跟随范围
                32.0D).createMutableAttribute(Attributes.ATTACK_DAMAGE, //攻击伤害
                2.0D);
    }

    @Nullable
    @Override
    public ILivingEntityData onInitialSpawn(IServerWorld worldIn, DifficultyInstance difficultyIn, SpawnReason reason, @Nullable ILivingEntityData spawnDataIn, @Nullable CompoundNBT dataTag) {
        //生物初始化
        this.getDataManager().set(COLOR, (byte)this.rand.nextInt(3));
        return super.onInitialSpawn(worldIn, difficultyIn, reason, spawnDataIn, dataTag);
    }

    //AI编写
    @Override
    protected void registerGoals() {
        //原版AI
        super.registerGoals();
        this.goalSelector.addGoal(0, new SwimGoal(this));
        this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.0, false));
        this.goalSelector.addGoal(2, new WaterAvoidingRandomWalkingGoal(this, 0.8));
        this.goalSelector.addGoal(3, new ChangeGrassToDirt(this)); //添加的AI
        this.goalSelector.addGoal(4, new LookAtGoal(this, PlayerEntity.class, 8));
        this.goalSelector.addGoal(5, new LookRandomlyGoal(this));

        this.targetSelector.addGoal(0, new HurtByTargetGoal(this));
    }
    //AI:将脚下的草方块变为泥土
    private static class ChangeGrassToDirt extends Goal {
        private final ExampleEntity entity;

        public ChangeGrassToDirt(ExampleEntity entity) {
            this.entity = entity;
        }

        @Override
        //开始执行
        public void startExecuting() {
            super.startExecuting();
            BlockPos blockpos = new BlockPos(entity.getPosX(), entity.getPosY()-0.2, entity.getPosZ());
            this.entity.world.setBlockState(blockpos, Blocks.DIRT.getDefaultState());
        }

        @Override
        //执行判断
        public boolean shouldExecute() {
            BlockPos blockpos = new BlockPos(entity.getPosX(), entity.getPosY()-0.2, entity.getPosZ());
            return this.entity.world.getBlockState(blockpos).getBlock() == Blocks.GRASS_BLOCK;
        }
    }

    @Override
    public void writeAdditional(CompoundNBT compound) {
        super.writeAdditional(compound);
        compound.putByte("color", this.getDataManager().get(COLOR));
    }

    @Override
    public void readAdditional(CompoundNBT compound) {
        super.readAdditional(compound);
        this.getDataManager().set(COLOR, compound.getByte("color"));
    }
}
