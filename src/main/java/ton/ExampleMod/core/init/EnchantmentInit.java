package ton.ExampleMod.core.init;

import net.minecraft.enchantment.Enchantment;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import ton.ExampleMod.ExampleMod;
import ton.ExampleMod.common.enchantment.ExampleEnchantment;

public class EnchantmentInit {
    public static final DeferredRegister<Enchantment> ENCHANTMENTS =
            DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, ExampleMod.MODID);

    public static final RegistryObject<Enchantment> EXAMPLE_ENCHANTMENT =
            ENCHANTMENTS.register("example_enchantment", ExampleEnchantment::new);
}
