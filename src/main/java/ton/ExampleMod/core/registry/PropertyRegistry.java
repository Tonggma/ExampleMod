package ton.ExampleMod.core.registry;

import net.minecraft.item.ItemModelsProperties;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import ton.ExampleMod.ExampleMod;
import ton.ExampleMod.core.init.itemInit;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)

public class PropertyRegistry {
    @SubscribeEvent
    public static void propertyOverrideRegistry(FMLClientSetupEvent event) {
        event.enqueueWork(()->{
            ItemModelsProperties.registerProperty(itemInit.MAGIC_INGOT.get(),
                    new ResourceLocation(ExampleMod.MODID, "size"),
                    (itemStack, clientWorld, livingEntity)-> itemStack.getCount());
        });
    }
}
    //多人游戏
    //单人游戏 -> 客户端 -> 创建世界 -> 开启内置服务端 -> 逻辑服务器
    //                                          ->逻辑客户端

    //Minecraft -> Minecraft-1.16.5.jar -> 物理客户端 -> 逻辑服务器
    //                                              -> 逻辑客户端

    //多人游戏 -> 远程服务器 Minecraft-Server-1.16.5.jar -> 物理服务端 -> 逻辑服务端
    //物理客户端 -> 开启逻辑客户端