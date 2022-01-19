package ton.ExampleMod.core.init;

import net.minecraft.potion.Effect;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import ton.ExampleMod.ExampleMod;
import ton.ExampleMod.common.effect.exampleEffect;

public class effectInit {
    public static final DeferredRegister<Effect> EFFECTS =
            DeferredRegister.create(ForgeRegistries.POTIONS, ExampleMod.MODID);

    public static final RegistryObject<Effect> EXAMPLE_EFFECT =
            EFFECTS.register("example_effect", exampleEffect::new);
}
