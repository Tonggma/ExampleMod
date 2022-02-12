package ton.ExampleMod.core.registry;


import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.Explosion;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import ton.ExampleMod.core.init.EnchantmentInit;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class EnchantmentRegistry {
    @SubscribeEvent
    public static void onLivingDeath(LivingDeathEvent event) { //监听实体死亡事件
        Entity source = event.getSource().getImmediateSource(); //获取被造成伤害的实体(玩家)
        if(source instanceof PlayerEntity) { //判定source是否为PlayerEntity类
            PlayerEntity player = (PlayerEntity) source; //声明玩家
            ItemStack heldItem = player.getHeldItemMainhand(); //获取物品栏中主手物品
            int level = EnchantmentHelper.getEnchantmentLevel(EnchantmentInit.EXAMPLE_ENCHANTMENT.get(), heldItem); //获取example_enchantment附魔等级
            if(level>0) { //判断是否附魔
                Entity entity = event.getEntity(); //获取目标实体
                entity.world.createExplosion(null, entity.getPosX(), entity.getPosY(), entity.getPosZ(), (float) (level*0.4), Explosion.Mode.NONE);
                //创建爆炸效果
            }
        }
    }
}
