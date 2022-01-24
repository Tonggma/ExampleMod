package ton.ExampleMod.core.init;

import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import ton.ExampleMod.ExampleMod;
import ton.ExampleMod.common.block.ExampleBlock;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ExampleMod.MODID);

    public static final RegistryObject<ExampleBlock> EXAMPLE_BLOCK =
            BLOCKS.register("example_block", ExampleBlock::new);
}
