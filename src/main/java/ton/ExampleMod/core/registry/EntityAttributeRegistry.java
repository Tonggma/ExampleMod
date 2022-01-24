package ton.ExampleMod.core.registry;

import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import ton.ExampleMod.common.entity.ExampleEntity;
import ton.ExampleMod.core.init.EntityInit;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EntityAttributeRegistry {
    @SubscribeEvent
    public static void setAttributes(EntityAttributeCreationEvent event) { //注册实体属性
        event.put(EntityInit.EXAMPLE_ENTITY.get(), ExampleEntity.func_234192_eI_().create());
    }
}
