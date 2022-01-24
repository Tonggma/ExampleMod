package ton.ExampleMod.common.entity;

import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.world.World;

public class ExampleEntity extends CreatureEntity{

    public ExampleEntity(World worldIn) {
        this(null, worldIn);
    }

    public ExampleEntity(EntityType<? extends CreatureEntity> type, World worldIn) {
        super(type, worldIn);
    }

    public static AttributeModifierMap.MutableAttribute func_234192_eI_() { //为实体构造属性
        return MobEntity.func_233666_p_().createMutableAttribute(Attributes.MOVEMENT_SPEED, //移动速度
                (double)0.3F).createMutableAttribute(Attributes.MAX_HEALTH, //最大生命值
                50.0D).createMutableAttribute(Attributes.FOLLOW_RANGE, //跟随范围
                32.0D).createMutableAttribute(Attributes.ATTACK_DAMAGE, //攻击伤害
                2.0D);
    }
}
