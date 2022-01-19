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
        DamageSource source = event.getSource();
        if(source.getDamageType().equals("fall")) {
            LivingEntity entityLiving = event.getEntityLiving();
            Effect effect = effectInit.EXAMPLE_EFFECT.get();
            if(entityLiving.isPotionActive(effect)) {
                EffectInstance activePotionEffect = entityLiving.getActivePotionEffect(effect);
                int level = activePotionEffect.getAmplifier();
                if(level == 0) {
                    event.setAmount(event.getAmount()/2);
                }
                else {
                    event.setAmount(0);
                }
            }
        }
    }
}
