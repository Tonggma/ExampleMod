package ton.ExampleMod.core.init;

import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Potion;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import ton.ExampleMod.ExampleMod;
import ton.ExampleMod.common.potion.examplePotion;

public class potionInit {
    public static final DeferredRegister<Potion> POTION_TYPES =
            DeferredRegister.create(ForgeRegistries.POTION_TYPES, ExampleMod.MODID);

            public static final RegistryObject<Potion> EXAMPLE_POTION =
                    POTION_TYPES.register("example_potion", examplePotion::new);

            public static final RegistryObject<Potion> STRONG_EXAMPLE_POTION =
                    POTION_TYPES.register("strong_example_potion",
                            ()-> new Potion(new EffectInstance(effectInit.EXAMPLE_EFFECT.get(), 1800, 1)));

            public static final RegistryObject<Potion> LONG_EXAMPLE_POTION =
                    POTION_TYPES.register("long_example_potion",
                            ()-> new Potion(new EffectInstance(effectInit.EXAMPLE_EFFECT.get(), 3200, 0)));
}
