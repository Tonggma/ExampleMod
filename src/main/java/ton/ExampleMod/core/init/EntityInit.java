package ton.ExampleMod.core.init;

import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import ton.ExampleMod.ExampleMod;
import ton.ExampleMod.common.entity.ExampleEntity;

public class EntityInit {
    public static final DeferredRegister<EntityType<?>> ENTITIES =
            DeferredRegister.create(ForgeRegistries.ENTITIES, ExampleMod.MODID);

    public static final RegistryObject<EntityType<ExampleEntity>> EXAMPLE_ENTITY =
            ENTITIES.register("example_entity", ()->ExampleEntity.TYPE);
}
