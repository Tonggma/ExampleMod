package ton.ExampleMod.core.registry;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import ton.ExampleMod.common.render.ExampleEntityRender;
import ton.ExampleMod.core.init.EntityInit;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class EntityRenderRegistry {
    @SubscribeEvent
    public static void onClientSetupEvent(FMLClientSetupEvent event) { //注册实体渲染事件
        event.enqueueWork(()->{
            Minecraft mc = Minecraft.getInstance(); //获得mc原版实例
            EntityRendererManager manager = mc.getRenderManager(); //获得mc实体渲染管理器
            manager.register(EntityInit.EXAMPLE_ENTITY.get(), new ExampleEntityRender(manager)); //注册实体渲染(EntityType<T>, EntityRenderer<? super T>)
        });
    }
}
