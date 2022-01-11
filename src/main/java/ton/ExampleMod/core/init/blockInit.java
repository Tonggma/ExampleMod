package ton.ExampleMod.core.init;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryBuilder;
import ton.ExampleMod.ExampleMod;
import ton.ExampleMod.common.block.exampleBlock;

import java.rmi.registry.Registry;

public class blockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ExampleMod.MODID);

    public static final RegistryObject<exampleBlock> EXAMPLE_BLOCK =
            BLOCKS.register("example_block", exampleBlock::new);
}
