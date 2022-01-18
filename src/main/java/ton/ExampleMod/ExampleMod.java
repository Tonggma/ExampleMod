package ton.ExampleMod;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ton.ExampleMod.core.init.blockInit;
import ton.ExampleMod.core.init.enchantmentInit;
import ton.ExampleMod.core.init.itemInit;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(ExampleMod.MODID)
public class ExampleMod {

    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MODID = "examplemod";

    public ExampleMod() {
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        itemInit.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        blockInit.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        enchantmentInit.ENCHANTMENTS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}