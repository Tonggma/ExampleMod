package ton.ExampleMod.core.registry;


import net.minecraft.entity.LivingEntity;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import ton.ExampleMod.core.init.effectInit;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class PotionRegistry {
    @SubscribeEvent
    public static void onLivingHurt(LivingHurtEvent event) {
        DamageSource source = event.getSource(); //创建伤害原变量
        if(source.getDamageType().equals("fall")) { //判断伤害原是否为摔落伤害
            LivingEntity entityLiving = event.getEntityLiving(); //获取目标实体
            Effect effect = effectInit.EXAMPLE_EFFECT.get(); //获取药水效果
            if(entityLiving.isPotionActive(effect)) { //判断实体是否拥有该药水效果
                EffectInstance activePotionEffect = entityLiving.getActivePotionEffect(effect); //创建正在进行的药水效果
                int level = activePotionEffect.getAmplifier(); //获取药水等级
                if(level == 0) { //判断药水等级是否等于1级
                    event.setAmount(event.getAmount()/2); //使实体受到的伤害减半
                }
                else {
                    event.setAmount(0); //若药水等级大于1，则使实体受到的摔落伤害设置为0
                }
            }
        }
    }
}
